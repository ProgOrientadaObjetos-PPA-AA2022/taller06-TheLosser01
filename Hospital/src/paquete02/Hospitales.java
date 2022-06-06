/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author VIVOBOOK
 */
public class Hospitales {
   private String nombreH;
    private Ciudad ciudad;
    private int numEspecialidades;
    private Medico[] numMed;
    private Enfermero[] numEnf;
    private double sueldo;
    private String direccion;
    
    public Hospitales(String nb){
        nombreH = nb;
    }

    public void establecerNombreH(String e){
        nombreH = e;
    }
    public void establecerCiudad(Ciudad e){
        ciudad = e;
    }
    public void establecerEspec(){
        String a;
        int suma = 1;
        for(int i = 0;i<numMed.length - 1;i++){
            a = numMed[i].obtenerEspec();
            if(a != numMed[i+1].obtenerEspec()){
                suma++;
            }
            numEspecialidades = suma;
        }
        
    }
    public void establecerNumMed(Medico[] e){
        numMed = e;
    }
    public void establecerEnfer(Enfermero[] e){
        numEnf = e;
    }
    public void establecerSueldo(){
        double suma = 0;
        for (int i = 0; i < numMed.length; i++){
            suma = suma + numMed[i].obtenerSueldo();
        }
        for (int i = 0; i < numEnf.length; i++){
            suma = suma + numEnf[i].obtenerSueldo();
        }
        sueldo = suma;
    }
    
    public void establecerDireccion(String e){
        direccion = e;
    }

    public String obtenerNombreH(){
        return nombreH;
    }
    
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    
    public int obtenerEspec(){
        return numEspecialidades;
    }
    
    public Medico[] obtenerNumMed(){
        return numMed;
    }
    
    public Enfermero[] obtenerEnfer(){
        return numEnf;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
    public String obtenerDireccion(){
        return direccion;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("HOSPITAL %s\n",obtenerNombreH());
        cadena = String.format("%sDirección: %s\nCiudad: %s\nProvincia: "+
                "%s\nNúmero de especialidades: %d\n",cadena,obtenerDireccion(),ciudad.obtenerNombreC(),
                ciudad.obtenerProvinciaC(),obtenerEspec());
        cadena = String.format("%s\nListado de Médicos\n",cadena);
        for(int i = 0;i < obtenerNumMed().length; i++){
            cadena = String.format("%s- %s - Sueldo: %.2f - %s\n", cadena,
                    obtenerNumMed()[i].obtenerNombreH(),
                    obtenerNumMed()[i].obtenerSueldo(),
                    obtenerNumMed()[i].obtenerEspec());
        }
        cadena = String.format("%s\n\nListado de enfermeros(as)\n",cadena);
        for(int i = 0;i < obtenerEnfer().length; i++){
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n",cadena,
                    obtenerEnfer()[i].obtenerNombreH(),
                    obtenerEnfer()[i].obtenerSueldo(),
                    obtenerEnfer()[i].obtenerTipo());
        }
        cadena = String.format("%s\n\nTotal de sueldos a pagar por mes: %.2f",cadena,
                obtenerSueldo());
        return cadena;
    } 
}
