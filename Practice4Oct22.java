public class Practice4Oct22 {
    public static void main(String[] args){
        //Escape sequence characters
        /n //next line
            /t 
            //new tab
            "//" 
            //for /
            /'  
            //for ' Single quote
            /" 
            //for double quote
            /b 
            //for backspace
            
            
            //2. Converting string to Lower Case
            String name = "RiDdhi";
        System.out.println(name.toLowerCase());
        
        
        //3.Replace strings
       
        String text = "I am Riddhi.";
        String textR = text.replace("Riddhi","Anshul");
        System.out.println(textR);
        
        
        //4. 
        String text = "Dear <|name|> Thanks a lot!";
          text = text.replace("<|name|>","riddhi");
  
  
         System.out.println(text);
        
        
        
    }
}
