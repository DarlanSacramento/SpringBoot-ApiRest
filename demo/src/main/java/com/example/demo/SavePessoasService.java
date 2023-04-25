package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public interface SavePessoasService {

    void save(PessoaEntity pessoa);

}

