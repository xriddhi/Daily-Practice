//5 Oct 2022

public class Practice5Oct2022 {
    public static void main(String[] args) {
        //1.If else statements
        if(){
            System.out.println();
        }
        else{
            System.out.println();
        }
        
        
        
         int a = 17;
   if(a>18){
   System.out.println("You can drive");
   }
   else{
   System.out.println("You cannot drive");
   }
        
        
        
        
      
       //Question:Types Of Loops= while loop,do-while loop,for loop
  
 //while loop
  
  public static void main(String[]args){
    int i = 10;
    while(i<=100){
      System.out.println(i);
      i++;
    }
  }
      
     
      // do-while loop
      //while loop mein pehle condition check hoti hai 
        //do-while loop mein we dont check the limit at first,it is guaranteed to print atleast once
      
      public static void main(String[] args) {
    int a = 0;
    do{
      System.out.println(a);
      a++;
      
    }while(a<6);
    

  }
      
      
      
      
 //Question:for loop
  // for (initialize;check.bool.expression;update){
  // CODE
 // }
  
  public static void main(String[]args){
    
    for(int i =0;i<=10;i++){
      System.out.println(i);
  }
  }
      
      //Break & Continue using loops
  
  //Break statement is used to end the loop
      // continue skips and takes us to next iteration
      
  
 /* public static void main(String[]args){
    for(int i=1;i<=10;i++){
      System.out.print("The number is:");
      System.out.println(i);
    }
    if(i==6){
      System.out.println("Ending the loop");
      break;
    }
  }*/

      
  //break in while loop
  /* public static void main(String[]args){
    int i = 1;
    while(i<5){
      System.out.println(i);
      if(i==2){
        System.out.println("End.");
        break;
      }
      i++;
    }
  }*/
      
      
      // break in do-while loop
  /*public static void main(String[]args){
    int i=1;
    do{
      System.out.println(i);
      i++;
      if(i==5){
      System.out.println("end.");
      break;
    }
    } while(i<=10);
    
  }*/
      
      
      // Question:Write a program to print first 10 odd numbers using a for loop

  public static void main(String[]args){
     
    for(int i=0;i<10;i++){
      System.out.println(2*i+1);
    }
  }
      
      //Print First 10 natural numbers in reverse order

  public static void main(String[] args){
    for(int i=10;i>0;i--){
      System.out.println(i);
    }
  }
      //
   
    
  
    }
}
