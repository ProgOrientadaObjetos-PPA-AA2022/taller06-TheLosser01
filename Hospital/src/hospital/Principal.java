
package hospital;

public class Principal {
    private String nombreH;
    private String direccionH;
    private String cuidadH;
    private String provinciaH;
    private int especialidades;
    
    public void nombreH(String n){
        nombreH = n;
    }
    
    public void direccionH(String n){
        direccionH = n;
    }
    
    public void cuidadH(String n){
        cuidadH = n;
    }
    public void provinciaH(String n){
        nombreH = n;
    }
    
    public void especialidades(int c){
        especialidades = c;
    }
    
    public String obtenerNombreH(){
        return nombreH;
    }
    
    public String obtenerDireccionH(){
        return direccionH;
    }

    
    
}
