class DateT {

 static void main(String []args) {
     Date date = new Date();
     
     println(date);
      System.out.println(date.toString());
     date = new Date(1000000000000);
      println(date);
      date.after();
       println(date);
 }

}