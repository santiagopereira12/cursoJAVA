import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese la cantidad");
        int cant = sc.nextInt();
        String[] androidVersions = new String[cant];

        androidVersions[0] = "Apple pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "cupcake";
        androidVersions[3] = "donut";

        /*for(int j=0 ; j < androidVersions.length; j++){
            System.out.println("ingrese versión");
            String ver = androidVersions[sc.nextShort()];
        }*/

        for (int i = 0; i < androidVersions.length; i++ ) {
            System.out.println(androidVersions[i]);
        }
    }
}
