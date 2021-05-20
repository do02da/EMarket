package com.user.db;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
