import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args){
        /* 
        //string
        String intro = "I Am Sonali Rani Padhi";
        System.out.println(intro);

        //taking input and print
        Scanner scn = new Scanner(System.in); // This is the way we read the input
        int age = scn.nextInt();
        //float f = scn.nextFloat();
        //double d = scn.nextDouble();
        System.out.println("User's age is " + age);

        long orderid = scn.nextLong();
        System.out.println("Order Id is" + orderid);

        //string input
        // .next() -> Reads only one word from input10

        String name = scn.next();
        System.out.println("Users name is: " + name);

        String name2 = scn.nextLine(); //// .nextLine() -> Reads entire line from input
        System.out.println("Users name is: " + name);

        // Q1 : Take two names X and Y as input and print 
		// X love Y in the output */
        // Scanner scn = new Scanner(System.in);
        // String str1 = scn.nextLine();
        // String str2 = scn.nextLine();
        // System.out.println(str1 + " Loves " + str2);

        // Q2 : Take a name X and age Y as input and print
		// X age is Y in the output 
		// Example : 
		// Input
		// Ram 23
		// Output
		// Ram age is 23
        Scanner scn = new Scanner(System.in);
        String name1 = scn.next();
        int age = scn.nextInt();
        System.out.println(name1 + " age is " + age);


    }
}
