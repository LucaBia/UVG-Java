package world;

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
        return amountCoins;
    }

    public void removeCoin(){
        amountCoins -= 1;
    }
}
