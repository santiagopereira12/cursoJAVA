import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int response;

        do {
            System.out.println("Menu elecciones");
            System.out.println("1. peliculas");
            System.out.println("2. series");
            System.out.println("3. salir");
            response = sc.nextInt();

            switch (response){
                case 1:
                    System.out.println("ingresaste a la opción de peliculas");
                    break;
                case 2:
                    System.out.println("ingresaste a la opción de series");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
            }
        }while (response != 3);
    }
}
