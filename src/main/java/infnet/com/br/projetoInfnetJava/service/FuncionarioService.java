package infnet.com.br.projetoInfnetJava.service;

import infnet.com.br.projetoInfnetJava.model.Funcionario;

import java.util.List;

public interface FuncionarioService {

     List<Funcionario> getAllFuncionarios();

     Funcionario getFuncionarioById(Long id);

     void saveFuncionario(Funcionario funcionario);

     void deleteFuncionario(Long id);
}
