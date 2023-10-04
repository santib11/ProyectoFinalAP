
package Model;

public class Producto {
    private int idProducto;
    private int codigo;
    private int stock;
    private String nombre;
    private double precio;
    
    public Producto() {
    }
        
    public Producto(int codigo, int cantidad, String nombre, double precio) {
        this.codigo = codigo;
        this.stock = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(int idProducto, int codigo, int cantidad, String nombre, double precio) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.stock = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
   
}
