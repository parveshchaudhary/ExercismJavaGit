package main.java;

import main.java.Queen;
import java.util.*;

public class QueenAttackCalculator{

    Queen queenA,queenB;

    public QueenAttackCalculator(Queen a, Queen b){

        Optional.ofNullable(a).orElseThrow(()-> new IllegalArgumentException("You must supply valid positions for both Queens."));
        Optional.ofNullable(b).orElseThrow(()-> new IllegalArgumentException("You must supply valid positions for both Queens."));
    
        if( (a.getx_coordinate() == b.getx_coordinate()) && (a.gety_coordinate() == b.gety_coordinate()) ){
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        }

        this.queenA = a;
        this.queenB = b;
    }
    
    public boolean canQueensAttackOneAnother(){

        if(queenA.getx_coordinate() == queenB.getx_coordinate()){
            return true;
        } 

        if(queenA.gety_coordinate() == queenB.gety_coordinate()){
            return true;
        }

        if((queenA.getx_coordinate()-queenA.gety_coordinate()) ==  (queenB.getx_coordinate()-queenB.gety_coordinate())){
            return true;
        }

        if((queenA.getx_coordinate()+queenA.gety_coordinate()) ==  (queenB.getx_coordinate()+queenB.gety_coordinate())){
            return true;
        }

        return false;
    }
}