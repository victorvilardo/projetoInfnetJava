package infnet.com.br.projetoInfnetJava.service;

import infnet.com.br.projetoInfnetJava.model.QuartoCasal;

import java.util.List;
import java.util.Optional;

public interface QuartoCasalService {
    void save(QuartoCasal quartoCasal);
    List<QuartoCasal> findAll();
    Optional<QuartoCasal> findById(Long id);
    QuartoCasal update(Long id, QuartoCasal atualizado);
    void deleteById(Long id);
}
