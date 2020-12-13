package br.com.viniciusmargotti.vinicius.repository;

import br.com.viniciusmargotti.vinicius.models.Arquivo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArquivoRepository extends MongoRepository<Arquivo, Long> {
}
