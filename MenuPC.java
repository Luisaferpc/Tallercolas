import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MenuPC {
    Scanner sc = new Scanner(System.in);
    boolean bandera = true;
    int opt = 0;
    MetodosGenerales m = new MetodosGenerales();
    
    


    public Queue<ObjPC> MenuPc(Queue<ObjPC> pc, Scanner sc) {
        while (bandera) {
            System.out.println("1: Ingresar Computador");
            System.out.println("2: Prestar Computador");
            System.out.println("3: Modificar Computador");
            System.out.println("4: Devolver Computador");
            System.out.println("5: Volver al menú Principal");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor ingrese un dato numerico\n");
                sc.next();

            }
            opt = sc.nextInt();
            sc.nextLine();
            if (opt < 1 || opt > 5) {
                System.out.println("Por favor Ingrese una opcion valida\n");
                continue;
            }
            switch (opt) {
                case 1:
                pc = m.IngresarPc(pc, sc);
               
                break;

                case 2:
                m.PrestarPC(pc, sc);
                break;
            } 

     
        } 
    return null;}
}    


