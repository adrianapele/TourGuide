package com.example.adriana.tourguide;

/**
 * Created by Adriana on 6/3/2018.
 */

public class MyPlace
{
    private String name;
    private String address;
    private String phone;
    private int imgResource;

    public MyPlace(String name, String address, String phone, int imgResource) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.imgResource = imgResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }
}
