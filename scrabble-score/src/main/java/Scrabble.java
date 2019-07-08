import java.util.regex.*;
import java.util.*;

class Scrabble {

    String word;

    Scrabble(String word) {
        this.word = word.toLowerCase();
    }

    int getScore() {
        int score = 0;

        for (int i = 0; i < word.length(); i++) {

              if(Pattern.matches("[aeioulnrst]", Character.toString(word.charAt(i)))){
                score += 1;
              } else if(Pattern.matches("[dg]", Character.toString(word.charAt(i)))){
                score += 2;
              } else if(Pattern.matches("[bcmp]", Character.toString(word.charAt(i)))){
                score += 3;
              } else if(Pattern.matches("[fhvwy]", Character.toString(word.charAt(i)))){
                score += 4;
              } else if(Pattern.matches("[k]", Character.toString(word.charAt(i)))){
                score += 5;
              } else if(Pattern.matches("[jx]", Character.toString(word.charAt(i)))){
                score += 8;
              } else if(Pattern.matches("[qz]", Character.toString(word.charAt(i)))){
                score += 10;
              }
            
        }

        return score;
    }

}
