package main.java;

public class FoodChain {

    public FoodChain(){

    }

    public String verse(int verse){

        StringBuilder strVerse = new StringBuilder();

        String[] animals = {"cow","goat","dog","cat","bird","spider","fly"};
        String[] sentences = {"I don't know why she swallowed the fly.\n","It wriggled and jiggled and tickled inside her.\n","How absurd to swallow a bird!\n","Imagine that, to swallow a cat!\n","What a hog, to swallow a dog!\n","Just opened her throat and swallowed a goat!\n","I don't know how she swallowed a cow!\n"};

        if(verse == 1 ){
            return "I know an old lady who swallowed a fly.\nI don't know why she swallowed the fly. Perhaps she'll die.";

        }

        if(verse == 8){
            return "I know an old lady who swallowed a horse.\nShe's dead, of course!";
        }

        strVerse.append(String.format("I know an old lady who swallowed a %s.\n",animals[7-verse]));
        strVerse.append(sentences[verse-1]);

        int i;
        for(i=6-(verse-1) ; i <6 ; i++){
            if(animals[i+1].equalsIgnoreCase("spider")){
                strVerse.append(String.format("She swallowed the %s to catch the %s that wriggled and jiggled and tickled inside her.\n",animals[i],animals[i+1] ));
            }else{
                strVerse.append(String.format("She swallowed the %s to catch the %s.\n",animals[i],animals[i+1] ));
            }
        }

        strVerse.append(String.format("I don't know why she swallowed the %s.", animals[i]));

        strVerse.append(" Perhaps she'll die.");

        return strVerse.toString();
    }

    public String verses(int startVerse, int endVerse) {
        
        StringBuilder strVerse = new StringBuilder();
        
        for (int i = startVerse; i <endVerse; i++) {
            strVerse.append(verse(i));
            strVerse.append("\n\n");
        }
        
        strVerse.append(verse(endVerse));
        
        return strVerse.toString();
    }
}