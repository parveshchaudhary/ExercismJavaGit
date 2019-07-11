package main.java;

import java.util.*;
import java.util.regex.Pattern;

public class Bob {

    public Bob(){

    }

    public String hey(String input) {

        input = input.replaceAll("[\\s]", "");
        if (input.length() == 0) {
            return "Fine. Be that way!";
        } else if (input.charAt(input.length() - 1) == '?') {
            if (Pattern.matches("[^a-z]*", input)) {
                if(Pattern.matches("[A-Z?]*", input)){
                    return "Calm down, I know what I'm doing!";
                } else{
                    return "Sure.";
                }
            } else {
                return "Sure.";
            }
        } else if (Pattern.matches("[^a-z]*", input)) {
            if(Pattern.matches("[^A-Z]*", input)){
                return "Whatever.";
            } else{
                return "Whoa, chill out!";
            }
        } else {
            return "Whatever.";
        }
    }
}
     