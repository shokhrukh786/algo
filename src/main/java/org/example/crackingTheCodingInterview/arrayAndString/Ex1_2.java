package org.example.crackingTheCodingInterview.arrayAndString;

public class Ex1_2 {
    public static String sort(String str){
        char[] content = str.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    public static boolean permutation(String s, String t){
        if (s.length() != t.length()) return false;
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args) {
        System.out.println(permutation("god", "dog"));
    }
}
