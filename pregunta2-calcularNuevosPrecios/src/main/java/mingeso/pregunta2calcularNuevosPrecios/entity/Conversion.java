package mingeso.pregunta2calcularNuevosPrecios.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "conversion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conversion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private float precioCLP;
    private float precioUSD;
    private float precioEUR;
    private String estado;
}
