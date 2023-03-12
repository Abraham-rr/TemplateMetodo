
package Template;


public class Main {
    
    public static void main(String[] args){
        Sandstone p1 = new Sandstone();
        GraniteStone p2 = new GraniteStone();
        ArsenicStone p3 = new ArsenicStone();
        System.out.println("Marmol");
        p1.elaboracion();
        System.out.println("\n");
        System.out.println("Granito");
        p2.elaboracion();
        System.out.println("Arenisca");
        p3.elaboracion();
    }
}
