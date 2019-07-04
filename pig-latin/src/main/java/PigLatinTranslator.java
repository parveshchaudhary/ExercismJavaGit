import java.util.*;

public class PigLatinTranslator {

    boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    String pigLainWordConverter(String initialString){
        StringBuilder latinString = new StringBuilder();

        initialString = initialString.toLowerCase();

        if (initialString.substring(0, 2).equalsIgnoreCase("xr") || initialString.substring(0, 2).equalsIgnoreCase("yt")
                || isVowel(initialString.charAt(0))) {
            latinString.append(initialString);
            latinString.append("ay");
        } else {
            StringBuilder tempString = new StringBuilder();

            if (initialString.length() == 2) {
                if (initialString.charAt(1) == 'y' || isVowel(initialString.charAt(1))){
                    latinString.append(initialString.charAt(1));
                    latinString.append(initialString.charAt(0));
                    latinString.append("ay");
                    return latinString.toString();
                }
                return initialString;
            } else {
                if (initialString.substring(0, 2).equalsIgnoreCase("qu")) {
                    latinString.append(initialString, 2, initialString.length());
                    latinString.append(initialString, 0, 2);
                    latinString.append("ay");
                } else if (initialString.substring(1, 3).equalsIgnoreCase("qu")){
                    latinString.append(initialString, 3, initialString.length());
                    latinString.append(initialString, 0, 3);
                    latinString.append("ay");
                } else {
                    for (int i = 0; i < initialString.length(); i++) {
                        if (isVowel(initialString.charAt(i))
                                || (initialString.charAt(i) == 'y' && ((i == 1 && initialString.length() == 2)
                                        || (i > 1 && initialString.length() > 2)))) {
                            latinString.append(initialString, i, initialString.length());
                            latinString.append(tempString);
                            latinString.append("ay");
                            break;

                        } else {
                            tempString.append(initialString.charAt(i));
                        }
                    }
                }
            }
        }

        return latinString.toString();
    }

    String translate(String initialString) {

        if(initialString.contains(" ")){
            StringBuilder finalString = new StringBuilder();
            String[] wordArr = initialString.split(" ");
            for (int i=0 ; i<wordArr.length-1 ; i++){
                finalString.append(pigLainWordConverter(wordArr[i])+" ");
            }
            finalString.append(pigLainWordConverter(wordArr[wordArr.length-1]));
            return finalString.toString();
        } else {
            return pigLainWordConverter(initialString);
        }
    }

}