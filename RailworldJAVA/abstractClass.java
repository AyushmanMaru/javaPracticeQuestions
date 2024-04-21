abstract class Rbi {
	abstract void interest();	
}
class Sbi extends Rbi{
	void interest(){
		System.out.println("interest is 10%");
	}	
}
class Icici extends Rbi{
	void interest(){
		System.out.println("interest is 8%");
	}	
}
class Main {
		public static void main(String aa[]){
			Rbi rb = new Sbi();
			rb.interest();
		}
	}