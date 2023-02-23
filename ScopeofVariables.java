import java.util.*;

class ScopeofVariables {
	
	// public static void main(String args[]) {
	// 	int x = 10, y = 20; // Declaration
	// 	{
	// 		System.out.println(x + " " + y); // 10 20
	// 	}
	// 	{
	// 		x = 15; // Assignment
	// 		System.out.println(x + " " + y); // 15 20
	// 	}
	// 	System.out.println(x + " " + y); // 15 20
	// }
	
	// public static void main(String args[]) { 
	// 	int x = 10; // 18-27
	// 	{ 
	// 		int y = 20; // 20-22
	// 		System.out.println(x + " " + y); // 10 20
	// 	} 
	// 	{ 
	// 		System.out.println(x + " " + y); 
	// 	} 
	// 	System.out.println(x + " " + y); 
	// }
	
	public static void main(String args[]) {
		int x = 10; // 30-40
		{
			int y = 20; // 32-34
			System.out.println(x + " " + y); // 10 20
		}
		{
			int y = 15; // 36-38
			System.out.println(x + " " + y); // 10 15
		}
		System.out.println(x); // Error
	}
}