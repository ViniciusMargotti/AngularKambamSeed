package br.com.viniciusmargotti.vinicius.services;

import br.com.viniciusmargotti.vinicius.models.Arquivo;
import br.com.viniciusmargotti.vinicius.repository.ArquivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArquivoService {
 
    @Autowired
    private ArquivoRepository arquivoRepository;
 
    public void salvar(String nome, String conteudo) {
        arquivoRepository.save(new Arquivo(nome, conteudo));
    }
 
    public List<Arquivo> findAll() {
       return arquivoRepository.findAll();
    }
 
    public long count() {
        return arquivoRepository.count();
    }
 
    public Optional<Arquivo> findById(Long id) {
        return arquivoRepository.findById(id);
    }

}