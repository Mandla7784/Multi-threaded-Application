package src.main.java;

class MultiThreadApplication extends Thread{
    public static void main(String [] rgs){
       Registration registrstion  = new Registration();


       Thread student_1 = new Thread(()-> registrstion.register("Mandla"));
       Thread student_2 = new Thread(()-> registrstion.register("Benjamin"));
       Thread student_3 =  new Thread(()-> registrstion.register("Kilo"));
       Thread student_4 = new Thread(()-> registrstion.register("Gang"));
       


    

    }

}