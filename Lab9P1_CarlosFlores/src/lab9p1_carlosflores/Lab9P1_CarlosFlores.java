//fila 1, silla 8
package lab9p1_carlosflores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static lab9p1_carlosflores.Gusanito.tablero;

public class Lab9P1_CarlosFlores {

    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<String> instrucciones = new ArrayList<>();
        String[] opt = {"Gusanito","Salir"};
        int opcion = JOptionPane.showOptionDialog(null, "Lab9-Q4-2023 ","", 0, 1, null, opt, opt[0]);
        if(opcion == 0){
            String dimens = JOptionPane.showInputDialog("Ingrese las dimensiones del tablero en el formato ancho,alto");
            String[]lyw = dimens.split(",");
            int ancho = Integer.parseInt(lyw[0]);
            int alto = Integer.parseInt(lyw[1]);
            while(ancho < 4 || ancho > 10 || alto < 4 || alto > 10){
                JOptionPane.showMessageDialog(null, "Las dimensiones tienen que estar entre 4 y 10");
                dimens = JOptionPane.showInputDialog("Ingrese las dimensiones del tablero en el formato ancho,alto");
                lyw = dimens.split(",");
                ancho = Integer.parseInt(lyw[0]);
                alto = Integer.parseInt(lyw[1]);
            }
            JOptionPane.showMessageDialog(null, tablero(alto,ancho));
            String op = JOptionPane.showInputDialog("1.Ingresar Instrucciones\n2.Ejecutar instrucciones");
            int opcion2 = Integer.parseInt(op);
            if(opcion2 == 1){
                String instruccion = JOptionPane.showInputDialog(null,"Ingrese la instruccionde la forma magnitudDIRECCION(ej.2UP)");
                instrucciones.add(instruccion);
            }else if(opcion2 == 2){
                if(instrucciones.isEmpty()){
                    System.out.println("No hay instrucciones, ingreselas y luego vuelva");
                    JOptionPane.showMessageDialog(null, "No hay instrucciones, ingreselas y luego vuelva");
                }else{
                    System.out.println("1.Ver siguiente paso\n2.Ver paso anterior\n3.Seleccionar paso\n4.Volver al menu");
                    int opcion3 = leer.nextInt();
                }
            }else{
                System.out.println("Opcion no valida intente otra vez:");
                opcion2 = leer.nextInt();
            }
        }
        
    }
    
}
