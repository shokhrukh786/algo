package org.example.crackingTheCodingInterview.arrayAndString;

public class Ex1_1 {
    //underground  -> u
    public static boolean isUniqueChars(String str){
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++){
            int val = str.charAt(i);  //unicodeni olmoqda, charni emas.

            if (char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }


    public static void main(String[] args) {
        boolean result = Ex1_1.isUniqueChars("uzbekistonim");
        System.out.println(result);
    }
}
