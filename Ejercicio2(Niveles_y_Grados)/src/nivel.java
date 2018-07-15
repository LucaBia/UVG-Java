import java.util.*;

public class nivel {
    private String nombre;
    List<String> listaNiveles = new ArrayList<String>();


    public void agregarNivel(String nombre){
        if (listaNiveles.contains(nombre)){
            System.out.println("Este nivel ya ha sido registrado anteriormente");
        }else{
            System.out.println("Nivel guardado con exito!");
            listaNiveles.add(nombre);
        }
    }

    public void comprobarNivel(String nombreNivel){
        if(listaNiveles.contains(nombreNivel)){
            System.out.println("Ingrese el nombre del grado");
            grado migrado = new grado();
            migrado.agregarGrado(nombreNivel);
        }else{
            System.out.println("Este nivel no ha sido registrado");
        }
    }
}