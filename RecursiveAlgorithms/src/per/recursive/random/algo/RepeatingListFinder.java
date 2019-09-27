package per.recursive.random.algo;

import java.util.LinkedHashMap;
import java.util.Set;

public class RepeatingListFinder{
 
	    static void longestSubstring(String inputString)
	    {
	        String[] stringArray = inputString.split(" ");
	        String longestSubstring = "";
	        int longestSubstringLength = 0;
	        LinkedHashMap<String, Integer> strPosMap = new LinkedHashMap<String, Integer>();
	        for (int i = 0; i < stringArray.length; i++)
	        {
	            String str = stringArray[i];
	            if(!strPosMap.containsKey(str))
	            {
	            	strPosMap.put(str, i);
	            	longestSubstring += str+" ";
	            }else
	            {
	                i = strPosMap.get(str);
	                strPosMap.clear();
	                longestSubstring = "";
	            }
	            if(strPosMap.size() > longestSubstringLength)
	            {
	            	
	               // longestSubstring= strPosMap.toString();
	            }
	        }
	        //strPosMap.forEach((k,v)->System.out.print(k+ " "));
	        System.out.println("non repeated string-" + longestSubstring);
	    }
	     
	    public static void main(String[] args)
	    {   
	        longestSubstring("");
	    }  
	
}



