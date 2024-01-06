package com.fanapCampus.session6;

import java.util.HashMap;

public class Country {
    String countryName;
    String countryCode;
    Integer countryPopulation;

    public Country() {
    }

    public Country(String countryCode, String countryName) {
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    public Country(String countryCode, String countryName, Integer countryPopulation) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryPopulation = countryPopulation;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(Integer countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public String findKey(String key, HashMap<String, String> hashMap) {
        String value = "Not Found";

        if (hashMap.containsKey(key)) {
            value = hashMap.get(key);
        }
        return value;

    }
}
