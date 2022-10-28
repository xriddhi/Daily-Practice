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
        
        
        
        //2. Practice LOOPS
        
        //Question: Pass/fail,total should be greater than or equal to 40% and at least 33% marks should be there in each subject to pass and 
        //input the data of 3 subs and calculate this:
        
        
        import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Physics marks(Out of 100):");
    int physics = sc.nextInt();
    System.out.println("Enter Your Chemistry marks(Out of 100):");
    int chem = sc.nextInt();
    System.out.println("Enter Your Maths Marks(Out of 100):");
    int maths = sc.nextInt();
    int totalM = physics+chem+maths;
    System.out.print("Your total Marks are(Out of 300):");
    System.out.println(totalM);

    if(totalM >= 120 && physics>=33 && chem>=33 && maths>=33){
      System.out.println("You pass!");
    }else{
      System.out.println("You fail!");
    }
      
      
      //Question: Income Slab & Tax rate 
    //take input
      public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Income:");
    double y = sc.nextDouble();
      
    if(250000<=y && y< 500000){
      System.out.println("Tax Rate On Your Income Slab Is 5%");
    } else if(500000<=y && y< 1000000){
      System.out.println("Tax Rate On Your Income Slab Is 20%");
    }else{
      System.out.println("Tax Rate On Your Income Slab Is 30%");
    }
    
    
  }
    
      
      //Q Day of the week
      
      public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    switch (day){
        Case 1-> System.out.println("Monday");
       
        Case 2-> System.out.println("Tuesday");
       
        Case 3-> System.out.println("Wednesday");
       
        Case 4-> System.out.println("Thursday");
        
        Case 5-> System.out.println("Friday");
        
        Case 6-> System.out.println("Saturday");
       
        Case 7-> System.out.println("Sunday");
      
        
    }
  }
      //Question: To tell which kind of website is it:

  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the website URL:");
    String website = sc.next();
    
    if(website.endsWith(".com")){
      System.out.println("This is a commercial website");
    }else if (website.endsWith(".org")){
      System.out.println("This is an organisational website");
    }else if(website.endsWith(".in")){
      System.out.println("This is an Indian Website");
      
    }
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
      
      
      //Question: Print first 10 natural numbers

  public static void main(String[]args){
    int a= 1;
    do{
      System.out.println(a);
      a++;
    }while(a<11);
    
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
