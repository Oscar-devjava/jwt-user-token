package com.oscardevjava.springsecurity.jwt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "USERS")
public class User {
    private String username;
    private String password;
}
