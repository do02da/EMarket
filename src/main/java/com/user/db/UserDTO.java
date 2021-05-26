package com.user.db;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @Id
    @NonNull
    private String email;
    @NonNull
    private String pw;
    private String name;
    private boolean isAdmin;
    private String tel;
    private String postalCode;
    private String address;
}
