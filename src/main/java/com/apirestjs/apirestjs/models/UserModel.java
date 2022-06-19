package com.apirestjs.apirestjs.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserModel implements Serializable {

    private Integer id;

    private String firstName;

    private String lastName;

    private String cpf;

    private String birthDate;

    private String email;
}
