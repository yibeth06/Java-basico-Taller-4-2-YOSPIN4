import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int cont = 1;
        while(cont != 11){
            suma += cont ;
            System.out.println("La suma `" + cont + "` es: " + suma);
            cont ++;
        }
        System.out.println("--------------------------------------------");
        System.out.println("La sumatoria total del 1 al 10 es: " + suma);
    }
}