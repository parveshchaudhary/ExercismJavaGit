public class House {

    String[] noun = { "horse and the hound and the horn", "farmer sowing his corn", "rooster that crowed in the morn",
            "priest all shaven and shorn", "man all tattered and torn", "maiden all forlorn",
            "cow with the crumpled horn", "dog", "cat", "rat", "malt", "house that Jack built" };
    String[] action = { "belonged to", "kept", "woke", "married", "kissed", "milked", "tossed", "worried", "killed",
            "ate", "lay in" };

    String verse(int verse) {

        StringBuilder verseStr = new StringBuilder();
        int i;
        if (verse == 1) {
            verseStr.append(String.format("This is the %s.", noun[12 - verse]));
            return verseStr.toString();
        }

        verseStr.append(String.format("This is the %s ", noun[12 - verse]));

        for (i = 13 - verse; i < 12 - 1; i++) {
            verseStr.append(String.format("that %s the %s ", action[i - 1], noun[i]));
        }

        verseStr.append(String.format("that %s the %s.", action[i - 1], noun[i]));

        return verseStr.toString();
    }

    String verses(int initialVerse, int finalVerse) {

        StringBuilder strVerses = new StringBuilder();

        int i;

        for (i = initialVerse; i < finalVerse; i++) {
            strVerses.append(verse(i));
            strVerses.append("\n");
        }
        strVerses.append(verse(i));
        return strVerses.toString();
    }

    String sing() {
        StringBuilder sing = new StringBuilder();

        for (int i = 1; i < 12; i++) {
            sing.append(verse(i));
            sing.append("\n");
        }
        sing.append(verse(12));

        return sing.toString();
    }
}