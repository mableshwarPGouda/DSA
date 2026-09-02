public class GrumpyBookstoreOwner {
    int satisfiedCustomers(int [] customers , int [] groompy , int time){

        int sat_customers = 0;

        for(int i =0 ;i<customers.length;i++){
            if(groompy[i]==0){
                sat_customers+=customers[i];
            }
        }
      

        int extra_cust =0;
       
        for(int i =0 ;i< time ;i ++){
            if(groompy[i]==1){
                extra_cust += customers[i];
            }
        }

         int mx_extra_cust = extra_cust;

         for(int i =time ;i<customers.length;i++){

         
           if(groompy[i]==1){
            extra_cust += customers[i];
           }
           if(groompy[i-time]==1){
            extra_cust-=customers[i-time];
           }

           if(mx_extra_cust < extra_cust){
            mx_extra_cust = extra_cust;
           }
         }
         return mx_extra_cust + sat_customers ;
    }

    public static void main(String[] args) {
        int [] customers = {1, 0, 1, 2, 1, 1, 7, 5};
        int [] groompy = {0, 1, 0, 1, 0, 1, 0, 1};
        int time = 3 ;

       GrumpyBookstoreOwner obj = new GrumpyBookstoreOwner();

        int max_satisfied_customer = obj.satisfiedCustomers(customers, groompy, time);

        System.out.println("the maximum customers that can be satisfied are : "+max_satisfied_customer);
    }
}
