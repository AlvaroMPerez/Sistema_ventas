import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Orden> listaOrdenes = new ArrayList<>();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        System.out.println("*** Sistema de ventas ***");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("""
                1. Generar orden
                2. Eliminar orden
                3. Crear producto
                4. Eliminar Producto
                5. Ver ordenes del día
                6. Ver Productos totales
                7. Agregar producto a la orden
                8. Salir
                """);
            System.out.println("Selecciona un numero entre 1 y 7");

            int usuarioEleccion = scanner.nextInt();

            if (usuarioEleccion <= 0 || usuarioEleccion > 8 ){
                System.out.println("Error, ingrese una numero valido");
                continue;
            }
            switch (usuarioEleccion){
                case 1:
                    System.out.println("Generar orden");
                    Orden nuevaOrden = new Orden();
                    listaOrdenes.add(nuevaOrden);
                    System.out.println("Orden ID: " + nuevaOrden.getIdOrden() + " Generada exitosamente");
                    break;
                case 2:
                    System.out.println("Eliminar orden");
                    if (!listaOrdenes.isEmpty()){
                        Orden ultimaOrden = listaOrdenes.removeLast();
                        System.out.println("Orden ID: " + ultimaOrden.getIdOrden() + " Correctamente eliminada");
                    } else {
                        System.out.println("No hay orden para eliminar");
                    }
                    break;
                case 3:
                    System.out.println("Crear producto");
                    scanner.nextLine();
                    System.out.println("Nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.println("Precio del producto");
                    double precioProducto = scanner.nextDouble();
                    scanner.nextLine();
                    Producto producto = new Producto(nombreProducto, precioProducto);
                    listaProductos.add(producto);
                    System.out.println("Producto ID: " + producto.getIdProducto() + " con nombre: " + nombreProducto + " Y el precio  " + precioProducto );
                    break;
                case 4:
                    System.out.println("Ingrese ID del producto a eliminar");
                    int idEliminar = scanner.nextInt();
                    Orden.eliminarProdutoPorId(listaProductos,idEliminar);
                    break;

                case 5:
                    System.out.println("Ordenes totales del día");
                    for (Orden orden: listaOrdenes){
                        System.out.println(
                                "Orden ID: " + orden.getIdOrden());
                        for (Producto prod :orden.getProductos()){
                            if (prod != null){
                                System.out.println("\tProducto ID" + prod.getIdProducto() +
                                ", Nombre: " + prod.getNombre() +
                                        ", Precio" + prod.getPrecio());

                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Productos totales");
                    for (Producto prod : listaProductos){
                        System.out.println("Producto ID: " + prod.getIdProducto() +
                                ", Nombre: " + prod.getNombre() +
                                ", Precio: " + prod.getPrecio()
                        );
                    }
                    break;
                case 7:
                    System.out.println("ingrese Id de la orden");
                    int idOrdenUsuario = scanner.nextInt();
                    System.out.println("Ingrese Id del producto para agregar a la orden");
                    break;
                case 8:
                    System.out.println("Gracias por usar la aplicación");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }

    }
}