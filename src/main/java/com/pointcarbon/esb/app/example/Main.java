package com.pointcarbon.esb.app.example;

public class Main {

    public static void main(String[] args) throws Exception {
         
        if (args.length > 0 && "stop".equals(args[0])) {
            System.out.println("stopped");
            System.exit(0);
        } else {
            System.out.println("Hello maven");
            //1
            //2
            System.out.println();
        }
    }

}
