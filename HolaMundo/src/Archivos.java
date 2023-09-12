public class Archivos {
    public static void main(String[] args) {
        boolean Arch = false;
        int cantidad = 3;

        if (Arch){
            cantidad++;
            System.out.println("conexion exitosa, enviando archivos: " + cantidad);
        }else {
            cantidad--;
            System.out.println("conexion fallida: " +cantidad);
        }
    }
}
