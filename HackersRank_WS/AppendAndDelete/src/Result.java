public class Result {
	  public static String appendAndDelete(String s, String t, int k) {
		    // Write your code here
		    if (s.length() + t.length() <= k) return "Yes";
		    int n = 0;
		    while (n < Math.min(s.length(), t.length()) && s.charAt(n) == t.charAt(n)) {
		      n++;
		    }
		    int operationsLeft = k - s.length() - t.length() + 2 * n;
		    if(operationsLeft % 2 == 0 && operationsLeft >= 0){
		      return "Yes";
		    }
		    return "No";
		  }
}
