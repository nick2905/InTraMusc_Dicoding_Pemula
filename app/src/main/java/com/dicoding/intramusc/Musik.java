package com.dicoding.intramusc;

import android.os.Parcel;
import android.os.Parcelable;

public class Musik implements Parcelable{
    private String name, remarks, photo, desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.desc);
    }

    public Musik() {
    }
    protected Musik(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
        this.desc = in.readString();
    }
    public static final Parcelable.Creator<Musik> CREATOR = new Parcelable.Creator<Musik>() {
        @Override
        public Musik createFromParcel(Parcel source) {
            return new Musik(source);
        }
        @Override
        public Musik[] newArray(int size) {
            return new Musik[size];
        }
    };

}
