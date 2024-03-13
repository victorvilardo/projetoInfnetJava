package infnet.com.br.projetoInfnetJava.service.impl;

import infnet.com.br.projetoInfnetJava.model.Funcionario;
import infnet.com.br.projetoInfnetJava.repository.FuncionarioRepository;
import infnet.com.br.projetoInfnetJava.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario getFuncionarioById(Long id) {
        return funcionarioRepository.findById(id).orElse(null);
    }

    @Override
    public void saveFuncionario(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }
    @Override
    public void deleteFuncionario(Long id) {
        funcionarioRepository.deleteById(id);
    }
}