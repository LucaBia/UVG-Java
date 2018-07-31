package world;

public class Map {
    private int high;
    private int width;
    private Wall[][] walls;
    private CoinStack[][] coins;

    public Map(int high, int width){
        this.high = high;
        this.width = width;

    }
}
