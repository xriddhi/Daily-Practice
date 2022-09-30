public class Practice30Sep22 {
    public static void main(String[] args) {
         //1.Precedance and Associativity

        //float a = 7/4.0f*9/2.0f;
        //System.out.println(a);
        // output=7.875

        
        
        //2.Encryption & Decryption(Typecasting)

        //A.encryption
      //  char grade = 'A';
       // grade = (char) (grade+8);
        //System.out.println(grade);
        //B.decryption
       // grade = (char) (grade-8);
        //System.out.println(grade);
        //output=
        //I
        //A


        //3.Guess The Number Game
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
        int numUser = sc.nextInt();
        int number = 15;

        if(number>numUser){
            System.out.println("Oops,The Required Number Is Greater Than Your Number!");
        }else if(numUser>number){
            System.out.println("Oops,The Required Number Is Less Than Your Number!");
        }else{
            System.out.println("Correct!");
        }

    }
}
