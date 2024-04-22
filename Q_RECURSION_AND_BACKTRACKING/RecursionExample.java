package Q_RECURSION_AND_BACKTRACKING;

  public class RecursionExample {

   static void function(int n){
       if(n==0){
           return;
       }
       System.out.println(n);
       function(n-1);
   }

      static void functionRev(int n){
          if(n==0){
              return;
          }
          functionRev(n-1);
          System.out.println(n);
      }

      static void functionBoth(int n){
          if(n==0){
              return;
          }
          System.out.println(n);
          functionBoth(n-1);
          System.out.println(n);
      }

      public static void main(String[] args) {
          functionBoth(5);
      }
}
