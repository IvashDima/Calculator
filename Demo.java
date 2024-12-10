import java.util.Scanner;

public class Demo {
    static int[] intro(){
        int[] res = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        res[0] = a;
        res[1] = b;
        return res;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("------------------------");
            System.out.println("Choose operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            int person = scanner.nextInt();
            int[] res;
            int result;
            if (person == 5){
                break;
            } else if (person == 1) {
                res=intro();
                result = res[0] + res[1];
                System.out.println("Result: " + result);
                
            } else if (person == 2) {
                res=intro();
                result = res[0] - res[1];
                System.out.println("Result: " + result);

            } else if (person == 3) {
                res=intro();
                result = res[0] * res[1];
                System.out.println("Result: " + result);

            } else if (person == 4) {
                res=intro();
                if(res[1]==0){
                    System.out.println("Cannot divide by zero");
                }
                result = res[0] / res[1];
                System.out.println("Result: " + result);
            } else {
                System.out.println("Incorrect operation!");
            }
            System.out.println("Application is completed!");
        }
    }
}
