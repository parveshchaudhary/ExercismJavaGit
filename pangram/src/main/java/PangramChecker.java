import java.util.*;

public class PangramChecker {

    public boolean isPangram(String input) {

        List<Character> chars = new ArrayList<>(); 
        
        input = input.toLowerCase();

        for (char ch : input.toCharArray()) { 
            if(ch >= 'a' && ch<='z'){
                chars.add(ch); 
            }
        } 

        if(chars.stream().distinct().count() == 26){
            return true;
        }
        return false;
    }

}
