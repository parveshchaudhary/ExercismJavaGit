import java.util.*;

class Anagram {

    String mainWord;
    String mainWordSorted;

    Anagram(String str) {
        str = str.toLowerCase();

        this.mainWord = str;
        this.mainWordSorted = sortString(str);
    }

    List<String> match(List<String> inputList) {
        List<String> list = new ArrayList<String>();

        for (String obj : inputList) {
            if(isAnagram(obj)){
                list.add(obj);
            }
        }

        return list;
    }

    String sortString(String toSort){
        char tempArray[] = toSort.toCharArray();
        Arrays.sort(tempArray);
        return (new String(tempArray));
    }

    boolean isAnagram(String toCheck) {

        toCheck = toCheck.toLowerCase();

        if(toCheck.equalsIgnoreCase(mainWord)){
            return false;
        }

        toCheck = sortString(toCheck);

        if (toCheck.equalsIgnoreCase(mainWordSorted)) {
            return true;
        }
        return false; 
    }
}