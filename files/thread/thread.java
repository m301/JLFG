//Program for Mutithread

class NewThread implements Runnable{
	String name;
	Thread t;
	boolean suspendFlag;
	
	NewThread(String t_name){
		name=t_name;
		t=new Thread(this,name);
		System.out.println("New Thread "+t+" has begun");
		suspendFlag=false;
		t.start();
	}
	
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println(name+" : "+i);
				Thread.sleep(1000);
				synchronized(this){
					while(suspendFlag){
						wait();
					}
				}
			}
		}catch(InterruptedException e){
			System.out.println("Thread Interrupted "+e);
		}
		System.out.println("Thread "+name+" has exited.");
	}
	void threadSuspend(){
		suspendFlag=true;
	}
	
	synchronized void threadResume(){
		suspendFlag=false;
		notify();
	}
}

class thread{
	public static void main(String args[]){
		NewThread One=new NewThread("ThreadOne");
		NewThread Two=new NewThread("ThreadTwo");
		
		try{
			Thread.sleep(1000);
			One.threadSuspend();
			System.out.println("Thread Two Suspended");
			
			Thread.sleep(1000);
			One.threadResume();
			System.out.println("Thread Two Resumed");
			
			Thread.sleep(1000);
			Two.threadSuspend();
			System.out.println("Thread One Suspended");
			
			Thread.sleep(1000);
			Two.threadResume();
			System.out.println("Thread Two Resumed");
		}catch(InterruptedException e){
			System.out.println("Thread Interrupted "+e);
		}
		try{
			System.out.println("Waiting for thread for finish");
			One.t.join();
			Two.t.join();
		}catch(InterruptedException e){
			System.out.println("Thread Interrupted "+e);
		}
	}
}
