package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "demo_user")
public class User {
    public User(){}
    public User(@Email @Size(max = 40) String email, @NotBlank @Size(max = 100) @NotNull String password, @NotNull LoginMethodEnum loginMethodEnum
    ,@NotNull String userRole) {
        this.email = email;
        this.password = password;
        this.loginMethodEnum = loginMethodEnum;
        this.userRole = userRole;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @Size(max = 40)
    private String email;

    @NotBlank
    @Size(max = 100)
    @NotNull
    private String password;

    //for simplicity a simple string variable, for multiple roles need list
    private String userRole;

    @NotNull
    @Enumerated(EnumType.STRING)
    private LoginMethodEnum loginMethodEnum;
}
