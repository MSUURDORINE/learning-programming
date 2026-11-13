public class countGreaterThan{
  public static void main(String[] args){
    int[] numbers =  {3, 7, 2, 9, 5, 1, 8}; 
        int result = countGreaterThan(numbers, 5);
           System.out.println(result);
  }
  
    public static int countGreaterThan (int[] numbers, int threshold){
        int count = 0;
      for ( int index = 0; index < numbers.length; index++){
        if(numbers[index] > threshold){
            count++;
           } 
          }
          return count;
    }  
}

