import java.util.Map;
import java.util.HashMap;;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        
        StringBuilder newStr = new StringBuilder();

        Map<Character, Character> newCharMap = new HashMap<Character,Character>();
        newCharMap.put('G', 'C');
        newCharMap.put('C', 'G');
        newCharMap.put('T', 'A');
        newCharMap.put('A', 'U');

        for(int i = 0 ; i < dnaStrand.length() ; i++){
            newStr.append( newCharMap.get( dnaStrand.charAt(i)));
        }
        return newStr.toString();
    }
}