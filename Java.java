import java.util.*; //margin

class java {

    public static void main(String[] args){
        int a = 10, b = 5;  //1
        float c = (a * 1.0) / b; //2
        System.out. println(c); //3
       
		// System.out.print -> Prints in same line
		System.out.print("Hello World !");
        System.out.print("Hey There");

		// system.out.print("Hello World !"); -> Compilation error
		// System.out.print("My name is Aarnav Jindal");
		
		// System.out.println -> Prints and movees cursor to new line
		System.out.println("My name is Sonali Padhi");
		System.out.println("My age is 35");
        System.out.println(10);
        System.out.println(10+5);
        System.out.println(-10.3);
        System.out.print(8-5);
        System.out.print(10); //integer 10
        System.out.print("10"); //string output as 10

        //concatination
        System.out.println("Ram " + "Shyam");
        System.out.print("My age is" + 25);
        System.out.println("My age is" + 25 + 10); //Operations happens Left to right. So String gets the first preference.
        System.out.println(25 + 10 + "is My age"); // Now Int have first preference
		//Variables
        int i = 10;
        long l = 100000000000000l;
    
        float f = 10.10f;
        double d = -2324.2222222;
    
        System.out.println(i + " " + l + " " + f + " " + d);

        //typecasting
        int x1 = 10;
        long y1;
        y1 = x1;
        System.out.println(y1);

        long y2 = 1222222233333330l;
        int x2;
        x2 = (int)y2; //expicit typecasting
        System.out.println(x2); //garbage Value
    }
	
}