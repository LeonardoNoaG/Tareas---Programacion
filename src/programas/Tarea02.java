package programas;
import java.util.Scanner;
import static java.lang.Math. *;
import java.text.DecimalFormat;
public class Tarea02 {
    public static void main(String[] args){
      //Decoracion
       System.out.println("<------------------------------------->");
       System.out.println("<--REDONDEO-->"); 
       System.out.println("<------------------------------------->");
       // declarar variables
        double nota1, nota2, nota3, sumNota, notaRedon, promedio;
        Scanner lectura=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("##.##");
        // Entrada de datos
        System.out.print("INGRESAR LA NOTA 1:");
        nota1=lectura.nextInt();
        System.out.print("INGRESAR LA NOTA 2:");
        nota2=lectura.nextInt();
        System.out.print("INGRESAR LA NOTA 3:");
        nota3=lectura.nextInt();
        // Proceso de datos
        sumNota = nota1 + nota2 + nota3;
        promedio = sumNota / 3;
        notaRedon = (int) Math.round(promedio);
        //Salida de datos
        System.out.println("El promedio neto es: " + formato.format(promedio));
         System.out.println("El promedio redondeado es: " + notaRedon);
        //Decoracion
        System.out.println("<------------------------------------->");
    }
}
