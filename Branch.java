public class Branch {
     static void fun(int num){
         if(num<=0){
             return;

         }
         System.out.println(num);
         fun(num-1);
         fun(num-2);
     }
     public static void main(String[] args) {
         fun(4);
     }
 

	//  public static void main(String[] args) {
	//  	System.out.println("Hello World");
	//  print(4);
	//  }
	//  static void print(int num){
	//      if(num==0){
	//          return;
	//      }
	//      System.out.println(num);
	//      print(num-1);
	//      System.out.println(num);
	//  }
}


