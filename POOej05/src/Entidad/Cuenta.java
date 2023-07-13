/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author nohyv
 */
public class Cuenta {
    private int numeroDeCuenta;
    private long DNI;
    private int saldoActual;
    
    
    //Constructores
    public Cuenta() {
    }

    public Cuenta(int numeroDeCuenta, long DNI, int saldoActual, double interes) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.DNI = DNI;
        this.saldoActual = (int)(saldoActual+saldoActual*(interes/100));
    }
    
    
    //Getter&Setter
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

}
