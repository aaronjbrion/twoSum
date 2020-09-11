public class makeSum{
	public static int [] twoSum(int[] num, int sum){
		for (int i=0; i<num.length; i++){
			for (int j=0; j<num.length; j++){
				if (num[i] + num[j] == sum && num[i]!=num[j]){
					return new int[] {i, j};
				}	
			}
		}
		return new int[] {-1, -1};
	}
	public static void main(String args[]){
		int target = 9;
		int secondTarget = 40;
		int[] firstArray = {12, 7, 2, 8};
		int[] secondArray = {2, 12, 9, 8};
		int[] thirdArray = {1, 13, 18, 20, 20, 30};

		int[] indexes = twoSum(firstArray, target);
		if (indexes.length == 2){
			System.out.println(indexes[0] + " " + indexes[1]);
		}
		else {
			System.out.println("No two indexes add up to the target");
		}

		int[] secondIndexes = twoSum(secondArray, target);
		if (secondIndexes.length == 2){
			System.out.println(secondIndexes[0] + " " + secondIndexes[1]);
		}
		else {
			System.out.println("No two indexes add up to the target");
		}

		int[] thirdIndexes = twoSum(thirdArray, secondTarget);
		if (thirdIndexes.length == 2){
			System.out.println(thirdIndexes[0] + " " + thirdIndexes[1]);
		}
		else {
			System.out.println("No two indexes add up to the target");
		}
	}
}