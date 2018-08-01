package game.world;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private int high;
    private int width;
    private List<Wall> walls = new ArrayList<>();
    private List<CoinStack> coins = new ArrayList<>();
    public Robot robot;
    private String[][] uMap;


    public Map(List<String> mapa){
        //System.out.println(mapa);
        this.high = mapa.size();
        this.width = mapa.get(0).length();
        this.uMap = new String[this.width][this.high];
        //List<String> mapArray = new ArrayList<String>();
        for(int i = 0 ; i<mapa.size(); i++){
            String[] cell = mapa.get(i).split("");
            for(int j = 0 ; j<cell.length; j++){
                //mapArray.add(cell[j]);
                //System.out.println(i+","+j+" "+cell[j]);
                this.uMap[j][i] = cell[j];
                switch (cell[j]){
                    case "*":
                        walls.add(new Wall(j,i));
                        break;
                    case " ":
                        break;
                    case "^":
                        this.robot = new Robot(i,j,0);
                        break;
                    case "<":
                        this.robot = new Robot(i,j,3);
                        break;
                    case ">":
                        this.robot = new Robot(i,j,1);
                        break;
                    case "v":
                        this.robot = new Robot(i,j,2);
                        break;
                    default:
                        coins.add(new CoinStack(i,j,Integer.parseInt(cell[j])));
                        break;

                }
            }
        }
        //System.out.println(robot);
        //System.out.println(this.uMap);
    }

    public void actualizarMapa() {
        
    }

    @Override
    public String toString() {
        String stringMap = "";
        /*for (int i = 0; i<this.high; i++){
            for (int j = 0; j<this.width ; j++){
                stringMap += this.uMap[j][i];

            }
            stringMap += "\n";
        }*/
        stringMap += robot;
        return stringMap;
    }
}
