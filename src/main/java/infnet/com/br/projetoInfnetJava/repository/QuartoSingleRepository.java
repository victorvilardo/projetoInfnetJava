package infnet.com.br.projetoInfnetJava.repository;

import infnet.com.br.projetoInfnetJava.model.QuartoSingle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuartoSingleRepository extends JpaRepository<QuartoSingle,Long> {

}
