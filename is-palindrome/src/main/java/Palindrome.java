public class Palindrome {

    public boolean check(String sentence) {

        sentence = sentence.replaceAll("[^A-Za-z0-9]*", "");

        if(sentence.equalsIgnoreCase((new StringBuilder(sentence)).reverse().toString())){
            return true;
        }
        return false;
    }
}

