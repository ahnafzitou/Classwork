package listclasswork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class liststuff 
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
	}
	public static List<Integer> removeDupes(List<Integer> nums)
	{
		Collections.sort(nums);
		for(int i = 0; i < nums.size(); i++)
		{
			Integer x = nums.get(i);
			for(int j = i+1; j < nums.size(); j++)
			{
				Integer y = nums.get(j);
				if(x.compareTo(y) == 0)
				{
					nums.remove(j);
				}
			}
		}
		return nums;
		
	}

}
