package functionalinterface;
public class Test {

    public void display() {
        System.out.println("Soy de instancia");
    }

    public static void main(String args[]) {
        Test t = new Test();
        Demo d = t :: display; // aquí referenciamos el método
        d.show(); // aquí llamamos el método
    }
}
