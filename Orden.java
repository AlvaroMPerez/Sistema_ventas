import java.util.ArrayList;

public class Orden {
    private static int contadorOrdenes;
    private int idOrden;
    private static final int MAX_PRODUCTOS= 10;
    private Producto[] productos;
    private int contadorProductos;


    // Cosntructor

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
        this.contadorProductos = 0;
    }

    // Getters y setters


    public int getIdOrden() {
        return idOrden;
    }


    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getContadorProductos() {
        return contadorProductos;
    }

    public void setContadorProductos(int contadorProductos) {
        this.contadorProductos = contadorProductos;
    }

    // Metodos

    public static  void eliminarProdutoPorId(ArrayList<Producto> listaProdcutos, int id){
        for (int i= 0; i < listaProdcutos.size(); i++){
            Producto producto = listaProdcutos.get(i);
            if (producto.getIdProducto() == id){
                listaProdcutos.remove(i);
                System.out.println("Producto con Id " + id + producto.getNombre() + ", se ha eliminado correctamente");
                return;
            }else{
                System.out.println("Id no encontrado no encontrado");
            }
        }
    }


}
