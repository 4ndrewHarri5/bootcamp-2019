package com.manchesterDigital;

public class Address  {

    private final String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private final String city;
    private final String town;
    private final String postcode;

    public Address(String addressLine1, String city, String town, String postcode) {
        this.addressLine1 = addressLine1;
        this.city = city;
        this.town = town;
        this.postcode = postcode;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", addressLine3='" + addressLine3 + '\'' +
                ", addressLine4='" + addressLine4 + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
