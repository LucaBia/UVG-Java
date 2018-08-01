package game.world;

import java.util.ArrayList;
import java.util.List;

public class prueba {
    private int high;
    private int width;
    /*private Wall[][] walls;
    private CoinStack[][] coins;
    private Robot robot;*/

    public prueba(List<String> mapa){
        List<String> mapArray = new ArrayList<String>();
        for(int i = 0 ; i<mapa.size(); i++){
            String[] cell = mapa.get(i).split("");
            for(int j = 0 ; j<cell.length; j++){
                mapArray.add(cell[j]);
            }
        }
        this.high = high;
        this.width = width;
        //this.robot = new Robot();


    }



}
