public class Count_subArray_of_sizeK_sum_greater_then_threshold {
    
    int countSubArray(int [] a, int k , int threshold){
        int count =0;
        int current_sum = 0;
        for(int i =0 ;i<k ;i++){
            current_sum += a[i];
        }
        if(current_sum>threshold)
            count++;
        
        for(int i =k ;i<a.length ;i++){
            current_sum = current_sum + a[i]-a[i-k];

            if(current_sum>threshold)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {

        int [] a = {1,2,4,6,3,6,1,1,2,3,1};
        int k = 2;
        int threshold = 6;
        Count_subArray_of_sizeK_sum_greater_then_threshold obj = new Count_subArray_of_sizeK_sum_greater_then_threshold();
        int count = obj.countSubArray(a,k,threshold);
        System.out.println("Number of subArray whos sum greater then "+threshold+" is :"+count);
    }
}
