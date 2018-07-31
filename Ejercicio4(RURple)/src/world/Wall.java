package world;

public class Wall {
    private String direction;
    private int yPosition;
    private int xPosition;

    public Wall(int yPosition, int xPosition, String direction){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }
}
