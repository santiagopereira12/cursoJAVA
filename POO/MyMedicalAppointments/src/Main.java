import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        /*Doctor myDoctor = new Doctor();
        myDoctor.name = "Santiago Pereira";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor myDoctorTwo = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);*/
        //showMenu();

        Doctor myDoctor = new Doctor("santiago pereira","Cirujano");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }
}