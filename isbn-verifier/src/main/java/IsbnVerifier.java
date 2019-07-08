class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        int val = 0, count = 0;

        for (int i = 0 ; i<stringToVerify.length() ; i++) {
            if (stringToVerify.charAt(i) >= '0' && stringToVerify.charAt(i) <= '9') {
                val += Character.getNumericValue(stringToVerify.charAt(i)) * (10 - count);
                count++;
            } else if (stringToVerify.charAt(i) == 'x' || stringToVerify.charAt(i) == 'X') {
                if(count != 9){
                    return false;
                }
                else{
                    val += 10 * (10 - count);
                    count++;
                }   
            }
        }

        if (count == 10 && (val % 11 == 0)) {
            return true;
        }

        return false;
    }

}
