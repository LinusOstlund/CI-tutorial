public class Algorithms{

	public static void main(String[] args){
	System.out.println("Hello CI!");	
	for (int i = 0; i < 5; i++){
		printHelloWorld();	
	}	

}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
 }

public static void printHelloWorld(){
System.out.println("Hello World!");
}

}
