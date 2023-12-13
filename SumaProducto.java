//Programa que suma y multiplica números

import java.util.Scanner; //Se utiliza para leer y capturar info del teclado

public class SumaProducto {
    public static void main(String[] args) {
        // Entrada
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma, producto;
        System.out.print("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        // Proceso
        num2 = leer.nextInt();
        suma = num1 + num2;
        producto = num1 * num2;
        // Salida
        System.out.println("Resultado de la suma es " + suma);
        System.out.println("Resultado de la multiplicación es " + producto);
    }
}
