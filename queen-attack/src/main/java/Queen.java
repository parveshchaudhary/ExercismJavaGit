package main.java;

public class Queen{

    int x_coordinate,y_coordinate;

    public Queen(int x, int y){

        if(x<0){
            throw new IllegalArgumentException("Queen position must have positive row.");
        } else if(y<0){
            throw new IllegalArgumentException("Queen position must have positive column.");
        } else if(x>7){
            throw new IllegalArgumentException("Queen position must have row <= 7.");
        } else if(y>7){
            throw new IllegalArgumentException("Queen position must have column <= 7.");
        }

        this.x_coordinate = x;
        this.y_coordinate = y;
    }

    public int getx_coordinate(){
        return x_coordinate;
    }

    public int gety_coordinate(){
        return y_coordinate;
    }
}

