package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

/**
 * @author Panda
 * @date 6/22/2021
 */
public class Address {
    private String province;
    private String city;

    public Address(String address) {
        this.province = address.substring(0, address.indexOf("省"));;
        this.city = address.substring(address.indexOf("省") + 1, address.indexOf("市"));;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
