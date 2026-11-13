public class findAllOccurrences{
   public static void main(String[] args){
        int[] numbers =  {1, 2, 3, 2, 4, 2, 5}; 
        findAllOccurrences(numbers, 2);
      } 
      
   public static void findAllOccurrences (int[] numbers, int target){
      for ( int index = 0; index < numbers.length; index++){
        if(numbers[index] == target){
          System.out.println("Fount at index " + index);
       
       } 
    }  
  }  
}





