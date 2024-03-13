package infnet.com.br.projetoInfnetJava.repository;

import infnet.com.br.projetoInfnetJava.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}