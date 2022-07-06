package mingeso.pregunta2Productos.controller;

import mingeso.pregunta2Productos.entity.Producto;
import mingeso.pregunta2Productos.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> listaProductos() {
        List<Producto> productos = productoService.getAllProductos();
        if(productos.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(productos);
    }
}
