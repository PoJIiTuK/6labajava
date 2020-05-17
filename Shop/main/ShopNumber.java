package main;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ShopNumber {

	private static String regularEx = "(N|E|W|S)\\\\d\\\\d(,)\\\\d\\\\d(')\\\\d\\\\d";

	  public static void printText(String text) {
	    final Pattern pattern = Pattern.compile(regularEx);
	    final Matcher matcher = pattern.matcher(text);

	    System.out.println("Sentences found: ");
	    while (matcher.find()) {
	      System.out.println(matcher.group(0));
	    }
	    System.out.println("Text without these sentences:");
	   
	    System.out.println(matcher.replaceAll(""));
}
}