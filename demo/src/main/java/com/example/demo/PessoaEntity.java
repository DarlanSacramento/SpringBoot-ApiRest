package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


    @Entity(name = "pessoa")
    @Table(name = "pessoas")
    @Getter
    @Setter
    @ToString
    public class PessoaEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(length = 100, nullable = false)
        private String cpf;
        private String nome;

    }