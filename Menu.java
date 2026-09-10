import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<ObjAtributos> pila = new Stack<>();
        Metodos m = new Metodos();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Bienvenidos compraventa Estructura de datos");
            System.out.println("Que desea realizar");
            System.out.println("1) Registro de vehiculo (Carro - moto - camioneta) ");
            System.out.println("2) Mostrar registro ");
            System.out.println("3) Venta de vehiculo registrado en la pila");
            System.out.println("4) Salir ");
            int opt = m.ValidarEentero(sc);
            switch (opt) {
                case 1:
                    pila = m.LLenarPila(pila, sc, m);
                    break;
                case 2:
                    m.MostrarPilaObjetual(pila);
                    System.out.println();
                    break;                
                case 3:
                    pila = m.EliminarRegitro(pila, sc, m);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;

                default:
                    System.out.println("esta opcion no existe");
                    break;
            }
        }
    }
}
