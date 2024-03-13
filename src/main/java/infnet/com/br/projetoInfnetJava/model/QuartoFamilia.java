package infnet.com.br.projetoInfnetJava.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class QuartoFamilia extends Quarto{

    @Serial
    private static final long serialVersionUID = 1L;

}
