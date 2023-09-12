public class Doctor {
    static int id=0;
    String name;
    String speciality;

    Doctor(){
        System.out.println("construyendo el Objeto: ");
    }
    Doctor(String name, String speciality){
        System.out.println("el especialista asignado es: "+name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " +id);
    }
}
