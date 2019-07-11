package main.java;

import java.util.*;

public class RomanNumeral {

    String romanNumeral;

    public RomanNumeral(int number) {

        Map<Integer, String> symHolder = new HashMap<Integer, String>();

        symHolder.put(1, "I");
        symHolder.put(5, "V");
        symHolder.put(10, "X");
        symHolder.put(50, "L");
        symHolder.put(100, "C");
        symHolder.put(500, "D");
        symHolder.put(1000, "M");

        int tempNum = number;
        int posn = 1;
        String tempStrNum = "";

        while (tempNum > 0) {

            int digit = tempNum % 10;
            String toadd = "";

            if (posn == 1) {
                if (digit < 4 && digit>0) {

                    while (digit > 0) {
                        toadd += "I";
                        digit--;
                    }
                    tempStrNum = String.format("%s%s", toadd, tempStrNum);
                } else if (digit == 4) {
                    tempStrNum = String.format("%s%s", "IV", tempStrNum);
                } else if (digit == 5) {
                    tempStrNum = String.format("%s%s", "V", tempStrNum);
                } else if (digit > 5 && digit < 9) {
                    toadd = "V";
                    while (digit > 5) {
                        toadd += "I";
                        digit--;
                    }
                    tempStrNum = String.format("%s%s", toadd, tempStrNum);
                } else if (digit == 9) {
                    tempStrNum = String.format("%s%s", "IX", tempStrNum);
                }
                tempNum = tempNum / 10;
                posn++;
            } else if (posn == 2) {
                if (digit < 4 && digit>0) {

                    while (digit > 0) {
                        toadd += "X";
                        digit--;
                    }
                    tempStrNum = String.format("%s%s", toadd, tempStrNum);
                } else if (digit == 4) {
                    tempStrNum = String.format("%s%s", "XL", tempStrNum);
                } else if (digit == 5) {
                    tempStrNum = String.format("%s%s", "L", tempStrNum);
                } else if (digit > 5 && digit < 9) {
                    toadd = "L";
                    while (digit > 5) {
                        toadd += "X";
                        digit--;
                    }
                    tempStrNum = String.format("%s%s", toadd, tempStrNum);
                } else if (digit == 9) {
                    tempStrNum = String.format("%s%s", "XC", tempStrNum);
                }
                tempNum = tempNum / 10;
                posn++;
                
            } else if (posn == 3) {
                if (digit < 4 && digit>0) {

                    while (digit > 0) {
                        toadd += "C";
                        digit--;
                    }
                    tempStrNum = String.format("%s%s", toadd, tempStrNum);
                } else if (digit == 4) {
                    tempStrNum = String.format("%s%s", "CD", tempStrNum);
                } else if (digit == 5) {
                    tempStrNum = String.format("%s%s", "D", tempStrNum);
                } else if (digit > 5 && digit < 9) {
                    toadd = "D";
                    while (digit > 5) {
                        toadd += "C";
                        digit--;
                    }
                    tempStrNum = String.format("%s%s", toadd, tempStrNum);
                } else if (digit == 9) {
                    tempStrNum = String.format("%s%s", "CM", tempStrNum);
                }
                tempNum = tempNum / 10;
                posn++;
            } else if (posn == 4) {
                if (digit < 4 && digit>0) {

                    while (digit > 0) {
                        toadd += "M";
                        digit--;
                    }
                    tempStrNum = String.format("%s%s", toadd, tempStrNum);
                }
                tempNum = tempNum / 10;
                posn++;
            }

        }
        this.romanNumeral = tempStrNum;

        // symHolder.put(20,)

        // int num[] = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        // String sym[] = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D",
        // "CM", "M" };
        // int i = 12;
        // while (number > 0) {
        // int div = number / num[i];
        // number = number % num[i];
        // while (div-- >= 0) {
        // this.romanNumeral = this.romanNumeral + sym[i];
        // }
        // i--;
        // }
    }

    public String getRomanNumeral() {
        return romanNumeral;
    }
}
