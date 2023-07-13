/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioCuenta {
    private Cuenta cuenta= new Cuenta();
    
    //Método crearCuenta
    public Cuenta crearCuenta(){
        Scanner input= new Scanner(System.in);
        
        System.out.println("Ingrese el número de cuenta");
        cuenta.setNumeroDeCuenta(input.nextInt());
        System.out.println("Ingrese el DNI del usuario");
        cuenta.setDNI(input.nextLong());
        System.out.println("Ingrese saldo actual");
        int saldo= input.nextInt();
        System.out.println("Ingrese interés");
        double interes= input.nextDouble();
        saldo+=(int) (saldo*(interes/100));
        cuenta.setSaldoActual(saldo);
        
        return cuenta;
    }
    
    //Método depósito
    public void ingresar(double ingreso){
        System.out.println("Depósito de "+ingreso);
        int saldo= cuenta.getSaldoActual();
        cuenta.setSaldoActual(saldo+=ingreso);
    }
    
    //Método retiro
    public void retirar(double retiro){
        int saldo= cuenta.getSaldoActual();
        if(saldo<retiro){
            System.out.println("Retiro de "+saldo);
            cuenta.setSaldoActual(0);
        }else{
            System.out.println("Retiro de "+retiro);
            cuenta.setSaldoActual((int) (saldo-retiro));
        }
    }
    
    //Método retiro rápido (20%)
    public void extracciónRapida(){
        double limite=cuenta.getSaldoActual()*0.2;
        
        if(limite>0){
            retirar(limite);
        }
    }
    
    //Método Consulta de Saldo
    public void consultarSaldo(){
        System.out.println("Saldo actual: "+cuenta.getSaldoActual());
    }
    
    //Método Consulta de Datos
    public void consultarDatos(){
        System.out.println("Nro. Cuenta: "+cuenta.getNumeroDeCuenta());
        System.out.println("DNI Cliente;: "+cuenta.getDNI());
        System.out.println("Saldo actual: "+cuenta.getSaldoActual());
    }
}
