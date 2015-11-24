package proyectojava_git;

import com.ricardo.negocio.Usuario;
import java.util.Scanner;

public class ProyectoJava_git {

    public static void main(String[] args) {
        Usuario usuario=new Usuario();
        /*Scanner in=new Scanner(System.in);
        System.out.println("NOMBRE;");
        String nom=in.nextLine();
        usuario.setNombre(nom);
        System.out.println("APE:");
        String ape=in.nextLine();
        usuario.setApellido(ape);*/
        //usuario.save();
        usuario.setUsuario_id(5);
        usuario.delete();
    }

}
