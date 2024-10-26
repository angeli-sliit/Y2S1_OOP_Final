package June2024_vB_Q4;

public class IncreaseVolumeCommand implements Command {
	SoundSystem ss;
	
	public IncreaseVolumeCommand(SoundSystem ss) {
		this.ss=ss;
	}

	@Override
	public void execute() {
		ss.increaseVolume();
		
	}

}
