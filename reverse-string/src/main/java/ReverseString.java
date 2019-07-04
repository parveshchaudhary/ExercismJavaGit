class ReverseString {

    String reverse(String inputString) {
        
        StringBuilder strRev = new StringBuilder();

        for (int i = inputString.length() - 1 ; i >= 0 ; i--){
            strRev.append(inputString.charAt(i));
        }
        return strRev.toString();
    }
}