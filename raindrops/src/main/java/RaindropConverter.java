class RaindropConverter {

    String convert(int number) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        StringBuilder retString = new StringBuilder();
        
        if(number % 3 == 0){
            retString.append("Pling");
        }
        if(number % 5 == 0){
            retString.append("Plang");
        }
        if(number % 7 == 0){
            retString.append("Plong");
        }

        if(retString.toString() == null || retString.toString().equalsIgnoreCase("")){
            retString.append(Integer.toString(number));
        }
        
        return retString.toString();
    }

}
