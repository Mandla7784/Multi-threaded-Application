package src.main.java;

public class Registration {
    private  int spots = 6;
    private Object lock = new Object();


    public void register(String studentName){
         // holding the lock 
         synchronized(lock){
             if(spots > 0){
                 System.out.println(studentName + "is registering"+ "There are " + spots + "left");
                 spots--;
                 System.out.println(studentName + "Registered");

             }else {
                 System.out.println(studentName + "tried to register but no spot were left");

             }
         }

    }


    
}
