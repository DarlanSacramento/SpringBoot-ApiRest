package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoasRepository extends JpaRepository<PessoaEntity, Integer> {

    @Query(value = "select * from pessoas order by nome asc", nativeQuery = true)
    List<PessoaEntity> findAllPessoas();

    PessoaEntity findById(Long id);

}

