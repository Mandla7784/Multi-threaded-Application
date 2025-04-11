package src.main.java;

class MultiThreadApplication extends Thread{
    public static void main(String [] rgs){
       Registration registration = new Registration("Registraion");
        

       Thread student_1 = new Thread(() -> registration.register("Mandla"));
       Thread student_2 = new Thread(() -> registration.register("Benjamin"));
       Thread student_3 = new Thread(() -> registration.register("Kilo"));
       Thread student_4 = new Thread(() -> registration.register("Gang"));

       student_1.start();
       student_2.start();
       student_3.start();
       student_4.start();

       // You might want to wait for these threads to finish
       try {
           student_1.join();
           student_2.join();
           student_3.join();
           student_4.join();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

       System.out.println("Final spot count: " + registration.getSPotCount());
       System.out.println("Registered students: " + registration.spaces);
    

    }

}