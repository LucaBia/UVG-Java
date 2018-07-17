import java.util.*;
public class grado {
    private String nombre;
    List<String> listaGrados = new ArrayList<String>();



    public void agregarGrado(String nombre){
        if (listaGrados.contains(nombre)){
            System.out.println("Este grado ya ha sido registrado");
        }else{
            System.out.println("Grado guardado con exito!");
            listaGrados.add(nombre);
        }
    }

}
