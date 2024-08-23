package programas;
import java.util.Scanner;
import static java.lang.Math. *;
public class Tarea01 {
    public static void main(String[] args){
        //Decoracion
        System.out.println("<------------------------------------->");
        System.out.println("<-- Encuentra la raiz cuadrada-->");
        // declarar variables
        int num1;
        double raiz;
        Scanner lectura=new Scanner(System.in);
        // Entrada de datos
        System.out.print("INGRESAR EL NUMERO");
        num1=lectura.nextInt();
        // Proceso de datos
        raiz= (int) Math.sqrt(num1);
        //Salida de datos
        System.out.println("El area del circulo es: " + raiz);
        //Decoracion
        System.out.println("<------------------------------------->");
    }
}
