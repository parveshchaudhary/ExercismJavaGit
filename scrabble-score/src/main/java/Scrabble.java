import java.util.regex.*;
import java.util.*;

class Scrabble {

  String word;

  Map<Pattern, Integer> patternMap = Map.ofEntries(
      Map.entry(Pattern.compile("[aeioulnrst]"), 1),
      Map.entry(Pattern.compile("[dg]"), 2), 
      Map.entry(Pattern.compile("[bcmp]"), 3),
      Map.entry(Pattern.compile("[fhvwy]"), 4), 
      Map.entry(Pattern.compile("[k]"), 5),
      Map.entry(Pattern.compile("[jx]"), 8), 
      Map.entry(Pattern.compile("[qz]"), 10));

  Scrabble(String word) {
    this.word = word.toLowerCase();
  }

  int getScore() {
    int score = 0;

    for (int i = 0; i < word.length(); i++) {

      String charVal = Character.toString(word.charAt(i));

      for (Map.Entry m : patternMap.entrySet()) {
        if (((Pattern) m.getKey()).matcher(charVal).matches()) {
          score += (int) m.getValue();
        }
      }
    }
    return score;
  }

}
