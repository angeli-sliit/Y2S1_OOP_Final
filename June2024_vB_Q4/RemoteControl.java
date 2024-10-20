package June2024_vB_Q4;

public class RemoteControl {
	private static RemoteControl remote;
	private Command[] commands;
	
	private RemoteControl() {
		commands= new Command[5];
	}
	
	public static RemoteControl getinstence() {
		if(remote == null) {
			remote = new RemoteControl();
		}
		return remote;
		
	}
	public void setCommand(int slot, Command command) {
		if (slot < commands.length) {
            commands[slot] = command;
        } 
		else {
            System.out.println("Invalid slot number");
        }
	}
	
	
	public void pressButton(int slot) {
		if(commands[slot] != null) {
			commands[slot].execute();
		}
		else {
	        System.out.println("No command assigned to slot " + slot);
	    }
	}
	
}
