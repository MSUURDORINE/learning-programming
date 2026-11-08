import java.util.Scanner;
  public class studentGrade{
    public static void main(String[] args){
    
      Scanner input  = new Scanner(System.in);
      
      System.out.println("Enter a score");
      int score = input.nextInt();
      
      if(score >= 90 && score <= 100){
          System.out.println("B");
          
      }else if (score >= 80 && score <= 89){
          System.out.println("C");
          
      }else if (score >= 70 && score <= 79){
          System.out.println("D");
          
      }else if (score >= 60 && score <= 69){
          System.out.println("F");
      }else{
          System.out.println("invalid score");
    }
  }
}
