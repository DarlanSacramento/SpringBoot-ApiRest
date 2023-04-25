package com.example.demo;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@AllArgsConstructor
public class PessoasControler {


    @Autowired
    private final PessoasRepository repository;

    private ListPessoasService listPessoas;

    @GetMapping("/pessoas")
    public List<PessoaEntity> listaPessoas(){
        return repository.findAll();
    }

    @GetMapping("/pessoa/{id}")
    public PessoaEntity listaPessoaUnico(@PathVariable(value = "id") Long id) {
        return repository.findById(id);
    }

    @PostMapping("/pessoas/salvar")
    public ResponseEntity<PessoaEntity> salvar(@RequestBody PessoaEntity pessoa){
        return ResponseEntity.ok(repository.save(pessoa));
    }

    @DeleteMapping("/pessoas")
    public void deletarPessoa(@RequestBody PessoaEntity pessoa) {
        repository.delete(pessoa);
    }

    @PutMapping("/pessoas")
    public PessoaEntity atualizaPessoa(@RequestBody PessoaEntity pessoa) {
        return repository.save(pessoa);
    }

}