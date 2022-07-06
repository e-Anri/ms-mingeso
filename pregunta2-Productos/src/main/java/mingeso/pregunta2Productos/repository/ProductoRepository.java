package mingeso.pregunta2Productos.repository;

import mingeso.pregunta2Productos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
