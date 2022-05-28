package com.basicprog6.vowelorconsonent;

public class VowelOrConsonent {
	public static void main(String[] args) {

        char ch = 's';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
}
}