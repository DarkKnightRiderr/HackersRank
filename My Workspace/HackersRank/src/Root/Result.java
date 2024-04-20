package Root;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List < Integer > climbingLeaderboard(List < Integer > ranked, List < Integer > player) {
        // Write your code here
    	List < Integer > out=new ArrayList<Integer>();
    	int rr=1;
    	
    	for(int i=player.size()-1;i>=0;i--)
    	{
    		System.out.println("============================================");
    		System.out.println("Current Rank R="+rr);
    		System.out.println("Current Player List "+player);
    		System.out.println("Current Ranked List "+ranked);
    		System.out.println("Current player "+player.get(i));
    		if(ranked.size()>2)
    		{
    		for(int j=0;j<ranked.size();j++)
    		{
    			System.out.println("Current Ranked "+ranked.get(j));
    			if(player.get(i)>=ranked.get(j))
    			{
    				System.out.println("Current player is greater or equals ");
    				out.add(rr);
    				System.out.println("New Out "+out);
    				break;
    			}
    			else
    			{
    				if(ranked.get(j)>ranked.get(j+1))
    				{
    					rr++;
    					System.out.println("Updated Rank R="+rr);
    				}
    				System.out.println("Removing Ranked "+ranked.get(j));
    				ranked.remove(j);
    				if(ranked.size()>1)
    				j=-1;
    				else
    				{
    					i++;
    					break;
    				}
    				
    			}
    		}
    		}
    		else if(ranked.size()==2)
    		{
    			System.out.println("Current Ranked "+ranked.get(0));
    			if(player.get(i)>=ranked.get(0))
    			{
    				System.out.println("Current player is greater or equals ");
    				out.add(rr);
    				System.out.println("New Out "+out);
    			}
    			else
    			{
    				if(ranked.get(0)>ranked.get(1))
    				{
    					rr++;
    					System.out.println("Updated Rank R="+rr);
    				}
    				System.out.println("Removing Ranked "+ranked.get(0));
    				ranked.remove(0);
    				if(player.get(i)>=ranked.get(0))
        			{
    				out.add(rr);
        			}
        			else
        			{
    				
    				rr++;
    				out.add(rr);
    				i++;
    				ranked.remove(0);
    				
        			}	
    			}
    		}
    		else if(ranked.size()==1)
    		{
    			if(player.get(i)>=ranked.get(0))
    			{
				out.add(rr);
    			}
    			else
    			{
				
				rr++;
				out.add(rr);
				i++;;
				ranked.remove(0);
				
    			}			
    		}
    		else
    		{
    			System.out.println("Cuurent i Value"+i);
    			for(int k=i;k>=0;k--)
    			out.add(rr);
    			break;
    		}
    	}
        return out;

    }    

}

