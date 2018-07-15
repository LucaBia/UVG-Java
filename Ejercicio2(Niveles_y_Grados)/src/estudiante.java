import java.util.*;
public class estudiante {
    private String nombre;
    private int codigo;
    List<String> estudiante = new ArrayList<String>();
    List<String> listaEstudiantes = new ArrayList<String>();

    public void agregarEstudiante(String nombre, String codigo, String grado, String nivel){
        estudiante.add(nombre);
        estudiante.add(codigo);
        estudiante.add(grado);
        estudiante.add(nivel);
    }
}

