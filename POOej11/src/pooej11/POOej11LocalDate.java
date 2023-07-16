/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package pooej11;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class POOej11LocalDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //Se instancia la fecha actual
        LocalDate fechaActual= LocalDate.now();
        
        //Se pide al usuario la fecha de su nacimiento
        System.out.println("FECHA DE NACIMIENTO");
        System.out.println("Ingrese el año");
        int year= input.nextInt();
        //Se comprueba que el año sea válido
        while(year<1900||year>fechaActual.getYear()){
            System.out.println("Ingrese un año válido");
            year= input.nextInt();
        }
        System.out.println("Ingrese el mes");
        int month= input.nextInt();
        //Se comprueba que el mes sea válido
        while(month<1||month>12){
            System.out.println("Ingrese un mes válido");
            month= input.nextInt();
        }
        System.out.println("Ingrese el día");
        int day= input.nextInt();
        while(day<0||day>diasDelMes(month,year)){
            System.out.println("Ingrese un día válido");
            day=input.nextInt();
        }
        
        LocalDate fecha1= LocalDate.of(year,month,day);
        System.out.println(fecha1);
        
        //Se usa la clase Period para obtener la diferencia entre las fechas
        Period yearsBetween= Period.between(fecha1, fechaActual);
        
        System.out.println("Entre la fecha de y la fecha actual hay "+yearsBetween.getYears()+" años de diferencia");
    }
    
    public static int diasDelMes(int month, int year) {
        int days=0;
        
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days =31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if(esBisiesto(year)){
                    days=29;
                }else{
                    days=28;
                }
        }
        return days;
    }
    
    public static boolean esBisiesto(int año) {
        if (año % 4 == 0) {
            return !(año % 100 == 0 && año % 400 != 0); 
        }
        return false;
    }
}
