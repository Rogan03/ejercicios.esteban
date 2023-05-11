/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class tiendaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> stock = new HashMap<>();

    public void crearProducto() {
        String re = "si";
        while (re.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el producto.");
            String producto = leer.next();
            producto = producto.toLowerCase();
            System.out.println("Ingrese el precio.");
            Integer precio = leer.nextInt();
            System.out.println("¿Deseas agregar otro? si/no");
            re = leer.next();
            stock.put(producto, precio);
        }
        MENU();
    }

    public void mostrarProducto() {
        System.out.println("-------");
        System.out.println("STOCK ACTUAL:");
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Producto " + key + ", Precio= " + value);
        }
        MENU();
    }

    public void modificarPrecio() {
        System.out.println("-------");
        System.out.println("ELIGE EL PRODUCTO A CAMBIAR EL PRECIO (NOMBRE).");
        String opc = leer.next();
        System.out.println("INGRESA EL NUEVO PRECIO.");
        int pre = leer.nextInt();
        stock.put(opc, pre);
        MENU();
    }

    public void eliminarProducto() {
        System.out.println("-------");
        System.out.println("ELIGE EL PRODUCTO A ELIMINAR (NOMBRE).");
        String opc = leer.next();
        stock.remove(opc);
        MENU();
    }
    
    public void MENU() {
        System.out.println("------");
        System.out.println("MENU:");
        System.out.println("1. Agregar producto");
        System.out.println("2. Modificar precios");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Mostrar stock");
        System.out.println("5. Salir");
        System.out.println("------");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                crearProducto();
                break;
            case 2:
                modificarPrecio();
                break;
            case 3:
                eliminarProducto();
                break;
            case 4:
                mostrarProducto();
                break;
            case 5:
                break;
        }
    }
}
