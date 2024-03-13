package infnet.com.br.projetoInfnetJava.service.impl;

import infnet.com.br.projetoInfnetJava.model.QuartoSingle;
import infnet.com.br.projetoInfnetJava.repository.QuartoSingleRepository;
import infnet.com.br.projetoInfnetJava.service.QuartoSingleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuartoSingleServiceImpl implements QuartoSingleService {
    @Autowired
    QuartoSingleRepository quartoSingleRepository;

    @Override
    public void save(QuartoSingle quartoSingle) {
        quartoSingleRepository.save(quartoSingle);
    }

    @Override
    public List<QuartoSingle> findAll() {
        return quartoSingleRepository.findAll();
    }

    @Override
    public Optional<QuartoSingle> findById(Long id) {
        return quartoSingleRepository.findById(id);
    }

    @Override
    public QuartoSingle update(Long id, QuartoSingle atualizada) {
        atualizada.setId(id);
        return quartoSingleRepository.save(atualizada);
    }

    @Override
    public void deleteById(Long id) {
        quartoSingleRepository.deleteById(id);

    }
}
