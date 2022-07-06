package mingeso.pregunta2Productos.service;

import mingeso.pregunta2Productos.entity.Producto;

import java.util.List;

public interface ProductoService {
    public List<Producto> getAllProductos();
    public Producto getProducto(long id);
    public Producto createProducto(Producto producto);
    public Producto updateProducto(Producto producto);
    public Producto deleteProducto(long id);
}
