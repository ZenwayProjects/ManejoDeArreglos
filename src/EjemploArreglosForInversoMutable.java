import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void invertirArreglo(String[] arreglo){
        int cantProductos = arreglo.length;
        int cantProductos2 = arreglo.length;

        for (int i=0; i < cantProductos2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[cantProductos-1-i];

            arreglo[i]=inverso;
            arreglo[cantProductos-1-i] = actual;
            cantProductos2--;
        }
        for (int i=0; i < cantProductos; i++){
            System.out.println("producto indice = " + i + ": " + arreglo[i]);
        }
    }
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

        System.out.println("=================Invirtiendo valores con for=================");

        invertirArreglo(productos);

        //Collections.reverse(Arrays.asList(productos));




    }
}