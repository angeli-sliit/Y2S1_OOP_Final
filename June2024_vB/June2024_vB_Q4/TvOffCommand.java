package June2024_vB_Q4;

public class TvOffCommand implements Command {
	Television tv;
	
	public TvOffCommand(Television tv) {
		this.tv=tv;
	}
	@Override
	public void execute() {
		tv.turnOff();

	}

}
