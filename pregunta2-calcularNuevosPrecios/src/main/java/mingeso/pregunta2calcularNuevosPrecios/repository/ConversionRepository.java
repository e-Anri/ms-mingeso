package mingeso.pregunta2calcularNuevosPrecios.repository;

import mingeso.pregunta2calcularNuevosPrecios.entity.Conversion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversionRepository extends JpaRepository<Conversion, Long> {
}
