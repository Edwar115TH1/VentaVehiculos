import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    
    public Stack<ObjAtributos> LLenarPila(Stack<ObjAtributos> pila, Scanner sc, Metodos m) {
        boolean continuar = true;
        while (continuar) {
            ObjAtributos o = new ObjAtributos();
            System.out.println("Ingrese el tipo de vehiculo: 1|Camioneta - 2|Carro - 3|Moto");
            o.setTipoVehiculo(sc.nextInt());   
            System.out.println("Ingrese el Precio del vehiculo: ");
            o.setPrecio(sc.nextInt());
            System.out.println("Ingrese el ID del vehiculo: ");
            o.setIdV(sc.nextInt());           
            System.out.println("Ingrese el color del vehiculo: ");
            o.setColor(sc.next());     
            pila.push(o);
            System.out.println("Desea Continuar ingresanbdo registros 1) si , 2) no ");
            int opt = m.ValidarEentero(sc);
            if (opt == 2) {
                continuar = false;
            }
        }
        return pila;        
    }
    public int ValidarEentero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println(
                    "Por favor tenga en cuenta que se le esta pidiendo un dato numerico ojala en el rango de 1 a 5 ");
            sc.next();
        }
        return sc.nextInt();
    }

        public void MostrarPilaObjetual(Stack<ObjAtributos> pila) {
            for (ObjAtributos o : pila) {
                System.out.print(o.color +" - "+ o.precio +" - "+ o.tipoVehiculo);        
            }
            System.out.println();
        }

        public Stack<ObjAtributos> EliminarRegitro(Stack<ObjAtributos> pila, Scanner sc, Metodos m) {
        System.out.println("Ingrese ID a vender");
        int numero = m.ValidarEentero(sc);
        Stack<ObjAtributos> pilaaux = new Stack<>();
        while (!pila.isEmpty()) {
            ObjAtributos o = pila.pop();
                if (o.getIdV() == numero) {
                        System.out.println("Vehiculo Vendido!!!!!!!");
                    } else {
                        pilaaux.push(o);                                    
                    }
            }  
        
            while (!pilaaux.isEmpty()) {
            pila.push(pilaaux.pop());
            } 
        return pila;
    }







}
