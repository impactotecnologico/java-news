package functionalinterface;
public class Test {

    public void display() {
        System.out.println("Soy de instancia");
    }

    public static void main(String args[]) {
        Test t = new Test();
        Demo d = t :: display; // aqu� referenciamos el m�todo
        d.show(); // aqu� llamamos el m�todo
    }
}
