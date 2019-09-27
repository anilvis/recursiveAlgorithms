package per.recursive.random.algo;

public class BusStopProblem {
	
	public static int[] busStops(int noOfStops, int[] totalBoardingBuses)
	{
		int[] result = new int[noOfStops];
		
		for(int i = 1; i<=noOfStops ; i++)
		{
			int totalNoOfOriginating = 0;
			// for first bus stop it will be same
			if(i == 1)
			{
				result[i-1] = totalBoardingBuses[i-1];
			}
			else
			{
				// now find all the factors and add
				for(int j = 1; j<i; j++)
				{
					if(i%j == 0)
					{
						totalNoOfOriginating+= result[j-1];
					}
				}
				result[i-1] = totalBoardingBuses[i-1] - totalNoOfOriginating;
				
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		int arry[] = {2,7};
		int res [] = new int[3];
		res = busStops(2,arry);
		for(int i = 0; i<res.length; i++)
		{
			System.out.println(res[i]);
		}
		
	}
	
}
