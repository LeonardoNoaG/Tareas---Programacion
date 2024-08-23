package programas;
import java.util.Scanner;
import static java.lang.Math. *;
public class Tarea03 {
    public static void main(String[] args){
        //Decoracion
       System.out.println("<------------------------------------->");
       System.out.println("<--NUMERO ALEATORIO-->"); 
       System.out.println("<------------------------------------->");
       // declarar variables
        int minimo = 1;
        int maximo = 10;
        double aleatorio;
        // Proceso de datos
        aleatorio = (int)(Math.random()*(maximo-minimo)*minimo);
        
        System.out.println("NUMAERRO GANADOR:" + aleatorio);
    }
}
