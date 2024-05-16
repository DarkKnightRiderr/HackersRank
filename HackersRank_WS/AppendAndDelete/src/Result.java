public class Result {
	public static String appendAndDelete(String s, String t, int k) {
	    // Write your code here
	    String out=new String("No");
	    String tempS=new String(s);
	    String tempT=new String(t);
	    int i=0;
	    int noOfCharsRemoved=0;
	    int noOfCharsAppended=k;
	    if(tempT.length()<k)
	    {
	    	noOfCharsRemoved=k-t.length();
	    	noOfCharsAppended=t.length();
	    }
	    System.out.println("No of chars Removed "+noOfCharsRemoved);
	    System.out.println("No of chars Appended "+noOfCharsAppended);
	    while(i<k && i<=t.length())
	    {	
	    	if(noOfCharsRemoved+i>=s.length() )
	    	{
	    		tempS="";
	    		tempT=t.substring(t.length()-noOfCharsAppended+i,t.length());
	    	}
	    	else
	    	{
	    		tempS=s.substring(0,s.length()-noOfCharsRemoved-i);
	    		tempT=t.substring(t.length()-noOfCharsAppended+i,t.length());
	    	}
	    	System.out.println(" Temp S "+tempS);
	    	System.out.println(" Temp T "+tempT);
	    	if((tempS+tempT).equals(t))
	    	{
	    		out="Yes";
	    		break;
	    	}
	    	i++;
	    	}
	    return out;
	    }	
}
