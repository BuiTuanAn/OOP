import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	int d=0;
	public static int maxRun(String str) {
		int d=1;
		int max=0;
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				d = d + 1;
			}
			else {
				if(d>max)
					max=d;
				d=0;
			}


		}
		return max;

	}


	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		StringBuilder str2 = new StringBuilder(str);
		for(int i=0;i<str2.length()-1;i++) {
			if(Character.isDigit(str2.charAt(i))){
				int n = str2.charAt(i) - '0';
				String test="";
				for(int j=1;j<=n;j++)
					test=test+str2.charAt(i+1);
				str2.replace(i,i+1,test);
				i=i+n-1;
			}

		}
		return str2.toString();
	}

	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		HashSet<String> str3= new HashSet<>();
		for(int i=0;i<=a.length()-len;i++) {
			str3.add(a.substring(i,i+len));
		}
		for(int i=0;i<=b.length()-len;i++) {
			if(str3.contains(b.substring(i,i+len))){
				return true;
			}
		}
		return false;

	}

}
