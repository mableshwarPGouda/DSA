public class Minimum_sum_subarray {

	int minSum( int [] a , int k ) {

		int current_sum = 0;
		for(int i =0 ;i<k ;i++){
			current_sum +=a[i];
		}

		int min = current_sum;

		for(int i=k ;i<a.length;i++){

			current_sum = current_sum - a[i-k ] +a[i];

			if( current_sum < min )
				min = current_sum;
		}
		return min ;
	} 

	public static void main(String [] args ){

		int [] a = { 1,5,3,7,6,2,1,4,5,9,1,2,7,1,2,4};
		int k = 3 ;

		Minimum_sum_subarray obj = new Minimum_sum_subarray();

                int mn = obj.minSum(a,k);

		System.out.println("the minimum sum is : " + mn);
	}
}
