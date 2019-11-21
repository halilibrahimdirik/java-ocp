package chapter5;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormats {
	
	public static void main(String[] args) {
		Locale[] availableLocales = NumberFormat.getAvailableLocales();
		
		NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
		
		// Get the instance 
        NumberFormat nF4 
            = NumberFormat.getInstance(); 
  
        // Sets the currency to Canadian Dollar 
        nF4.setCurrency( 
            Currency.getInstance( 
                Locale.CANADA)); 
  
        // Stores the values 
        String values4 
            = nF4.getCurrency() 
                  .getDisplayName(); 
  
        // Prints the currency 
        System.out.println(values4); 
		
		// Get the currency instance 
        NumberFormat numberFormat 
            = NumberFormat 
                  .getCurrencyInstance(); 
  
        // Sets the currency to Canadian Dollar 
        numberFormat.setCurrency( 
            Currency.getInstance( 
                Locale.CANADA)); 
  
        // Stores the values 
        String values 
            = numberFormat.getCurrency() 
                  .getDisplayName(); 
  
        // Prints the currency 
        System.out.println(values); 
        
        
        
     // Get the instance 
        NumberFormat nF 
            = NumberFormat 
                  .getCurrencyInstance( 
                      Locale.CANADA); 
  
        // Stores the values 
        String values3 
            = nF.getCurrency() 
                  .getDisplayName(); 
  
        // Prints the currency 
        System.out.println(values3); 
        
        
     // Get the currency instance 
        NumberFormat nF2 
            = NumberFormat 
                  .getCurrencyInstance(); 
  
        // Stores the values 
        String values2 
            = nF2.getCurrency() 
                  .getDisplayName(); 
  
        // Prints the currency 
        System.out.println(values2); 
		
		
		
	}

}
