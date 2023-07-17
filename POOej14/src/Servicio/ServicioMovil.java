/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class ServicioMovil {
    private final Movil celular= new Movil();
    private final Scanner input = new Scanner(System.in);

    public void cargarCelular() {
        System.out.println("Ingrese la marca");
        celular.setMarca(input.nextLine());
        System.out.println("Ingrese el precio");
        celular.setPrecio(input.nextDouble());
        input.nextLine();
        System.out.println("Ingrese el modelo");
        celular.setModelo(input.nextLine());
        System.out.println("Ingrese la memoria Ram");
        celular.setMemoriaRam(input.nextDouble());
        System.out.println("Ingrese el almacenamiento");
        celular.setAlmacenamiento(input.nextDouble());
        input.nextLine();
        System.out.println("Ingrese el código");
        celular.setCodigo(ingresarCodigo());
    }

    public void mostrarCodigo(){
        System.out.println("El cpodigo del móvil es: "+Arrays.toString(celular.getCodigo()));
    }
    private int[] ingresarCodigo() {
        String cadenaCodigo = input.nextLine();
        int[] codigo = new int[7];

        while (cadenaCodigo.length() != 7) {
            System.out.println("Ingrese un código válido");
            cadenaCodigo = input.nextLine();
        }

        for (int i = 0; i < cadenaCodigo.length(); i++) {
            String subcadena = cadenaCodigo.substring(i, i + 1);
            codigo[i] = Integer.parseInt(subcadena);
        }

        return codigo;
    }
}
