package com.tddExercises.mavenproject;
import java.util.*;

/**
 * TDD Exercises
 */

public class App {

	// EXERCICIO DA ENTREVISTA //
	
	public static void multiplesAlg(){
		for(int i = 1; i <= 100; i++){
			if(i % 3 == 0){
				System.out.print("IT");
			}
			if(i % 5 == 0){
				System.out.print("Clinical");
			}
			if(i % 3 != 0 && i % 5 != 0)
				System.out.print(i);
		}
	}

	// EXERCICIO DO CHALLENGE //
	
	public static String upperCaseAlg(String s, int n){
		if(n <= 0)
			return "";

		int stringLen = s.length();
		String result = "";
		for(int i = -1+n; i < stringLen; i+=n){
			Character sChar = s.charAt(i);
			if(Character.isUpperCase(sChar)){
				result += sChar;
			}
		}
		return result;
	}

	// TASK 1 EXTRA DO CHALLENGE //
	
	public static String upperCaseAlgExtra1(String s, int n){
		if(n <= 0)
			return "";

		int stringLen = s.length();
		String result = "";

		for(int i = -1+n; i < stringLen; i+=n){
			Character sChar = s.charAt(i);
			if(Character.toString(sChar).matches("[^a-z]")){
				result += sChar;
			}
		}

		return result;
	}
	
	// TASK 2 EXTRA DO CHALLENGE //
	
	public static String upperCaseAlgExtra2(String s, int n){
		if(n <= 0)
			return "";
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		int stringLen = s.length();
		String result = "";

		for(int i = -1+n; i < stringLen; i+=n){
			Character sChar = s.charAt(i);
			if(Character.toString(sChar).matches("[^a-z]")){
				result += sChar;
				if (charCountMap.containsKey(sChar)) {
	                charCountMap.put(sChar, charCountMap.get(sChar) + 1);
	            }
	            else {
	                charCountMap.put(sChar, 1);
	            }
			}
		}

        for (@SuppressWarnings("rawtypes") Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

		return result;
	}


	public static void main( String[] args ) {
		multiplesAlg();
		System.out.println("\n" + "//////////////////////////////////");
		System.out.println(upperCaseAlg("ITCLiNicAl",1));
		System.out.println("//////////////////////////////////");
		System.out.println(upperCaseAlgExtra1("!tCL1Nical",1));
		System.out.println("//////////////////////////////////");
		System.out.println(upperCaseAlgExtra2("ItCLINiCAL",1));

	}
}
