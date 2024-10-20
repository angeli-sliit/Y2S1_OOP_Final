package June2024_vB_Q4;

public class SoundOffCommand implements Command {
	SoundSystem ss;
	
	public SoundOffCommand(SoundSystem ss) {
		this.ss=ss;
	}
	@Override
	public void execute() {
		ss.turnOff();
	}

}
