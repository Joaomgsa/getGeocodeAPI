package org.example.model.entities;

public class Address {

    public String publicPlace;
    public String district;
    public String city;
    public String placeNumber;
    public String country;

    public Address() {
    }

    public Address(String publicPlace, String district, String city, String placeNumber, String country) {
        this.publicPlace = publicPlace;
        this.district = district;
        this.city = city;
        this.placeNumber = placeNumber;
        this.country = country;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(String placeNumber) {
        this.placeNumber = placeNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" + "publicPlace=" + publicPlace + ", district="+ district+ ", city="+ city + ", placeNumber="+ placeNumber +
                ", country=" + country +'}';
    }
}
