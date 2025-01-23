package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);


       // output(queen.doYourJob());
        //output(queen.fly());
       // output("--------------");

       // output(worker.doYourJob());
       // output(worker.fly());
       // output("--------------");


       // output(drone.doYourJob());
      //  output(drone.fly());
        //output("--------------");


        //pollOb= Objektabfrage

        
    }

   
    private static void pollObj(Queen obj){

        output(obj.doYourJob());
        output(obj.fly());
        output("--------------");


    }               

   


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

