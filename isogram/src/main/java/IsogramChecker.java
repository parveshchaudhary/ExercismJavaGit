import java.util.HashMap;
import java.util.Map;

class IsogramChecker {

    boolean isIsogram(String phrase) {
    
        if(phrase == null || phrase.equalsIgnoreCase("")){
            return true;
        }

        boolean isIsogram = true;

        Map<Character,Integer> charMap = new HashMap<>();
        phrase = phrase.toLowerCase();

        for(int i=0 ; i<phrase.length() ; i++ ){
            if(phrase.charAt(i) >= 'a' && phrase.charAt(i) <= 'z'){
                charMap.put(phrase.charAt(i), charMap.containsKey(phrase.charAt(i)) ? charMap.get(phrase.charAt(i))+1 : 1);
            }
        }

        Map.Entry<Character, Integer> entryOuter = charMap.entrySet().iterator().next();
        int valForCheck = entryOuter.getValue();

        for ( Map.Entry<Character, Integer> entry : charMap.entrySet() ) {
            if(valForCheck != entry.getValue()){
                isIsogram = false;
                break;
            }
        }

        return isIsogram;
    }
}
