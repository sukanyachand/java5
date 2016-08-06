import java.util.Scanner;
public class VoteEligibility {

    /**
     * testing vote eligibility using utility scanner
     */
    public static void main(String[] args) {
        // TODO code session2 assignment1.        
        int age;
        Scanner sc=new Scanner(System.in);
        //int age=sc.nextInt();
        System.out.println("what is your age:");
        age=sc.nextInt();
        if (age >= 18)
        {
            System.out.println("Eligible to Vote as age is:"+age);
        }                    
        else
        {
            System.out.println("Not Eligible to Vote as age is:"+age);
        }
        
        
    }
    
}
