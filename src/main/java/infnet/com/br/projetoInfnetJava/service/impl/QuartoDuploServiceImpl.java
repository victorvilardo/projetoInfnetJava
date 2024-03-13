package infnet.com.br.projetoInfnetJava.service.impl;

import infnet.com.br.projetoInfnetJava.model.QuartoDuplo;
import infnet.com.br.projetoInfnetJava.repository.QuartoDuploRepository;
import infnet.com.br.projetoInfnetJava.service.QuartoDuploService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class QuartoDuploServiceImpl implements QuartoDuploService {
    @Autowired
    QuartoDuploRepository quartoDuploRepository;
    @Override
    public void save(QuartoDuplo quartoDuplo) {
        quartoDuploRepository.save(quartoDuplo);
    }

    @Override
    public List<QuartoDuplo> findAll() {
        return quartoDuploRepository.findAll();
    }

    @Override
    public Optional<QuartoDuplo> findById(Long id) {
        return quartoDuploRepository.findById(id);
    }

    @Override
    public QuartoDuplo update(Long id, QuartoDuplo atualizada) {
        atualizada.setId(id);
        return quartoDuploRepository.save(atualizada);
    }

    @Override
    public void deleteById(Long id) {
        quartoDuploRepository.deleteById(id);

    }
}
