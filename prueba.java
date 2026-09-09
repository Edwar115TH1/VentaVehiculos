import java.util.Scanner;
import java.util.Stack;

public class prueba {
    public  static void main(String[] args){
        Metodos m = new Metodos();
        Scanner sc = new Scanner(System.in);
        Stack<ObjAtributos> pila = new Stack<>();

        m.LLenarPila(pila, sc, m);
        m.MostrarPilaObjetual(pila);
        m.EliminarRegitro(pila, sc, m);
    }
}
