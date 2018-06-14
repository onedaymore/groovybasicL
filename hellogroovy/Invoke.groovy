class Invoke{

 static void main(String []args) {
     sayHello();
    println (getSum(2,3));
    println (getSum('321321',3));
 }

 static void sayHello() {
  println("Hello, World !")
 }
 
 static def getSum(int a, int b) {
     return a + b;
 }
 
 static def getSum(def a, int b) {
     return a + b;
 }
}