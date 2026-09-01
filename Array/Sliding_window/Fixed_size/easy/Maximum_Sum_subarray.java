public class MaxSum1 {
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
        int [] a ={100,4,6,7,3,4,8,1,9,400};
        int k = 3;
        MaxSum1 obj = new MaxSum1();
        int mx = obj.maxSum(a,k);

        System.out.println("max sum : "+ mx);
    }
}
