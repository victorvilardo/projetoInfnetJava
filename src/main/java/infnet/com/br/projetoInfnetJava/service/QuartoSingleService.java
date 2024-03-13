package infnet.com.br.projetoInfnetJava.service;

import infnet.com.br.projetoInfnetJava.model.QuartoSingle;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface QuartoSingleService {
    void save(QuartoSingle quartoSingle);
    List<QuartoSingle> findAll();
    Optional<QuartoSingle> findById(Long id);
    QuartoSingle update(Long id, QuartoSingle atualizado);
    void deleteById(Long id);
}
