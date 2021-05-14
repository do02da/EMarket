package com.user.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
public class UserDTO {
    @Id
    private String email;
    private String pw;
    private String name;
    private boolean isAdmin;
    private String tel;
    private String postalCode;
    private String address;


}
