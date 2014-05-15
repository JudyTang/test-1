package com.pointcarbon.esb.app.example;

public class Main {
	
	public static boolean flag = true;

    public static void main(String[] args) throws Exception {
         
        if (args.length > 0 && "stop".equals(args[0])) {
        	
        	flag = false;

        } else {
            
            new Thread(new Test()).start();
        }
    }
    

    

}

class Test implements Runnable {

	
	public void run()
	{
		if(!Main.flag)
		{
			System.out.println("I'm stopping");
			return;
			
		}	
		
		try {
			System.out.println("I'm running");
			Thread.sleep(5000);
			new Thread(new Test()).start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
