import model.Edad;

public class App {
    public static void main(String[] args) throws Exception {
        Edad edad = new Edad();
        System.out.println(edad.calcularEdad(2023, 4, 31));
    }
}
