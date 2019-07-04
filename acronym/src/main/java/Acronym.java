class Acronym {

    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String plainString = phrase.replaceAll("[^a-zA-Z'\\s]"," ");

        String[] wordsArr = plainString.split("\\s+");
        StringBuilder acronymString = new StringBuilder();

        for(String obj: wordsArr){
                acronymString.append(obj.charAt(0));
        }   
        return acronymString.toString().toUpperCase();
    }

}
