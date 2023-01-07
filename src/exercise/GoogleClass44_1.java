package exercise;

import java.util.Scanner;

public class GoogleClass44_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		String a = "°¡À§";
//		String b = "¹ÙÀ§";
//		String c = "º¸";
		System.out.println("°¡À§ ¹ÙÀ§ º¸ °ÔÀÓ");
		
		
		System.out.print("Ã¶¼ö: ");
		String Ã¶¼ö = scanner.next();
		
		System.out.print("¿µÈñ: ");
		String ¿µÈñ = scanner.next();
		
		String result = "";
		
		if (Ã¶¼ö.equals(¿µÈñ)) {
			result = "ºñ±è";
		} else if(Ã¶¼ö.equals("°¡À§") &&¿µÈñ.equals("º¸") || 
				Ã¶¼ö.equals("¹ÙÀ§") &&¿µÈñ.equals("°¡À§") || 
						Ã¶¼ö.equals("º¸") &&¿µÈñ.equals("¹ÙÀ§")) {
			result = "Ã¶¼ö½Â¸®!";
		} else{
			result = "¿µÈñ½Â¸®!";
		}	System.out.println("°á°ú: " + result);
		    scanner.close();
	}
}


