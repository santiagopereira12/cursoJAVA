import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection myConnect = null;
        Statement myStamt = null;
        PreparedStatement myPrepStamt = null;
        ResultSet myResult = null;

        try {
            myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_java","root","Dn09Sv04++");
            System.out.println("Conexion exitosa");

            //ELIMINAR DATOS.
            myStamt = myConnect.createStatement();
            int rowsAffected = myStamt.executeUpdate("DELETE FROM registros WHERE id = 3");
            System.out.println("empleados Actuales: ");
            myResult = myStamt.executeQuery("SELECT * FROM registros");

            System.out.println("Empleados despues de eliminar");
            while(myResult.next()){
                System.out.println(myResult.getString("nombre"));
            }

            //ACTUALIZAR DATOS
            /*myStamt = myConnect.createStatement();
            int rowsAffected = myStamt.executeUpdate("UPDATE registros " + "set nombre = 'Actualizacion'" + "WHERE id = 2");

            myResult = myStamt.executeQuery("SELECT * FROM registros ORDER BY 'fecha' desc");

            while(myResult.next()){
                System.out.println(myResult.getString("nombre") + "," + myResult.getString("fecha"));
            }*/

            //INSERTAR DATOS
            /*String sql = ("INSERT INTO registros (correo, nombre, apellido, password) VALUES (?,?,?,?)");
            myPrepStamt = myConnect.prepareStatement(sql);
            myPrepStamt.setString(1, "correo@correo.com");
            myPrepStamt.setString(2, "prueba");
            myPrepStamt.setString(3, "java");
            myPrepStamt.setString(4, "123456");

            int rowsAffected = myPrepStamt.executeUpdate();

            if (rowsAffected > 0){
                System.out.println(myResult.getString("nombre"));
            }*/

            //LEER DATOS
            /*myStamt = myConnect.createStatement();
            myResult = myStamt.executeQuery("SELECT * FROM registros");

            while (myResult.next()){
                System.out.println(myResult.getString("nombre"));
            }*/
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Algo salio mal");
        }
    }
}