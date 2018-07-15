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
                    System.out.println("Esto es dos");
            }
        }while(leer != "6");
    }
}