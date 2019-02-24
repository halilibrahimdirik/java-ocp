package bet;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*; 

public class soru1 {
	
	static Set<Integer> convertToNoDuplicateSortedSet(List<Integer> inputIntVals){
	     /*String[] val = inputString.split(" ");
	     Integer[] inputIntegerVals = new Integer[val.length];
	     for (int i = 0; i < val.length; ++i){
	    	 inputIntegerVals[i] = Integer.parseInt(val[i]);
	     }
	     Set<Integer> noDuplicates= new TreeSet<Integer>(Arrays.asList(inputIntegerVals));
	     noDuplicates.removeAll(c)
	     return noDuplicates;*/
	     Set<Integer> noDuplicates= new TreeSet<Integer>();
	     Set<Integer> duplicates= new TreeSet<Integer>();
	     for(int i : inputIntVals) {
	    	 if(!noDuplicates.add(i)) {
	    		 duplicates.add(i);
	    	 }
	     }
	     noDuplicates.removeAll(duplicates);
	     return noDuplicates;
	}
	
	static List<Integer> convertInputToInt(String inputString){
	     String[] val = inputString.split(" ");
	     Integer[] inputIntegerVals = new Integer[val.length];
	     for (int i = 0; i < val.length; ++i){
	    	 inputIntegerVals[i] = Integer.parseInt(val[i]);
	     }

	     return Arrays.asList(inputIntegerVals);
	}
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      int answer = 0;
      System.out.println(line);
      if(!line.isEmpty()) {  
	      List<Integer> inputIntList = convertInputToInt(line);
	      Set<Integer> noDupConvertedSet= convertToNoDuplicateSortedSet(inputIntList);
	      System.out.print("answer: ");
	      if(noDupConvertedSet.iterator().hasNext()) {
	    	  answer = inputIntList.indexOf(noDupConvertedSet.iterator().next())+1;
	      }
      }
      System.out.println(answer);
      
    }
  }
}