package game;

import game.world.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre del archivo de mapa a ejecutar: ");
        String uMap = input.nextLine();

        //Map miMapa = new Map(showM;);
        try{
            BufferedReader reader = new BufferedReader(new FileReader("/Users/gianlucariverabiagioni/Desktop/UVG-Java/Ejercicio4(RURple)/src/maps/" + uMap));
            String linea;
            List<String> arlist = new ArrayList<String>();

            while((linea=reader.readLine())!= null){
                arlist.add(linea);
                System.out.println(linea);
            }


            Map miMapa = new Map(arlist);
            System.out.println(miMapa);
            //System.out.println(mapArray);
            reader.close();

            System.out.println("Ingrese el nombre del archivo de instrucciones: ");
            String instructions = input.nextLine();
            try{
                BufferedReader readerIns = new BufferedReader(new FileReader("/Users/gianlucariverabiagioni/Desktop/UVG-Java/Ejercicio4(RURple)/src/instructions/" + instructions));
                String line;
                List<String> insList = new ArrayList<>();
                while((line=readerIns.readLine())!= null){
                    insList.add(line);
                    System.out.println(line);
                    switch (line){
                        case "MOVE":
                            miMapa.getRobot().move();
                            break;
                        case "PICK":
                            if (miMapa.coins()){
                                miMapa.getRobot().pick();
                                miMapa.removeCoin();
                            }
                            break;
                        case "ROTATE":
                            miMapa.getRobot().rotate();
                            System.out.println(miMapa.robot);
                            break;

                    }
                    miMapa.updateMap();
                    System.out.println(miMapa);
                }

            }catch (IOException e){
                System.out.println("Malo");
            }

        }catch(IOException e){
            System.out.println("Oh,oh");

        }




    }

}
