import java.util.Arrays;

public class EjemploArreglosFor {
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

        System.out.println("=================Iterando con for each=================");

        for (String prod:productos) {
            System.out.println("producto " + prod);
        }

        System.out.println("=================Iterando con while=================");

        int i = 0;
        while (i < cantProductos){
            System.out.println("producto indice " +i+ ":" + productos[i]);
            i++;
        }

        System.out.println("=================Iterando con do while=================");

        int j = 0;
        do {
            System.out.println("producto indice: "+j+": " +productos[j]);
            j++;
        }while (j<cantProductos);




    }
}