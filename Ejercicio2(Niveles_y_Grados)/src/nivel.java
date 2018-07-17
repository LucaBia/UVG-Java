import java.util.*;

public class nivel {
    private String nombre;
    List<String> listaNiveles = new ArrayList<String>();
    List Grados_en_Niveles = new ArrayList();



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
            //grado migrado = new grado();
           // migrado.agregarGrado(nombreNivel);
        }else{
            System.out.println("Este nivel no ha sido registrado");
        }
    }

    public void gradosNivel(String nivel, String grado){
        Grados_en_Niveles.add(grado + "" + nivel);
        //Grados_en_Niveles.add(nivel);
    }

    public void buscar(String nivel){
        System.out.println(Grados_en_Niveles.get(0));
    }

    public void newGrado(grado nuevoGrado){
        this.Grados_en_Niveles.add(nuevoGrado);
    }


    //https://diariodebian.wordpress.com/tag/listas-simples-java/
}