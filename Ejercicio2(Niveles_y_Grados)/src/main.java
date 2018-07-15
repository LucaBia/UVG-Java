import java.util.Scanner;


public class main {
    public static String menu(){
        return "Menu:\n" +
                "\t1. Agregar Nivel\n" +
                "\t2. Agregar Grado\n" +
                "\t3. Agregar Estudiante\n" +
                "\t4. Ver grados en un nivel\n" +
                "\t5. Ver asignaciones en un grado \n" +
                "\t6. Salir\n";
    }

    public static void main (String[] args){
        //boolean wantsToContinue = true;
        nivel minivel = new nivel();
        grado migrado = new grado();
        estudiante miestudiante = new estudiante();
        Scanner reader = new Scanner(System.in);
        String leer;
        do{
            System.out.println(menu());
            leer = reader.next();
            switch(leer){
                case "1":
                    System.out.println("Ingrese el nombre del nivel");
                    String nombre = reader.next();
                    minivel.agregarNivel(nombre);
                    break;
                case "2":
                    System.out.println("Ingrese el nombre del nivel");
                    String nombreNivel = reader.next();
                    if(minivel.listaNiveles.contains(nombreNivel)){
                        System.out.println("Ingrese el nombre del grado");
                        String nombreGrado = reader.next();
                        migrado.agregarGrado(nombreGrado);
                    }else{
                        System.out.println("Este nivel no ha sido registrado");
                    }
                    break;
                case "3":
                    System.out.println("Ingrese el nombre del nivel");
                    String nombreNivelEstudiante = reader.next();
                    if(minivel.listaNiveles.contains(nombreNivelEstudiante)){
                        System.out.println("Ingrese el nombre del grado");
                        String nombreGradoEstudiante = reader.next();
                        if(migrado.listaGrados.contains(nombreGradoEstudiante)){
                            System.out.println("Ingrese el nombre del estudiante");
                            String nombreEstudiante = reader.next();
                            System.out.println("Ingrese el codigo del estudiante");
                            String codigoEstudiante = reader.next();
                            miestudiante.agregarEstudiante(nombreEstudiante, codigoEstudiante, nombreGradoEstudiante, nombreNivelEstudiante);
                            System.out.println(miestudiante.estudiante);
                        }else{
                            System.out.println("Este grado no ha sido registrado para este nivel");
                        }
                    }else{
                        System.out.println("Este nivel no ha sido registrado");
                    }
            }
        }while(leer != "6");
    }
}