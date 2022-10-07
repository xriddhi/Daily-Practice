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
        
       //5.
        
        String name = "Riddhid";
        System.out.prinln(name.indexOf("d",4));
        //output- 6
        
        System.out.println(name.lastIndexOf("d");
                           //output 6 kyuki last mein aa raha hai d
                           
                           System.out.println(name.equals("Riddhid"));
                           //output true
                           System.out.println(name.equals("riddhi"));
                           //output false cuse case sensitive
                            //use 
                           System.out.println(name.equalsIgnoreCase("riddhi"));
        
        
    }
}
