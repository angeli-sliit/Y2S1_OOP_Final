package June2024_vB_Q4;

public class TvOnCommand implements Command {

	Television tv;
	
	public TvOnCommand(Television tv) {
		this.tv=tv;
	}
	
	public void execute() {
		tv.turnOn();

	}

}
