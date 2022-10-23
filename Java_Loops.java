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
    

   
    
  }
}
    }
}
