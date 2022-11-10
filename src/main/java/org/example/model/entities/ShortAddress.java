package org.example.model.entities;

public class ShortAddress {

    public String completeAddress;

    public ShortAddress() {
    }

    public ShortAddress(String completeAddress) {
        this.completeAddress = completeAddress;
    }

    @Override
    public String toString() {
        return "Address{" + "completeAddress=" + completeAddress +'}';
    }
}
