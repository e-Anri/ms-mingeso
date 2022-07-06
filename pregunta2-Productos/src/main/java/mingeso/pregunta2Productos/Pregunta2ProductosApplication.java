package mingeso.pregunta2Productos;

import mingeso.pregunta2Productos.entity.Producto;
import mingeso.pregunta2Productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Pregunta2ProductosApplication implements CommandLineRunner {

	@Autowired
	ProductoRepository producto;
	public static void main(String[] args) {
		SpringApplication.run(Pregunta2ProductosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Producto producto1 = new Producto(1, "zapatos", 39990, "CREATED");
		Producto producto2 = new Producto(2, "lapiz", 500, "CREATED");
		Producto producto3 = new Producto(3, "AirPods Pro", 210990, "CREATED");

		producto.save(producto1);
		producto.save(producto2);
		producto.save(producto3);
	}
}