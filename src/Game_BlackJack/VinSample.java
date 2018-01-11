package Game_BlackJack;

public class VinSample {

	public static void main(String[] args)
	{
		int count = 0;
            System.out.println("the number of numbers between 1 and 1 million that are evenly divisible by 9, 13, 27, or 81");
		for(int i = 81; i <= 1000000; i = i + 1)//looping through 81 to 1000000
		{
                    //System.out.println("value of i is "+i);
			if(i % 9 == 0 && i % 13==0 && i%27==0 && i%81==0)// conditions checking
			{
				
                            System.out.println("inside value of i divisible by 9,13,27 and 81 is "+i);
				count = count + 1; // counting variable incremnts
			}
			
		}
		System.out.println("Answer is "+count);
	}

}
