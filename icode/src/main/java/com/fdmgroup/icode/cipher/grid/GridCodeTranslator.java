package com.fdmgroup.icode.cipher.grid;

public class GridCodeTranslator {

	public static String encodeUserInput(String input) {
		StringBuilder sb = new StringBuilder();
		for(char character: input.toCharArray()){
			char shift = (char) (character+5);
			sb.append(shift);
		}
		return sb.toString();
	}

	public static String decodeUserInput(String input) {
		StringBuilder sb = new StringBuilder();
		for(char ch: input.toCharArray()){
			char shift = (char) (ch-5);
			sb.append(shift);
		}
		return sb.toString();
	}

}
