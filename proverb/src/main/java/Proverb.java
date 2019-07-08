class Proverb {

    String[] words;
    String returnString;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words.length != 1) {
            for (int i = 0; i < words.length - 1; i++) {
                returnString += String.format("For want of a %s the %s was lost.\n", words[i], words[i + 1]);
            }
        }
        returnString += String.format("And all for the want of a %s.", words[0]);

        return returnString;
    }

}
