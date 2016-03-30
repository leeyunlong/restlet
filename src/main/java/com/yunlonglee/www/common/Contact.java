package com.yunlonglee.www.common;

import com.yunlonglee.www.common.Address;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by lijie on 3/29/16.
 */
@Getter
@Setter
public class Contact implements Serializable {
    private static final long serialVersionUID = 7287812599785578874L;

    private String firstName;
    private String lastName;
    private Address homeAddress;
    private int age;
    public Contact() {
    }

    public Contact(String firstName, String lastName, Address homeAddress,
                   int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.age = age;
    }
}
