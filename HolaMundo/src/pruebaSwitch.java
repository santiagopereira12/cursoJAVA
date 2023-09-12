import java.util.Scanner;

public class pruebaSwitch {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa la opcion:");
        String opc = leer.next();

        switch (opc){
            case "A":
                System.out.println("estas en la primera opcion");
                break;
            case "B":
                System.out.println("estas en la segunda opcion");
                break;
            case "C":
                System.out.println("estas en la tercera opcion");
                break;
            default:
                System.out.println("no funciono");
                break;
        }
    }
}
