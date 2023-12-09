package lab9p1_carlosflores;

import java.util.ArrayList;
import java.util.Random;

public class Gusanito {
    
    static Random r = new Random();
    
    
    public static char [][] tablero(int alto, int ancho){
        int may = 0,men = 0;
        char [][] tablero = new char[alto][ancho];
        int gusanx = r.nextInt(alto);
        int gusany = r.nextInt(ancho);
        int manzax = r.nextInt(alto);
        int manzay = r.nextInt(ancho);
        if(ancho>alto){
            may = alto;
            men = ancho;
        }else if(alto>ancho){
            may = ancho;
            men = alto;
        }
        int obstaculos = r.nextInt(((may+1-men)+1)+men);
        for (int i = 0; i < tablero.length; i++) {
            int var = r.nextInt(2);
            for (int j = 0; j < tablero[i].length; j++) {
                int var2 = r.nextInt(4);
                if(gusanx == i && gusany == j){
                    System.out.print("[" + (char)36 + "]");
                }else if(manzax == i && manzay == j){
                    System.out.print("[" + (char)79 + "]");
                }else if(var == var2 && obstaculos > 0){
                    System.out.print("[" + (char)35 + "]");
                    obstaculos--;
                }else{
                    System.out.print("[" + (char)32 + "]");
                }
            }
            System.out.println();
        }
        return tablero;
    }
    
    public static int [][] mostrarPaso(int paso, int [][] tabactual,ArrayList<String> intrucciones){
        int [][] temporal = tabactual;
        for (int i = 0; i < temporal.length; i++) {
            for (int j = 0; j < temporal[i].length; j++) {
                
            }
        }
        return temporal;
    }
}
