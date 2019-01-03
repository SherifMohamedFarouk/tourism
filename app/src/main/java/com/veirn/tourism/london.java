package com.veirn.tourism;

import android.os.Parcel;
import android.os.Parcelable;

public class london implements Parcelable {

    private String name ;
    private String rating ;
    private String Littledescrp ;
    private String description ;
    private String direction;
    private String wkipdeia ;

    public london(String name, String rating, String littledescrp, String description, String wkipdeia) {
        this.name = name;
        this.rating = rating;
        Littledescrp = littledescrp;
        this.description = description;

        this.wkipdeia = wkipdeia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLittledescrp() {
        return Littledescrp;
    }

    public void setLittledescrp(String littledescrp) {
        Littledescrp = littledescrp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getWkipdeia() {
        return wkipdeia;
    }

    public void setWkipdeia(String wkipdeia) {
        this.wkipdeia = wkipdeia;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.rating);
        dest.writeString(this.Littledescrp);
        dest.writeString(this.description);
        dest.writeString(this.direction);
        dest.writeString(this.wkipdeia);
    }

    protected london(Parcel in) {
        this.name = in.readString();
        this.rating = in.readString();
        this.Littledescrp = in.readString();
        this.description = in.readString();
        this.direction = in.readString();
        this.wkipdeia = in.readString();
    }

    public static final Parcelable.Creator<london> CREATOR = new Parcelable.Creator<london>() {
        @Override
        public london createFromParcel(Parcel source) {
            return new london(source);
        }

        @Override
        public london[] newArray(int size) {
            return new london[size];
        }
    };
}
