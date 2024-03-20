package com.fdmgroup.icode.cipher.morse;

import java.util.Arrays;

public class MorseCodeTranslator {
	
	public static String englishToMorseCode(String input) {
		char[] arr = {'a', 'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String[] str = { ".-",   "-...", "-.-.", "-..",  ".",
				"..-.", "--.",  "....", "..",   ".---",
				"-.-",  ".-..", "--",   "-.",   "---",
				".--.", "--.-", ".-.",  "...",  "-",
				"..-",  "...-", ".--",  "-..-", "-.--",
				"--..", "|" };
		char[] ch = input.toCharArray();
		String[] finals = new String[ch.length];
		int index=0;
		int funk = 0;
		for(char s:ch){
			for(int i=0;i<26;i++){
				if(s==arr[i]){
					index=i;
				}
			}
			finals[funk] = str[index];
			funk++;
		}
		return Arrays.toString(finals);
	}
	
	public static String morseCodeToEnglish(String input) {
		char[] arr = {'a', 'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String[] str = { ".-",   "-...", "-.-.", "-..",  ".",
				"..-.", "--.",  "....", "..",   ".---",
				"-.-",  ".-..", "--",   "-.",   "---",
				".--.", "--.-", ".-.",  "...",  "-",
				"..-",  "...-", ".--",  "-..-", "-.--",
				"--..", "|" };
		String[] ch = input.split(",\\s*");
		char[] finals = new char[ch.length];
		int index =0;
		int funk = 0;
		for(String n: ch){
			for(int i=0;i<26;i++){
				if(str[i].equals(n)){
					index = i;
				}
			}
			finals[funk] = arr[index];
			funk++;
		}
		String str1 = "";
		for(char c:finals){
			str1 = str1 + c;
		}
		return str1;
	}

}
