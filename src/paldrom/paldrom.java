package paldrom;

import java.util.*;

public class paldrom {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] pel = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(str.length()-1-i)) {
				if(str.length()/2==i) {
					System.out.print(1);
				}
			}
			else {
				System.out.print(0);
				break;
			}
		}
	}
}