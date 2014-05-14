package com.pointcarbon.esb.app.example;

public class Main {
	
	public static boolean flag = true;

    public static void main(String[] args) throws Exception {
         
        if (args.length > 0 && "test".equals(args[0])) {
        	flag = false;
            System.out.println("stopped");
            System.exit(0);
        } else {
        	
        	while(flag)
        	{
				Thread.sleep(5000);
        		System.out.println("Hello maven");
        		
        	}
            
            
        }
    }

}
