package infnet.com.br.projetoInfnetJava.service;

import infnet.com.br.projetoInfnetJava.model.QuartoDuplo;
import infnet.com.br.projetoInfnetJava.model.QuartoSingle;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface QuartoDuploService {
    void save(QuartoDuplo quartoDuplo);
    List<QuartoDuplo> findAll();
    Optional<QuartoDuplo> findById(Long id);
    QuartoDuplo update(Long id, QuartoDuplo atualizado);
    void deleteById(Long id);
}
