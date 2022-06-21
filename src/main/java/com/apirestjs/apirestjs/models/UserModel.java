package com.apirestjs.apirestjs.models;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@NotNull
@Data
public class UserModel implements Serializable {

    private Integer id;

    private String firstName;

    private String lastName;

    @CPF
    private String cpf;

    private String birthDate;

    @Email
    private String email;
}
