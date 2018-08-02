package game.world;

public class CoinStack {
    private int amountCoins;
    private int yPosition;
    private int xPosition;

    public CoinStack(int yPosition, int xPosition, int amountCoins){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.amountCoins = amountCoins;
    }

    public int getyPosition(){
        return yPosition;
    }

    public int getxPosition(){
        return xPosition;
    }

    public int getamountCoins(){
        return this.amountCoins;
    }

    public void setValue(int amount){
        this.amountCoins = amount;
    }


    @Override
    public String toString() {
        return xPosition + "," + yPosition + " " + amountCoins;
    }
}
