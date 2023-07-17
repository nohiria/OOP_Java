/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioCurso {
    private final Scanner input= new Scanner(System.in);
    private final Curso curso= new Curso();
    
    public void crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        curso.setNombreCurso(input.nextLine());
        System.out.println("Ingrese la cantidad de horas/día del curso");
        curso.setCantidadHorasPorDia(input.nextInt());
        System.out.println("Ingrese cantidad de días por semana");
        curso.setCantidadDiasPorSemana(input.nextInt());
        input.nextLine();
        System.out.println("¿Qué turno es? M/T");
        curso.setTurno(input.nextLine());
        System.out.println("Ingrese el precio por hora");
        curso.setPrecioPorHora(input.nextInt());
        input.nextLine();
        curso.setAlumnos(cargarAlumnos());
    }
    
    private String[] cargarAlumnos(){
        String[] alumnos= new String[5];
        for(int i=0; i<alumnos.length; i++){
            System.out.println("Alumno "+(i+1));
            System.out.println("Ingrese el nombre");
            alumnos[i]= input.nextLine();
        }
        return alumnos;
    }
    
    public double calcularGananciaSemanal(){
        return curso.getPrecioPorHora()*curso.getCantidadHorasPorDia()*curso.getCantidadDiasPorSemana()*5;
    }
    
    public void mostrarCurso(){
        System.out.println(curso.toString());
    }
}
