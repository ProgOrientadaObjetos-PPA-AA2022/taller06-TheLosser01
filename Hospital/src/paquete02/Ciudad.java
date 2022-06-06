/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author VIVOBOOK
 */
public class Ciudad {
    private String nombreC;
    private String provinciaC;
    
    public Ciudad(String nbc, String prC){
        nombreC = nbc;
        provinciaC = prC;
    }
    
    public void establecerNombreC(String e){
        nombreC = e;
    }
    public void establecerProvinciaC(String e){
        provinciaC = e;
    }
    //---------------------------------------------
    public String obtenerNombreC(){
        return nombreC;
    }
    public String obtenerProvinciaC(){
        return provinciaC;
    }
}