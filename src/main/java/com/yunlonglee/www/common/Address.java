package com.yunlonglee.www.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by lijie on 3/29/16.
 */
@Getter
@Setter
public class Address implements Serializable{

    private static final long serialVersionUID = 4550079771207530981L;

    private String line1;

    private String line2;

    private String zipCode;

    private String city;

    private String country;

    public Address(){}

    public Address(String line1, String line2, String zipCode, String city, String country) {
        super();
        this.line1 = line1;
        this.line2 = line2;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }
}
