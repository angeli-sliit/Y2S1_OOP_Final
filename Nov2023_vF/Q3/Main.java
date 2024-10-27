package Q3;

 class ResourceManager {
	boolean[] r;
	
	public ResourceManager(int tResources) {
		super();
		this.r = new boolean[tResources];
	}
	public synchronized int requestResource(int userID) {
		while(true) {
			for(int i = 1; i<r.length; i++) {
				if(!r[i]) {
					r[i]=true;
					System.out.println("User "+ userID +" acquires Resource " + i);
					return i;
				}
			}
			 try {
	                System.out.println("User " + userID + " is waiting for a resource.");
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
			
		}
		
	}
	 public synchronized void releaseResource(int resourseId, int userId){
		 r[resourseId]=false;
		 System.out.println("User "+ userId + " relese resource " + resourseId);
		 notifyAll();
	 }
}

public class  Main{
	 public static void main(String[] args){
		 int  TResources  =   3;
		 int  TUsers  =  5;
		 ResourceManager rm  = new ResourceManager(TResources);
		 for(int i = 1; i <= TUsers; i++){
			 UserThread  userThread  =  new  UserThread(i, rm);
			 userThread.start( ) ;
		 }
	}
}


class UserThread extends Thread{
	int UserID;
	ResourceManager rm;
	
	public UserThread(int userID, ResourceManager rm) {
		super();
		UserID = userID;
		this.rm = rm;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				int resourseID = rm.requestResource(UserID);
				Thread.sleep(1000);
				rm.releaseResource(resourseID,UserID);
				Thread.sleep(1000);
	
			}
		 }
		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
