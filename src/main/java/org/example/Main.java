package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws InterruptedException{
        Main Main = new Main();
            Main.menuPrincipal();
    }

    public void menuPrincipal() throws InterruptedException{

        //***** VARIABLES *****//
        char OP = 'S';
        int opcion = 0;
        Scanner Scanner = new Scanner(System.in);

        while(OP=='S'){

            System.out.println("""
                    
                    -------MENU-------
                    1. 
                    2.
                    3.
                    
                    0. Salir
                    """);

            System.out.print("Seleccione una opción: ");
            opcion = Scanner.nextInt();

            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.err.println("El numero ingresado no es valido, ingrese nuevamente");
                    Thread.sleep(2000);
            }

        }

    }


}
