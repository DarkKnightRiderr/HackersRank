import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
    	int seelevel=0;
    	int noOfValley=0;
    	for(char c:path.toCharArray())
    	{
    		if(c=='D')
    		{
    			seelevel--;
    		}
    		else
    		{
    			seelevel++;
    		}
    		
    		if(seelevel==0 && c=='U')
    			noOfValley++;
    	}
    
    	return noOfValley;

    }

}