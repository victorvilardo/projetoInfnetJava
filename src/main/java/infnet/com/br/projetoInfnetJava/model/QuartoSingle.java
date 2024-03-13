package infnet.com.br.projetoInfnetJava.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serial;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class QuartoSingle extends Quarto{

    @Serial
    private static final long serialVersionUID = 1L;

}
