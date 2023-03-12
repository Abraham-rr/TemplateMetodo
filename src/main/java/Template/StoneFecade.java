
package Template;

import java.util.Scanner;


public abstract class StoneFecade {
    int m1, m2;
            
    public void Cortar(){
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese la medida que quiero cortar : \n");
        System.out.println("Medida del largo :");
        m1 = datos.nextInt();
        System.out.println("Medida del ancho :");
        m2 = datos.nextInt();
        System.out.println("Laminas cortadas en medidas de :" + m1 + " X "+ m2);
    }
    
    abstract void darAcabado();
    
    public void laminar(){
          System.out.println("Laminando...");
    }
    
    public void empaquetar(){
        System.out.println("Empaquetado");
    }
    
    boolean solicitudAcabado(){
        return true;
    }
    
}
