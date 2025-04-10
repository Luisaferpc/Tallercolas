import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt1= 0;
        Boolean bandera = true;
        Queue<ObjPC> c = new LinkedList<>();
        MenuPC mp = new MenuPC();

        while (bandera) {
            System.out.println("--------Tienda de Dispositivos--------");
            System.out.println("Que dispositivo desea ver? \n1. PC\n2. Tablet\n3. Salir");        
           
            while (!sc.hasNextInt()) {
                System.out.println("INVALIDO, por favor ingrese un numero entero");
                sc.nextLine();   
                
            }
            opt1 = sc.nextInt();
            sc.nextLine();
            if (opt1< 1 || opt1 > 3) {
                System.out.println("Por favor ingrese una opcion valida");
                continue;
                
            } 
            switch (opt1) {
                case 1:
                    c = mp.MenuPc(c, sc);
                    
                    break;
                case 2:
                System.out.println("Mostrar menu Tablet");
                    break;
                case 3:
                    System.out.println("Gracias por su visita!");
                    bandera = false;
            
                default:
                    break;
            }
        }
       
         

        
    
    }
}