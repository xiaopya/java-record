package com.itxiaopy.pojo;

/**
 * @projectName: java学习记录
 * @package: com.itxiaopy.pojo
 * @className: Address
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/24 19:40
 * @version: 1.0
 */
public class Address {
    private String province;
    private String city;

    public Address() {
    }

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
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

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
