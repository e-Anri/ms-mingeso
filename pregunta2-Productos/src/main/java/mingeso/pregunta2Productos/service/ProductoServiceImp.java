package mingeso.pregunta2Productos.service;

import mingeso.pregunta2Productos.entity.Producto;
import mingeso.pregunta2Productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImp implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto getProducto(long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto createProducto(Producto producto) {
        producto.setEstado("CREATED");
        return productoRepository.save(producto);
    }

    @Override
    public Producto updateProducto(Producto producto) {
        Producto producto1 = getProducto(producto.getId());
        if (null == producto1){
            return null;
        }

        producto1.setNombre(producto.getNombre());
        producto1.setPrecioCLP(producto.getPrecioCLP());

        return productoRepository.save(producto1);
    }

    @Override
    public Producto deleteProducto(long id) {
        Producto producto1 = getProducto(id);
        if (null == producto1){
            return null;
        }

        producto1.setEstado("DELETED");
        return productoRepository.save(producto1);
    }
}
