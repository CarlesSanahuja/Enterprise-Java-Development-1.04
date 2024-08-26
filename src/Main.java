import java.lang.reflect.Array;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] prueva = {1,2,3,4,5};
        System.out.println(diferencia(prueva));
        encontrarMinimos(prueva);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor de x: ");
        double x = scanner.nextDouble();
        System.out.println("Introduce el valor de y: ");
        double y = scanner.nextDouble();
        System.out.println(ecuacion(x,y));
    }


    public static int diferencia(int[] array1){
        int mayor = 0;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] > mayor){
                mayor = array1[i];
            }
            if(array1[i] < menor){
                menor = array1[i];
            }
        }
        int diferencia= mayor - menor;
        return diferencia;
    }

    public static void encontrarMinimos(int[] array) {

        // Inicializa los valores más pequeño y segundo más pequeño
        int menor = Integer.MAX_VALUE;
        int segundoMenor = Integer.MAX_VALUE;

        // Recorre el array para encontrar el menor y el segundo menor
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                segundoMenor = menor;  // Actualiza el segundo menor
                menor = array[i];      // Actualiza el menor
            } else if (array[i] < segundoMenor && array[i] != menor) {
                segundoMenor = array[i]; // Actualiza el segundo menor si no es igual al menor
            }
        }

        // Verifica si se encontró un segundo menor
        if (segundoMenor == Integer.MAX_VALUE) {
            System.out.println("No existe un segundo valor menor, todos los elementos son iguales.");
        } else {
            System.out.println("El elemento más pequeño es: " + menor);
            System.out.println("El segundo elemento más pequeño es: " + segundoMenor);
        }
    }

    public static double ecuacion(double x,double y){
         double resultado = Math.pow(x, 2) + Math.pow((4 * y / 5) - x, 2);
         return resultado;
    }
}