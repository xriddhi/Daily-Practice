public class Practice4Oct22 {
    public static void main(String[] args){
        
        //1.String is a class but it can be used as a Primitive Data type.
 
       
        String name = "Riddhi";
       System.out.println(name);
        
        //Strings are immutable.
        
        //2. Ways to print
       
        System.out.printf();
        System.out.format(); //both same
        int a = 2;
        float b = 0.347f;
            System.out.format("The value of a is %d and the value of b is %f",a,b);
        //%d is format specifier
         //%d = int
        //%s=string
        //%f=float
        //%c=char
        
        //3. 
        
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.subString(1)); //1 se saare letters aayenge
        System.out.println(name.subString(1,5)); //1 se 5 tak
        System.out.println(name.replace('r','p')); //it will replace r with p
        
        //4.
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
            
            
            //5. Converting string to Lower Case
            String name = "RiDdhi";
        System.out.println(name.toLowerCase());
        
        
        //6.Replace strings
       
        String text = "I am Riddhi.";
        String textR = text.replace("Riddhi","Anshul");
        System.out.println(textR);
        
        
        //7. 
        String text = "Dear <|name|> Thanks a lot!";
          text = text.replace("<|name|>","riddhi");
  
  
         System.out.println(text);
        
       //8.
        
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
