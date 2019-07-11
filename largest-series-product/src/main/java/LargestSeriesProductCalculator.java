import java.util.regex.*;

class LargestSeriesProductCalculator {
    String inputNumber;
    LargestSeriesProductCalculator(String inputNumber) {
        
        if(!Pattern.matches("[0-9]*", inputNumber)){
            throw new IllegalArgumentException("String to search may only contain digits.");
        }

        this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if(numberOfDigits>inputNumber.length()){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }

        if(numberOfDigits < 0){
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        long max = 0;

        for(int i=0 ; i<=inputNumber.length()-numberOfDigits ; i++){
            
            String tempNum = inputNumber.substring(i, i+numberOfDigits);
            long tempProd = 1;

            for(int j=0 ; j<tempNum.length() ; j++){
                tempProd *= Character.getNumericValue(tempNum.charAt(j));
            }

            if(tempProd>max){
                max = tempProd;
            }
        }

        return max;
    }

}
