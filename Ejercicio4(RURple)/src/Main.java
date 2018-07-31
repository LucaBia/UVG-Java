import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre del archivo de mapa a ejecutar: ");
        String uMap = input.nextLine();
        showMap("/Users/gianlucariverabiagioni/Desktop/UVG-Java/Ejercicio4(RURple)/src/maps/" + uMap);
        //showMap("/maps/mapa1.txt");


    }

    public static void showMap(String archivo) throws FileNotFoundException, IOException {
        String rute;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((rute = b.readLine())!=null) {
            System.out.println(rute);
        }
        b.close();
    }
}
