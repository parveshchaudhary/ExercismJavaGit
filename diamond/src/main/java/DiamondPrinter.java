import java.util.*;

class DiamondPrinter {

    List<String> printToList(char a) {

        List<String> returnList = new ArrayList<String>();
        StringBuilder tempStr = new StringBuilder();

        int i;

        if(a == 'A'){
            returnList.add( Character.toString('A'));
            return returnList;
        }
        

        for (i = 0; i < (a - 'A'); i++) {
            tempStr.append(' ');
        }
        tempStr.append('A');
        for (i = 0; i < (a - 'A'); i++) {
            tempStr.append(' ');
        }
        returnList.add(tempStr.toString());

        for (char c = 'B'; c <= a; c++) {

            tempStr = new StringBuilder();
            
            for (i = 0; i < (a - c); i++) {
                tempStr.append(' ');
            }
            tempStr.append(c);
            for (i = 0; i < (c - 'A')*2 - 1 ; i++) {
                tempStr.append(' ');
            }
            tempStr.append(c);
            for (i = 0; i < (a - c); i++) {
                tempStr.append(' ');
            }



            returnList.add(tempStr.toString());
        }

        char ch = a;    
        ch--;
        for (char c = ch; c >= 'B'; c--) {

            tempStr = new StringBuilder();

            for (i = 0; i < (a - c); i++) {
                tempStr.append(' ');
            }
            tempStr.append(c);
            for (i = 0; i < (c - 'A')*2 - 1 ; i++) {
                tempStr.append(' ');
            }
            tempStr.append(c);
            for (i = 0; i < (a - c); i++) {
                tempStr.append(' ');
            }

            returnList.add(tempStr.toString());
        }

        tempStr = new StringBuilder();

        for (i = 0; i < (a - 'A'); i++) {
            tempStr.append(' ');
        }
        tempStr.append('A');
        for (i = 0; i < (a - 'A'); i++) {
            tempStr.append(' ');
        }
        returnList.add(tempStr.toString());

        return returnList;
    }

}
