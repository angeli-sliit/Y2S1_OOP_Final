package June2024_vB_Q4;

public class SoundOnCommand implements Command {
	SoundSystem ss;
	
	public SoundOnCommand(SoundSystem ss) {
		this.ss=ss;
	}
	@Override
	public void execute() {
		ss.turnOn();

	}

}
