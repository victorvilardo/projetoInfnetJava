package infnet.com.br.projetoInfnetJava.service;

import infnet.com.br.projetoInfnetJava.model.QuartoFamilia;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface QuartoFamiliaService {
    void save(QuartoFamilia QuartoFamilia);
    List<QuartoFamilia> findAll();
    Optional<QuartoFamilia> findById(Long id);
    QuartoFamilia update(Long id, QuartoFamilia atualizado);
    void deleteById(Long id);
}
