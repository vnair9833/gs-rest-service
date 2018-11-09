package hello;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
    // TODO Implement the /words/{word} endpoint
    
    


         @GET
		 @Path("/{words}")
        public void checkPalindromeAnag(@PathParam("word") String str)
	{ 

		
    	static final int NO_OF_CHARS = 256; 
		String reverse = new StringBuffer(str).reverse().toString();
        String palindrome = "false";
         boolean pal = false;
         boolean anag=false;
         
		
	

        if (reverse.equals(str))
{
            pal = true;
}
         
if (pal==false)
{
		int[] count = new int[NO_OF_CHARS]; 


		for (int i = 0; i < str.length(); i++) 
			count[str.charAt(i)]++; 

		
		int odd = 0; 
		for (int i = 0; i < NO_OF_CHARS; i++) { 
			if ((count[i] & 1) != 0) 
				odd++; 

			if (odd > 1) 
				anag=false; 
				else
				anag=true;
		} 
	
		
		JSONObject obj = new JSONObject();

      obj.put("word", str);
      obj.put("palindrome",pal);
      obj.put("anagramOfPalindrome",anag);
      System.out.print(obj);
}	

    
}
}
