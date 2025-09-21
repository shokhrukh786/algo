package org.example.crackingTheCodingInterview.arrayAndString;

import java.util.Arrays;

public class Ex1_3 {
    public static void replaceSpaces(char[] str, int length){
        int countSpace = 0, newLength, i;

        for (i=0; i<length; i++){
            if (str[i] == ' ') countSpace++;
        }

        newLength = length + countSpace*2;
//        str[newLength] = '\0';

        for (i = length - 1; i >= 0; i--){
            if (str[i] == ' '){
                str[newLength - 1] = '1';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                str[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        System.out.println(Arrays.toString(str));
    }


    public static void main(String[] args) {
        Ex1_3.replaceSpaces("Mr John Smith    ".toCharArray(), 13);
    }
}
