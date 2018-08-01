package game.world;

public class Wall {
    private int yPosition;
    private int xPosition;

    public Wall(int yPosition, int xPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    @Override
    public String toString() {
        return xPosition + " " + yPosition;
    }
}
