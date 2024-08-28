import java.util.ArrayList;

public class Producto {
    private  static  int contadorProductos = 0;
    private  int idProducto;
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio){
        contadorProductos ++;
        idProducto = contadorProductos;
        this.nombre = nombre;
        this.precio = precio;

    }

    // Getter & Setter
    public int getIdProducto(){
        return idProducto;
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

    // Metodos


}
