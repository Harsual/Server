package serverpackage;

import java.io.BufferedReader;
import java.io.IOException;

public class RecievePing implements Runnable {

    private BufferedReader var;

    public RecievePing(BufferedReader br) {
        this.var = br;
    }

    

	public void run() {
        // code in the other thread, can reference "var" variable
    	String request;
    	
    	try 
    	{
    	
    		while(true)
    		{
    		
				request = var.readLine();
				
				if(request.equals("quit")) break;
				
				
				System.out.println(request);
			} 
    		
    		System.out.println("Client has quit the connection");
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
    	}
    }
}