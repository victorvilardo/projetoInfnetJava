package infnet.com.br.projetoInfnetJava.repository;

import infnet.com.br.projetoInfnetJava.model.QuartoFamilia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartoFamiliaRepository extends JpaRepository<QuartoFamilia,Long> {
}
