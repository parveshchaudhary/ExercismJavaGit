package main.java;

import main.java.Allergen;

import java.util.*;

public class Allergies {
    int hscore;

    List<Allergen> allergiesList = new ArrayList<Allergen>();

    public Allergies(int hscore) {
        this.hscore = hscore;

        if (hscore > 256) {
            int i=0;
            while(Math.pow(2, i) <= hscore){
                i++;
            }
            hscore = hscore-(int)Math.pow(2, i-1);
        }

        while (hscore > 0) {
            if (hscore >= 128) {
                allergiesList.add(Allergen.CATS);
                hscore -= 128;
            } else if (hscore >= 64) {
                allergiesList.add(Allergen.POLLEN);
                hscore -= 64;
            } else if (hscore >= 32) {
                allergiesList.add(Allergen.CHOCOLATE);
                hscore -= 32;
            } else if (hscore >= 16) {
                allergiesList.add(Allergen.TOMATOES);
                hscore -= 16;
            } else if (hscore >= 8) {
                allergiesList.add(Allergen.STRAWBERRIES);
                hscore -= 8;
            } else if (hscore >= 4) {
                allergiesList.add(Allergen.SHELLFISH);
                hscore -= 4;
            } else if (hscore >= 2) {
                allergiesList.add(Allergen.PEANUTS);
                hscore -= 2;
            } else if (hscore >= 1) {
                allergiesList.add(Allergen.EGGS);
                hscore -= 1;
            }
        }

        for(int i=0 , j=allergiesList.size()-1 ; i<j ; i++){
            allergiesList.add(i,allergiesList.remove(j));
        }
    }

    public List<Allergen> getList(){
        return allergiesList;
    }

    public boolean isAllergicTo(Allergen allergen) {
        
        for (Allergen var : allergiesList) {
            if(var == allergen){
                return true;
            }
        }
        return false;
    }
}