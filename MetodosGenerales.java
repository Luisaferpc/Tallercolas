import java.util.Queue;
import java.util.Scanner;

public class MetodosGenerales {
    public Queue<ObjPC> IngresarPc(Queue<ObjPC> pc, Scanner sc) {
        ObjPC obj = new ObjPC();
        boolean confir = true;
        boolean flag = true;

        System.out.println("Ingrese el serial del computador: ");
        String Serial = sc.next();
        while (flag) {

            if (!pc.isEmpty()) {
                for (ObjPC objPC : pc) {
                    if (objPC.getSerial().equalsIgnoreCase(Serial)) {
                        System.out.println("El serial ya existe, por favor ingrese otro: ");
                        Serial = sc.next();
                        // break;
                    } else {
                        flag = false;
                    } // si no encuentra el dato en la lista, continua con el registro
                    // break;
                }
            } else {
                flag = false;
            }

        }
        obj.setSerial(Serial);
        while (confir) {
            System.out.println("Ingrese la marca del computador: ");
            obj.setMarca(sc.next());
            System.out.println("Ingrese la memoria ram del computador: ");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor ingrese un dato numerico\n");
                sc.nextLine();

            }
            obj.setMemoriaRam(sc.nextInt());
            System.out.println("Ingrese el disco duro del computador: ");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor ingrese un dato numerico\n");
                sc.nextLine();
            }
            obj.setDiscoDuro(sc.next());

            System.out.println("Ingrese el precio del computador: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Por favor ingrese un valor numerico\n");
                sc.nextLine();
            }
            obj.setPrecio(sc.nextDouble());

            confir = false;
            System.out.println("Ingreso exitoso!\n");
            obj.setDisponible(true);

        }
        pc.offer(obj);

        return pc;
    }

    public Queue<ObjPC> PrestarPC(Queue<ObjPC> pc, Scanner sc) {
        String serial = "";
        boolean existe = true;
        // ObjPC o = new ObjPC(); no es necesario porque el foreach lo crea para
        // recorrer la cola
        

            while (existe) {
                while (!pc.isEmpty()) {
                    System.out.println("Ingrese el serial del computador a prestar: ");
                    serial = sc.next();
                for (ObjPC objPC2 : pc) {
                    while (!objPC2.getSerial().equalsIgnoreCase(serial)) {
                        existe = false;
                        System.out.println("El serial no existe, por favor ingrese otro: ");
                        serial = sc.next();
                    }
                    while (objPC2.getDisponible() == false) {
                        System.out.println("El computador ya fue prestado, por favor ingrese otro: ");
                        serial = sc.next();

                    }
                    objPC2.setSerial(serial);
                    objPC2.setDisponible(false);
                    System.out.println("Nombre del usuario: ");
                    objPC2.setNombreUsuario(sc.next());
                    System.out.println("Registro de prestamo exitoso\n");
                    existe = false;
                    
                }

                break;
            }

        }
        if (pc.isEmpty()) {
            System.out.println("No hay equipos disponibles\n");
        }

        return pc;
    }
}
