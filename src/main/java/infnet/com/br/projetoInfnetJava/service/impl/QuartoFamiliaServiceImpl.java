package infnet.com.br.projetoInfnetJava.service.impl;

import infnet.com.br.projetoInfnetJava.model.QuartoFamilia;
import infnet.com.br.projetoInfnetJava.repository.QuartoFamiliaRepository;
import infnet.com.br.projetoInfnetJava.service.QuartoFamiliaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class QuartoFamiliaServiceImpl implements QuartoFamiliaService {
    @Autowired
    QuartoFamiliaRepository QuartoFamiliaRepository;
    @Override
    public void save(QuartoFamilia QuartoFamilia) {
        QuartoFamiliaRepository.save(QuartoFamilia);
    }

    @Override
    public List<QuartoFamilia> findAll() {
        return QuartoFamiliaRepository.findAll();
    }

    @Override
    public Optional<QuartoFamilia> findById(Long id) {
        return QuartoFamiliaRepository.findById(id);
    }

    @Override
    public QuartoFamilia update(Long id, QuartoFamilia atualizada) {
        atualizada.setId(id);
        return QuartoFamiliaRepository.save(atualizada);
    }

    @Override
    public void deleteById(Long id) {
        QuartoFamiliaRepository.deleteById(id);

    }
}
