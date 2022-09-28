import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * examenTrimestre - PACKAGE_NAME
 * Date: mayo / 2022
 */
public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        ArrayList<Articulo> misArticulos = new ArrayList<>();

//        try {
////            Articulo art1 = new Articulo(5, "plátano", 1, 0.5);
////            Articulo art2 = new Articulo(10, "manzana", 0.5, 0.2);
////            Articulo art3 = new Articulo(5, "pera", 1.5, 0.7);
////            Articulo art4 = new Articulo(20, "sandia", 1, 0.8);
////            Articulo art5 = new Articulo(30, "melocotón", 1, 0.2);
//            misArticulos.add(art1);
//            misArticulos.add(art2);
//            misArticulos.add(art3);
//            misArticulos.add(art4);
//            misArticulos.add(art5);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        try {
            do {
                menu();
                System.out.print("Introduce opción del menú: ");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        for (int i = 0; i < misArticulos.size(); i++) {
                            System.out.println(misArticulos.get(i).infoArticulo());
                        }
                        break;
                    case 2:
                        System.out.print("Introduce el ID del artículo: ");
                        int id = scanner.nextInt();
                        System.out.print("Introduce la cantidad que quieres vender: ");
                        int cantidad = scanner.nextInt();
                        System.out.print("Introduce el nombre del cliente: ");
                        String nombreCliente = scanner.nextLine();
                        double precioTotal = cantidad * misArticulos.get(id).getPvp();
                        


                        break;
                    case 3:
                        System.out.println("");

                        break;
                    case 4:
                        menu2();
                        System.out.print("Introduce opción del menú: ");
                        opcion = scanner.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("Añado articulo");

                                System.out.print("Introduce el stock: ");
                                int stock = scanner.nextInt();
                                System.out.print("Introduce el nombre del artículo: ");
                                String nombre = scanner.nextLine();
                                scanner.nextLine();
                                System.out.print("Introduce el PVP: ");
                                double pvp = scanner.nextDouble();
                                System.out.print("Introduce el precio de compra al proveedor: ");
                                double precioProveedor = scanner.nextDouble();

                                // añado el artículo
                                misArticulos.add(new Articulo(stock, nombre, pvp, precioProveedor));

                                break;
                            case 2:
                                System.out.println("Editor articulo");
                                System.out.print("Elige el ID del artículo que quieres editar: ");
                                id = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Introduce el nuevo nombre del artículo: ");
                                String nombreNuevo = scanner.nextLine();
                                System.out.print("Introduce el nuevo PVP del artículo artículo:");
                                double pvpNuevo = scanner.nextDouble();
                                System.out.print("Introduce el nuevo precio de proveedor del artículo: ");
                                double precioProveedorNuevo = scanner.nextDouble();
                                System.out.print("Introduce el nuevo stock del artículo: ");
                                int stockNuevo = scanner.nextInt();

                                for (int i = 0; i < misArticulos.size(); i++) {
                                    if (misArticulos.get(i).getId() == id) {
                                        misArticulos.get(i).setNombre(nombreNuevo);
                                        misArticulos.get(i).setPvp(pvpNuevo);
                                        misArticulos.get(i).setPrecioCompraProveedor(precioProveedorNuevo);
                                        misArticulos.get(i).setStock(stockNuevo);
                                    }
                                }

                                break;
                            case 3:
                                System.out.println("Elimino articulo");
                                System.out.println("Introduce el ID del artículo que deseas eliminar: ");
                                id = scanner.nextInt();
                                Iterator<Articulo> it = misArticulos.iterator();
                                while (it.hasNext()) {
                                    Articulo art = it.next();
                                    if (id == art.getId()) {
                                        it.remove();
                                        System.out.println("El artículo con el ID " + id + " ha sido eliminado");
                                    } else {
                                        System.out.println("No existe artículo con ese ID.");
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Volviendo al menu principal.......");
                                break;
                        }
                        continue;
                    case 5:
                        System.out.println("Has decidido salir.");
                        break;
                }

            } while (opcion != 5);


        } catch (InputMismatchException e) {
            System.out.println("Debes de introducir números enteros");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static void menu() {
        System.out.println("""
                \n**** MENU 1 ****
                1. Mostrar artículos.
                                
                2. Venta a cliente.
                                
                3. Compra a proveedor.
                                
                4. Gestionar artículos.
                                
                5. Salir
                """);
    }

    public static void menu2() {
        System.out.println("""
                \n**** MENU 2 ****
                1. Añadir artículo.
                                
                2. Editar artículo.
                                
                3. Eliminar artículo.
                                
                4. Volver.
                                
                """);
    }
}
