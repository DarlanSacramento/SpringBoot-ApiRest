package com.example.demo;

public class SavePessoasServiceimpl implements SavePessoasService {

    private PessoasRepository pessoasRepository;

    @Override
    public void save(PessoaEntity pessoa) {
        pessoasRepository.save(pessoa);
    }

}
