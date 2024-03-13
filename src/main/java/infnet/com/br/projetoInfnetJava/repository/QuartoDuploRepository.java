package infnet.com.br.projetoInfnetJava.repository;

import infnet.com.br.projetoInfnetJava.model.QuartoDuplo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartoDuploRepository extends JpaRepository<QuartoDuplo,Long> {
}
