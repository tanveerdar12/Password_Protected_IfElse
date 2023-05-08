import java.util.Scanner;

public class Password_Protected_IfElse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String secretPassword="Pass1234";
        System.out.println("Enter your password");
        String inPassword =sc.next();

        if(inPassword.equals(secretPassword)){
            System.out.println("access granted");

            System.out.println("Enter your marks");
            int marks = sc.nextInt();

            if(marks<=100 && marks>=60){
                System.out.println("Grade A");
            }else if(marks<60 && marks>=30){
                System.out.println("Grade B");
            }else if(marks<30 && marks>=0){
                System.out.println("Fail");
            }else{
                System.out.println("invalid input");
            }
        }else{
            System.out.println("Access denied");
        }
    }
}
