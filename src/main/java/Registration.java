package src.main.java;

import java.util.ArrayList;

public class Registration extends Thread {
    private int spots = 6;
    ArrayList<String> spaces = new ArrayList<>();
    private Object lock = new Object();
    private String name;


    public Registration(String name) {
        this.name = name;
    }

    public void register(String studentName) {
        synchronized (lock) {
            if (spots > 0) {
                System.out.println(studentName + " is registering. There are " + spots + " left");
                spaces.add(studentName);
                spots--;
                System.out.println(studentName + " Registered");
            } else {
                System.out.println(studentName + " tried to register but no spots were left");
            }
        }
    }

    public int getSPotCount() {
        return spots;
    }

    @Override
    public void run() {
        register(this.name); 

 
        for (int i = 0; i < 3; i++) { 
            System.out.println(this.name + " has started some post-registration activity.");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.name + " finished post-registration activity.");
    }
}