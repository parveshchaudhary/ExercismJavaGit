import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        Map<String, String> condonProteinMap = new HashMap<String, String>();
        ArrayList<String> returnlist = new ArrayList<String>();

        condonProteinMap.put("AUG", "Methionine");
        condonProteinMap.put("UUU", "Phenylalanine");
        condonProteinMap.put("UUC", "Phenylalanine");
        condonProteinMap.put("UUA", "Leucine");
        condonProteinMap.put("UUG", "Leucine");
        condonProteinMap.put("UCU", "Serine");
        condonProteinMap.put("UCC", "Serine");
        condonProteinMap.put("UCA", "Serine");
        condonProteinMap.put("UCG", "Serine");
        condonProteinMap.put("UAU", "Tyrosine");
        condonProteinMap.put("UAC", "Tyrosine");
        condonProteinMap.put("UGU", "Cysteine");
        condonProteinMap.put("UGC", "Cysteine");
        condonProteinMap.put("AUG", "Methionine");
        condonProteinMap.put("UGG", "Tryptophan");
        condonProteinMap.put("UAA", "STOP");
        condonProteinMap.put("UAG", "STOP");
        condonProteinMap.put("UGA", "STOP");

        for (int i = 0; i < (rnaSequence.length() / 3); i++) {
            if (condonProteinMap.containsKey(rnaSequence.substring((3 * i), ((3 * i) + 3)))) {
                // if(condonProteinMap.get(rnaSequence.substring( (3*i) , ((3*i)+3))
                // ).equalsIgnoreCase("stop") ){
                if (rnaSequence.substring((3 * i), ((3 * i) + 3)).equalsIgnoreCase("UAA")
                        || rnaSequence.substring((3 * i), ((3 * i) + 3)).equalsIgnoreCase("UAG")
                        || rnaSequence.substring((3 * i), ((3 * i) + 3)).equalsIgnoreCase("UGA")) {
                    break;
                } else {
                    returnlist.add(condonProteinMap.get(rnaSequence.substring((3 * i), ((3 * i) + 3))));
                }
            }
        }

        return returnlist;
    }
}