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
public class AdivinaMes {
    private final String[] months= {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String secretMonth;
    
    //Constructores
    public AdivinaMes() { //Inicia el mes secreto en el índice 9 del array= "octubre"
        this.secretMonth= months[9];
    }

    public AdivinaMes(int monthNumb) { //Inicializa el mes secreto según el número del mes (1 al 12) introducido por el usuario
        monthNumb= monthNumb-1; //Se le resta uno para que entre dentro del rango 
        
        if(monthNumb>=0&&monthNumb<=11){ //Se comprueba que esté dentro de los índices del array
           this.secretMonth = months[monthNumb]; 
        }
    }
    
    //Getter&Setter
    public String getSecretMonth() {
        return secretMonth;
    }
}
