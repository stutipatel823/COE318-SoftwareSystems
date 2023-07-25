public class Count {
    int value;
    int end;

   public Count(int start, int end){
    value = start;
    this.end = end;

   }

   public void increment() {
       if(value<end){
        value++;   
       }
       else{
        System.out.println("Error: starting point is not less than ending point");
       }
   }
   public void decrement() {
       if(value>end){
        value--;   
       }
       else{
        System.out.println("Error: starting point is not greater than ending point");
       } 
   }
   public int getValue() {
      return value; 

   }

}

