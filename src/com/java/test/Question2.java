package com.java.test;

import java.util.HashMap;
import java.util.Map;

public class Question2 {

	public String convertToHex(int red, int green, int blue){
		
		StringBuilder sb=new StringBuilder();
		sb.append("#");
		sb.append(getHexForDecimal(red));
		sb.append(getHexForDecimal(green));
		sb.append(getHexForDecimal(blue));

		return sb.toString();
	}

	private String getHexForDecimal(int decimal){
		Map<Integer, String> decimalToHexMap=new HashMap<Integer, String>();
		decimalToHexMap.put(10, "a");
		decimalToHexMap.put(11, "b");
		decimalToHexMap.put(12, "c");
		decimalToHexMap.put(13, "d");
		decimalToHexMap.put(14, "e");
		decimalToHexMap.put(15, "f");

		StringBuilder sb=new StringBuilder();
		sb.append("#");
		int redHexDigit1=decimal/16;
		if(redHexDigit1 > 9){
			sb.append(decimalToHexMap.get(redHexDigit1));	
		}else{
			sb.append(redHexDigit1);
		}
		
		int redHexDigit2=decimal%16;
		if(redHexDigit2 > 9){
			sb.append(decimalToHexMap.get(redHexDigit2));	
		}else{
			sb.append(redHexDigit2);
		}
		return sb.toString();
	}
}
