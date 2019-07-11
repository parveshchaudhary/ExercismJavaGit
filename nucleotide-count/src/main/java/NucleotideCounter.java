package main.java;

import java.util.HashMap;
import java.util.Map;

public class NucleotideCounter{

    String nucleotide;
    Map<Character, Integer> nucleotideCounterMap = new HashMap<Character,Integer>();

    public NucleotideCounter(String nucleotide){
        this.nucleotide = nucleotide;

        nucleotideCounterMap.put('A', 0);
        nucleotideCounterMap.put('C', 0);
        nucleotideCounterMap.put('G', 0);
        nucleotideCounterMap.put('T', 0);

        //Is more expensive than using simple variables.
        for(int i=0 ;i<nucleotide.length() ; i++){
            if(nucleotide.charAt(i) == 'A'){
                nucleotideCounterMap.put('A',nucleotideCounterMap.get('A')+1);
            } else if(nucleotide.charAt(i) == 'C'){
                nucleotideCounterMap.put('C',nucleotideCounterMap.get('C')+1);
            } else if(nucleotide.charAt(i) == 'G'){
                nucleotideCounterMap.put('G',nucleotideCounterMap.get('G')+1);
            } else if(nucleotide.charAt(i) == 'T'){
                nucleotideCounterMap.put('T',nucleotideCounterMap.get('T')+1);
            } else{
                throw new IllegalArgumentException();
            }
        }
    }

    public Map<Character, Integer> nucleotideCounts(){
        return nucleotideCounterMap;
    }

}