package programas;
/**
 *
 * @author LeoNoa
 */
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Programa02 {
    public static void main(String[] args){
        // declarar variables
        double radio, circulo;
        Scanner lectura=new Scanner (System.in);
        DecimalFormat formato=new DecimalFormat("##.##");
        // Entrada de datos
        System.out.print("INGRESAR EL RADIO DEL CIRCULO");
        radio=lectura.nextDouble();
        // Proceso de datos
        circulo=Math.PI*Math.pow(radio, 2);
        //Salida de datos
        System.out.println("El area del circulo es:" + formato.format(circulo));
    }
}
