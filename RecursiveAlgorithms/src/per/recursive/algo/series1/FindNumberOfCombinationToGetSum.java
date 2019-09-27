package per.recursive.algo.series1;

public class FindNumberOfCombinationToGetSum {
	/*
	 * 
	 * For my loved ones
	 * 
	 * 
	 */
	
	int count  = 0;
	public int findNumberOfCombination(int arr[],  int sum)
	{
		 int localsum = 0;
		 if(sum == 0) return 0;
		 int temp[] = leftarray(arr);
		 for(int i = 0 ; i < arr.length; i++)
		 {
			int repeatence = 0;
			if(sum != 0 && arr[i]!= 0)
			{
				repeatence =  sum/arr[i];
			}
			for(int j = repeatence ; j >0 ; j--)
			{
				int remaning_sum = sum - arr[i]*j;
				localsum = arr[i]*j + findNumberOfCombination( temp, remaning_sum);
				if(localsum == sum)
					count++;
			}
			
		 }
		 return count; 
	}
	
	public int[] leftarray(int arr[])
	{
		int res[] = new int[arr.length];
		for(int i = 1 ; i< arr.length; i++)
		{
			res[i] = arr[i];
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  new int[]{1,3,5};
		int sum = 6;
		FindNumberOfCombinationToGetSum test = new FindNumberOfCombinationToGetSum();
		
		System.out.println(test.findNumberOfCombination(arr,6));
		

	}

}
