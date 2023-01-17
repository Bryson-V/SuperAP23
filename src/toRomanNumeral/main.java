package toRomanNumeral;
import java.lang.*;
import java.util.Scanner;
class main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an int from 1-3999: ");
        int x=input.nextInt();
        System.out.print(intToRoman(x));
    }
    public static String intToRoman(int num) {
        String temp = Integer.toString(num);
        String roman = "";
        int size = temp.length();
        int count = num;
        while (true){
            if (count >= 1000) {
                roman += "M";
                count -= 1000;
            } else
                break;
    }
        while (true){
            if(count>=500){
                roman+="D";
                count-=500;
            }
            if (count >= 100) {
                roman += "C";
                count -= 100;
                try {
                    if (roman.substring(roman.length() - 4).equals("CCCC")) {
                        roman = roman.substring(0, roman.length() - 4);
                        roman += "CD";
                    }
                    if(roman.substring(roman.length() - 3).equals("DCD")){
                        roman = roman.substring(0, roman.length() - 3);
                        roman += "CM";
                    }
                }
                catch (IndexOutOfBoundsException e){}
            }
            else
                break;
        }
        while (true){
            if(count>=50){
                roman+="L";
                count-=50;
            }
            if (count >= 10) {
                roman += "X";
                count -= 10;
                try {
                    if (roman.substring(roman.length() - 4).equals("XXXX")) {
                        roman = roman.substring(0, roman.length() - 4);
                        roman += "XL";
                    }
                    if(roman.substring(roman.length() - 3).equals("LXL")){
                        roman = roman.substring(0, roman.length() - 3);
                        roman += "XC";
                    }
                }
                catch (IndexOutOfBoundsException e){}
            }
            else
                break;
        }
        while (true){
            if(count>=5){
                roman+="V";
                count-=5;
            }
            if (count >= 1) {
                roman += "I";
                count -= 1;
                try {
                    if (roman.substring(roman.length() - 4).equals("IIII")) {
                        roman = roman.substring(0, roman.length() - 4);
                        roman += "IV";
                    }
                    if(roman.substring(roman.length() - 3).equals("VIV")){
                        roman = roman.substring(0, roman.length() - 3);
                        roman += "IX";
                    }
                }
                catch (IndexOutOfBoundsException e){}
            }
            else
                break;
        }
    return roman;
    }
}