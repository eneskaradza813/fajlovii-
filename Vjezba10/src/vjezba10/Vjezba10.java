package vjezba10;

import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class Vjezba10 {

    public static void main(String[] args) {

       File testDirectory = new File("C:\\Javalearning\\Vjzeba10");
       try{
           if(!testDirectory.exists()){
               testDirectory.mkdir();
               System.out.println("Created directory called: " + testDirectory.getName());
           }
           else{
               System.out.println("Directory called: " + testDirectory.getName() + "already exists");
           }
               
       }catch(Exception e){
           System.out.println("Couldn't create a directory called: " + testDirectory.getName());
       }
       
        
       
        
        
        
        
    }

}
