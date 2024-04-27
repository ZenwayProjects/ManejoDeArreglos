import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        String[] productos = new String[5];

        productos[0] = "Bicicleta Aquila";
        productos[1] = "Pollo Frisby";
        productos[2] = "Xiaomi Redmi Note 13 Pro";
        productos[3] = "Tarjeta AMD RX 6600";
        productos[4] = "Mouse Logitech G102";

        Arrays.sort(productos);

        System.out.println("=================Iterando con for=================");

        int cantProductos = productos.length;
        for (int i=0; i< cantProductos; i++){
            System.out.println("producto indice " +i+ ":" + productos[i]);
        }

        System.out.println("=================Iterando inversamente con for=================");

        for (int i=0; i< cantProductos; i++){
            System.out.println("producto indice " +i+ ":" + productos[cantProductos-1-i]);
        }

        System.out.println("=================Iterando inversamente con for 2=================");

        for (int i=cantProductos-1; i>=0; i--){
            System.out.println("producto indice " +i+ ":" + productos[i]);
        }




    }
}