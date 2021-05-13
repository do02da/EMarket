package com.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class UserDTO {
    private String email;
    private String pw;
    private String name;
    private boolean isAdmin;
    private String tel;
    private String postalCode;
    private String address;

}
