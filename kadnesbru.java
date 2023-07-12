public class kadnesbru{
	public static void main(String args[]){
		int arr[] = {1,2,3,4};
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				int sum =0;
			for(int k =i;k<=j;k++){
				sum = sum+arr[k];
			}
			if(max < sum){
				max = sum;
			}
		}
	}
		System.out.println(max);
	}
}

