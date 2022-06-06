/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author VIVOBOOK
 */
public class Medico {
    private String nombreH;
    private String especialidades;
    private double sueldo;
    
    public Medico(String nb, String esp, double suel){
        nombreH = nb;
        especialidades = esp;
        sueldo = suel;
    }
    
    public void establecerNombreH(String e){
        nombreH = e;
    }
    
    public void establecerEspec(String e){
        especialidades = e;
    }
    
    public void establecerSueldo(double e){
        sueldo = e;
    }
    
    public String obtenerNombreH(){
        return nombreH;
    }
    
    public String obtenerEspec(){
        return especialidades;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
}
