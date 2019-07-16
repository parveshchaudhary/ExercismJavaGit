class TwelveDays {

    String days[] = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
            "eleventh", "twelfth", };

    String[] items = { "twelve Drummers Drumming", "eleven Pipers Piping", "ten Lords-a-Leaping", "nine Ladies Dancing",
            "eight Maids-a-Milking", "seven Swans-a-Swimming", "six Geese-a-Laying", "five Gold Rings",
            "four Calling Birds", "three French Hens", "two Turtle Doves", "a Partridge in a Pear Tree" };

    String verse(int verseNumber) {
        StringBuilder verse = new StringBuilder();
        int i;

        verse.append(String.format("On the %s day of Christmas my true love gave to me: ", days[verseNumber - 1]));

        for (i = (items.length - verseNumber); i < items.length - 1; i++) {
            verse.append(String.format("%s, ", items[i]));
        }

        return String.format("%s%s%s.\n", verse.toString(), (verseNumber == 1) ? "" : "and ", items[i]);
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder strVerses = new StringBuilder();

        for (int i = startVerse; i < endVerse; i++) {
            strVerses.append(verse(i) + "\n");
        }
        strVerses.append(verse(endVerse));

        return strVerses.toString();
    }

    String sing() {
        return (verses(1, 12));
    }
}
