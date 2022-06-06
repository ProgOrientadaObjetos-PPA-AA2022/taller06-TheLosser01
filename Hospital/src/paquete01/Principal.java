package paquete01;
import paquete02.Hospitales;
import java.util.Scanner;
import paquete02.Ciudad;
import paquete02.Enfermero;
import paquete02.Medico;
 
public class Principal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        String nombH;
        String cd;
        String pv;
        String direc;
        int numM;
        int numE;
        
        System.out.println("Ingresa el nombre del Hospital: ");
        nombH = sc.nextLine();
        
        Hospitales hp1 = new Hospitales(nombH);
        
        System.out.println("Ingresa la ciudad: ");
        cd = sc.nextLine();
        
        System.out.println("Ingresa la provincia: ");
        pv = sc.nextLine();
        
        Ciudad e = new Ciudad(cd,pv);
        hp1.establecerCiudad(e);
        
        
        System.out.println("Cuantos medicos desea ingresar: ");
        numM = sc.nextInt();
        System.out.println("Cuantas enfermeras desea ingresar: ");
        numE = sc.nextInt();
        
        Medico[] cMed = new Medico[numM];
        Enfermero[] ef1 = new Enfermero[numE];
        sc.nextLine();
        for(int i =0;i<cMed.length;i++){
            String nombMed,espec;
            double sueldoMed;
            
            System.out.print("Ingresa el nombre del médico "+(i+1)+":");
            nombMed = sc.nextLine();
            sc.nextLine();
            
            System.out.println("Ingrese la especialdiad del medico "+(i+1)+":");
            espec = sc.nextLine();
            sc.nextLine();
            
            System.out.println("Ingrese el sueldo del Medico "+(i+1)+":");
            sueldoMed = sc.nextDouble();
            sc.nextLine();
            Medico med = new Medico(nombMed,espec,sueldoMed); 
            cMed[i] = med;
        }
        sc.nextLine();
        for (int i = 0; i<numE; i++){
            System.out.print("Ingresa el nombre del enfermero/enfermera "+(i + 1)+": ");
            String nombreE = sc.nextLine();
            sc.nextLine();
            
            System.out.print("Ingresa que tipo de nombramiento tiene el enfermero/a "+(i+1)+": ");
            String tipoN = sc.nextLine();
            sc.nextLine();
            
            System.out.print("Ingresa el sueldo mensual del enfermero/a "+(i+1)+": ");
            double sueldoE = sc.nextDouble();
            sc.nextLine();
            
            Enfermero ef = new Enfermero(nombreE,tipoN,sueldoE);
            ef1[i] = ef;
        }
        sc.nextLine();
        hp1.establecerNumMed(cMed);
        hp1.establecerEnfer(ef1);
        hp1.establecerSueldo();
        System.out.print("La direccion del hospital es: ");
        direc = sc.nextLine();
        
        hp1.establecerDireccion(direc);
        hp1.establecerEspec();
        System.out.println(hp1);
    }
}