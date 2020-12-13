package br.com.viniciusmargotti.vinicius.resources;

import br.com.viniciusmargotti.vinicius.models.Arquivo;
import br.com.viniciusmargotti.vinicius.repository.ArquivoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Arquivos")
public class ArquivoResource {

    @Autowired
    private ArquivoRepository arquivoRepository;

    @ApiOperation(value="Salva um arquivo")
    @PostMapping("/arquivos")
    public Arquivo saveArquivo(@RequestBody @Valid Arquivo arquivo) {
        return arquivoRepository.save(arquivo);
    }

    @ApiOperation(value="Busca todos os arquivos")
    @GetMapping("/arquivos")
    public List<Arquivo> getAll() {
        return arquivoRepository.findAll();
    }


}
