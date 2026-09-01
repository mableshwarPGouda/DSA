public class Maximum_Sum_subarray  {
    public int maxSum(int [] a , int k ){
     int cs = 0;
     for(int i=0;i<k;i++){
           cs +=a[i];}
     int mx = cs;

    for(int i = k;i<a.length;i++){
      
       cs = cs + a[i] - a[i-k] ;
    
       if(cs>mx){
         mx = cs ;
        }

      }
      return mx ;

}
   public static void main(String[] args) {
        int [] a ={100,4,6,7,3,4,8,1,9,4};
        int k = 3;
        Maximum_Sum_subarray obj = new Maximum_Sum_subarray();
        int mx = obj.maxSum(a,k);

        System.out.println("max sum : "+ mx);
    }
}
