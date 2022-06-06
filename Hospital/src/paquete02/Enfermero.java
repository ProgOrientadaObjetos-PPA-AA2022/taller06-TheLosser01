/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author VIVOBOOK
 */
public class Enfermero {
    private String nombreH;
    private String tipo;
    private double sueldos;
    
    public Enfermero(String hop, String tp, double sl){
        nombreH = hop;
        tipo = tp;
        sueldos = sl;
    }

    public void establecerNombreH(String e){
        nombreH = e;
    }
    
    public void establecerSueldo(double e){
        sueldos = e;
    }
    
    public void establecerTipo(String e){
        tipo = e;
    }
   
    public String obtenerNombreH(){
        return nombreH;
    }
    
    public double obtenerSueldo(){
        return sueldos;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
}
