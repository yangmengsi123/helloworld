public class SayHello {
    public static void main(String[] args) {
        System.out.println("Below is the function of sayhello");
  sayHello(sum());
    }
 
 public static void sayHello(int sum){
  System.out.println("say Hello!"+sum);
 }
 
 public static int sum(){
  int sum = 0;
  for(int i=0;i<=100;i++){
   sum = sum + i;
  }
  return sum;
 }
}