
public class forLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOfflight();
        for (int i = 0; i <= 10; i++){
            printSOS();
        }
    }

    public static void printSOS(){
        System.out.println("...___...");
    }

    public static boolean turnOnOfflight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
