package game.world;

public class Robot {
    private int amountCoins;
    private int yPosition;
    private int xPosition;
    private int direction;
    //private String direction;


    public Robot(int xPosition, int yPosition, int direction){
        this.yPosition = yPosition;
        this.xPosition = xPosition;
        this.direction = direction;
        this.amountCoins = 0;
    }

    public int getxPosition(){
        return this.xPosition;
    }

    public int getyPosition(){
        return this.yPosition;
    }

    public int getDirection(){
        return this.direction;
    }

    public void move(){
        if(direction == 0){
            this.yPosition -= 1;
        }else if(direction == 2){
            this.yPosition += 1;
        }else if(direction == 1){
            this.xPosition += 1;
        }else if(direction == 3){
            this.xPosition -= 1;
        }
    }

    public void rotate(){
        if(direction == 0){
            direction = 1;
        }else if(direction == 2){
            direction = 3;
        }else if(direction == 1){
            direction = 2;
        }else if(direction == 3){
            direction = 0;
       }
    }

    public void pick(){
        amountCoins += 1;
    }

    @Override
    public String toString(){
        switch (direction){
            case 0: return "^";
            case 1: return ">";
            case 2: return "v";
            case 3: return "<";
            default: return ">";
        }
    }
}


