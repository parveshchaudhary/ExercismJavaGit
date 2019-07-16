import java.util.regex.*;
import java.util.*;

class Scrabble {

  String word;

  Pattern p1 = Pattern.compile("[aeioulnrst]");
  Pattern p2 = Pattern.compile("[dg]");
  Pattern p3 = Pattern.compile("[bcmp]");
  Pattern p4 = Pattern.compile("[fhvwy]");
  Pattern p5 = Pattern.compile("[k]");
  Pattern p6 = Pattern.compile("[jx]");
  Pattern p7 = Pattern.compile("[qz]");

  Scrabble(String word) {
    this.word = word.toLowerCase();
  }

  int getScore() {
    int score = 0;

    for (int i = 0; i < word.length(); i++) {

      String charVal = Character.toString(word.charAt(i));

      if (p1.matcher(charVal).matches()) {
        score += 1;
      } else if (p2.matcher(charVal).matches()) {
        score += 2;
      } else if (p3.matcher(charVal).matches()) {
        score += 3;
      } else if (p4.matcher(charVal).matches()) {
        score += 4;
      } else if (p5.matcher(charVal).matches()) {
        score += 5;
      } else if (p6.matcher(charVal).matches()) {
        score += 8;
      } else if (p7.matcher(charVal).matches()) {
        score += 10;
      }
    }

    return score;
  }

}
