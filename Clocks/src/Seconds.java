
public class Seconds extends Thread {

	@Override
	public void run() {
		for(int i = 1; i < 60; i++)
		{
			try{
				sleep(1000L);		
			}catch(InterruptedException e){}
			
			System.out.println("Ne dumaj o sekundax s visoka" + " " + i);	
		}
		
	}
}
