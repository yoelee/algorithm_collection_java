package com.yoelee.algorithms.t1_string;

/**
 * 判断一个字符串是否是回文(对称)
 */
public class PalindromeString {
    public static boolean isPalindromeString(String abc){
        if(abc != null){
            int len = abc.length();
            for (int i = 0; i < len / 2; i ++){
                if(abc.charAt(i) != abc.charAt(len - i - 1)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String [] args){
        System.out.println(isPalindromeString("a"));
        System.out.println(isPalindromeString("aba"));
        System.out.println(isPalindromeString("abaa"));
    }
}
