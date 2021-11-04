package kg.geektech.kyrgyzstanstory.ui.models;

public class PhoneNumberModel {
    private String code, city, country;

    public PhoneNumberModel(String code, String city, String country) {
        this.code = code;
        this.city = city;
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
