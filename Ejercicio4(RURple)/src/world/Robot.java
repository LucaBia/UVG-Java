package world;

public class Robot {
    private int amountCoins;
    private int yPosition;
    private int xPosition;
    private String direction;


    public Robot(int xPosition, int yPosition, String direction){
        this.yPosition = yPosition;
        this.xPosition = xPosition;
        this.direction = direction;
        this.amountCoins = 0;
    }

    public void move(){
        if(direction.equals("^")){
            yPosition += 1;
        }else if(direction.equals("v")){
            yPosition -= 1;
        }else if(direction.equals(">")){
            xPosition += 1;
        }else if(direction.equals("<")){
            xPosition -= 1;
        }
    }

    public void rotate(){
        if(direction.equals("^")){
            direction = ">";
        }else if(direction.equals("v")){
            direction = "<";
        }else if(direction.equals(">")){
            direction = "v";
        }else if(direction.equals("<")){
            direction = "^";
       }
    }

    public void pick(){
        amountCoins += 1;
    }
}
