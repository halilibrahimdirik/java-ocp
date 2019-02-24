package bet;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;

import java.util.regex.Pattern; 

public class soru2 {
	
	
	static Set<Integer> sortedInputToInt(String inputString){
		Set<Integer> convertedInputtoInt= new TreeSet<Integer>();
	     
	     Pattern p = Pattern.compile("\\d+");
	        Matcher m = p.matcher(inputString);
	     
	        while(m.find()) {
	        	convertedInputtoInt.add(Integer.parseInt(m.group()));
	            System.out.println(m.group());
	            
	        }
	        System.out.println("sortedInts:" + convertedInputtoInt.toString());
	     return convertedInputtoInt;
	}
	
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      System.out.println(line);

	     
      if(!line.isEmpty()) {  
	      Set<Integer> sortedDistances= sortedInputToInt(line);
	      List<Integer> answerList = new LinkedList<Integer>();
	      int prevDistance = 0;
	      Iterator<Integer> iter = sortedDistances.iterator();
	      while(iter.hasNext()) {
	    	  int nextDistance = iter.next();
	    	  System.out.println("nextdist: " + nextDistance);
	    	  answerList.add(nextDistance - prevDistance);
	    	  prevDistance = nextDistance;
	    	  
	      }
	     
	      iter = answerList.iterator();
	      while(iter.hasNext()) { 
	    	  System.out.print(iter.next());
	    	  if(iter.hasNext())
	    		  System.out.print(",");
	      }
	      System.out.println(answerList.toString());
      }
      
    }
  }
}