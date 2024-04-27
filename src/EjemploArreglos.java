import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        int[] numeros = new int[4];

        numeros[0] = 14;
        numeros[1] = 22;
        numeros[2] = 13;
        numeros[3] = 21;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        String[] productos = new String[5];

        productos[0] = "Bicicleta Aquila";
        productos[1] = "Pollo Frisby";
        productos[2] = "Xiaomi Redmi Note 13 Pro";
        productos[3] = "Tarjeta AMD RX 6600";
        productos[4] = "Mouse Logitech G102";

        Arrays.sort(productos);

        String producto1 = productos[0];
        String producto2 = productos[1];
        String producto3 = productos[2];
        String producto4 = productos[3];
        String producto5 = productos[4];



        System.out.println("producto1 = " + producto1);
        System.out.println("producto2 = " + producto2);
        System.out.println("producto3 = " + producto3);
        System.out.println("producto4 = " + producto4);
        System.out.println("producto5 = " + producto5);

    }
}