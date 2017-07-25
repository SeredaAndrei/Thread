
public class Clocks {

	static Seconds S;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Zapusjaem sekundomer");
		
		S = new Seconds();
		
		
		
		
		for(int i=0;i<60;i++){

			Thread myS = new Thread(S);
		
			myS.start(); 
			//Thread.sleep(1000L); 
			
			}
			
			System.out.println("Zavershen main potok");
	}

}
