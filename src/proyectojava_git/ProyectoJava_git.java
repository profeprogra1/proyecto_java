package proyectojava_git;

import com.ricardo.negocio.Usuario;
import java.util.ArrayList;
import java.util.List;


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
        //AGREGAR
        //usuario.save();
        //ELIMINAR
       /* usuario.setUsuario_id(5);
        usuario.delete();*/
        //ACTUALIZAR
       /* usuario.setUsuario_id(4);
        usuario.setNombre("JUAN");
        usuario.setApellido("PEREZ");
        usuario.update();*/
        
    
       /* LISTAR USUARIOS */
        List<Usuario> lista=usuario.list();
        for(Usuario u:lista){
            System.out.println("NOMBRE:"+u.getNombre());
        }
        
    }

}
