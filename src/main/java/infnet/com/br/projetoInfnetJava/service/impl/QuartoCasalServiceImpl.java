package infnet.com.br.projetoInfnetJava.service.impl;

import infnet.com.br.projetoInfnetJava.model.QuartoCasal;
import infnet.com.br.projetoInfnetJava.repository.QuartoCasalRepository;
import infnet.com.br.projetoInfnetJava.service.QuartoCasalService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class QuartoCasalServiceImpl implements QuartoCasalService {
    @Autowired
    QuartoCasalRepository quartoCasalRepository;
    @Override
    public void save(QuartoCasal quartoCasal) {
        quartoCasalRepository.save(quartoCasal);
    }

    @Override
    public List<QuartoCasal> findAll() {
        return quartoCasalRepository.findAll();
    }

    @Override
    public Optional<QuartoCasal> findById(Long id) {
        return quartoCasalRepository.findById(id);
    }

    @Override
    public QuartoCasal update(Long id, QuartoCasal atualizada) {
        atualizada.setId(id);
        return quartoCasalRepository.save(atualizada);
    }

    @Override
    public void deleteById(Long id) {
        quartoCasalRepository.deleteById(id);

    }
}
