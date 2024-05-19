import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int utopianTree(int n) {
    // Write your code here
    	int out=1;
    	for(int i=1;i<=n;i++)
    	{
    		if(i%2==0)
    		{
    			out++;
    		}
    		else
    		{
    			out=out*2;
    			
    		}
    	}
    	return out;
    }

}