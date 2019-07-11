package main.java;

public class BeerSong{

    public BeerSong(){
    }

    public String sing(int have, int topass){
        StringBuilder songverse = new StringBuilder();

        while(topass > 0){
            if(have>2){
                songverse.append(String.format("%d bottles of beer on the wall, %d bottles of beer.\nTake one down and pass it around, %d bottles of beer on the wall.\n\n", have,have,have-1));
                topass--;
                have--;
            } else if(have>1){
                songverse.append(String.format("%d bottles of beer on the wall, %d bottles of beer.\nTake one down and pass it around, %d bottle of beer on the wall.\n\n", have,have,have-1));
                topass--;
                have--;
            } else if(have>0){
                songverse.append(String.format("%d bottle of beer on the wall, %d bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n\n", have,have));
                topass--;
                have--;
            } else{
                have = 99;
                topass--;
                songverse.append(String.format("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, %d bottles of beer on the wall.\n\n", have ));
            }
        }
        return songverse.toString();
    }

    public String singSong(){
        return sing(99,100);
    }

}