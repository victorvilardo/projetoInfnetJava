package infnet.com.br.projetoInfnetJava.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serial;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class QuartoCasal extends Quarto{

    @Serial
    private static final long serialVersionUID = 1L;

}
