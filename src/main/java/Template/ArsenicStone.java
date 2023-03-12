
package Template;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArsenicStone extends StoneFecade{

     final void elaboracion(){
        laminar();
        request();
        if(solicitudAcabado()){
            darAcabado();
        }
        empaquetar();
    }
     
    @Override
    boolean solicitudAcabado(){
         String answer = request();
         if(answer.toLowerCase().startsWith("s")){
            return true;
        }else {
            return false;
        }
    }
    
    private String request(){
          String answer = null;
        System.out.println("¿Quieres darle acabado de lajado al material? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }catch (IOException ioe){
        }
        if (answer == null){
            return "Sin acabado";
        }
        return answer;
    }

    @Override
    void darAcabado() {
       System.out.println("La piedra fue lajada ");
    }
}
    

