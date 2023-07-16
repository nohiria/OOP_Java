/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package pooej10;

import java.math.BigDecimal;
import java.util.Arrays;


/**
 *
 * @author nohyv
 */
public class POOej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arrayA= new double[50];
        double[] arrayB= new double[20];
        
        //Llenar Array A con números aleatorios
        for (int i = 0; i < arrayA.length; i++) {
            double numRandom = Math.random() * 10;
            BigDecimal bd = new BigDecimal(numRandom).setScale(2, BigDecimal.ROUND_HALF_UP);
            arrayA[i] = bd.doubleValue();
        }
        
        //Mostrar Array A por pantalla
        System.out.println("ArrayA: "+Arrays.toString(arrayA));
        //Ordenar Array A de menor a mayor
        Arrays.sort(arrayA);
        //Copiar números del Array A en el Array B
        arrayB= Arrays.copyOfRange(arrayA, 0, 20);
        //Rellenar los 10 numeros finales del Array B con el valor 0.5
        Arrays.fill(arrayB, 10, arrayB.length, 0.5);
        //Mostrar arreglos resultantes
        System.out.println("Array A:"+Arrays.toString(arrayA));
        System.out.println("Array B:"+Arrays.toString(arrayB));
    }
    
}
