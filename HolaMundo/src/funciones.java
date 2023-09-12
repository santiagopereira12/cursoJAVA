public class funciones {
    public static void main(String[] args) {
        double y = 3;

        //Area del circulo
        areaCirculo(y);

        //Area de una esfera
        areEsfera(y);

        // volumen de una esfera.
        volumenEsfera(y);

        System.out.println("CONVERTIR PESOS A DOLARES: " +converToDolar(4150, "COP"));
    }

    public static double areaCirculo(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double areEsfera(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double volumenEsfera(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    public static double converToDolar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.058;
                break;
            case "COP":
                quantity = quantity * 0.0002;
                break;
            default:
                System.out.println("no se puede realizar conversión");
                break;
        }

        return quantity;
    }
}
