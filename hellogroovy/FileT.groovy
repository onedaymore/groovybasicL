//import java.io.File

class FileT {
 static void main(String [] args) {
   File f = new File("E:/gitBig/groovy/hellogroovy/FileT.groovy");
   f.each{line -> println "line : $line";}
 }

}