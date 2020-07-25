import java.util.*;
import java.io.*;
import java.util.function.Predicate;

class Average{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List < Integer> nums = new ArrayList<Integer>();
		System.out.println("Enter the size of list");
		int size = sc.nextInt();
		System.out.println("Enter the numbers");
		for(int i = 0; i < size; i++){
			nums.add(sc.nextInt());
		}
		float result = averageOfNums(nums,(Integer num) -> num != 0);
		System.out.println(result);
	}
	public static float averageOfNums(List<Integer> nums,Predicate<Integer> predicate){
		int ans = 0;
		int count = 0;
		for(Integer num : nums){
			if(predicate.test(num)){
				ans += num;
			}
			count++;
		}
		return ans / (count);
	}
}
