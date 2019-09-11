package enhance_for_loop;

public class Enhance_For_Loop {

	public static void main(String[] args) {
		
		int[] numbers= {10,20,30,40,50};
		
		for(int info : numbers)
		{
			if(info==30)
			{
				System.out.println("print the info value:"+info);
				
				
			}
		}
		
		String[] names= {"deshan","joseph","bevin"};
		
		for(String friends : names)
		{
			if(friends=="joseph")
			{
				System.out.println("print the friends names:"+friends);
				
				
			}
		}
	}
}
