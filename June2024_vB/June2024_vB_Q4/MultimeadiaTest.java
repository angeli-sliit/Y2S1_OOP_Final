package June2024_vB_Q4;

public class MultimeadiaTest {

	public static void main(String[] args) {
		Television tv = new Television();
		SoundSystem ss = new SoundSystem();
		
		RemoteControl rc = RemoteControl.getinstence();
		
		Command tvOn = new TvOnCommand(tv);
        Command setChannel = new SetChannelCommand(tv, 101);
        Command soundOn = new SoundOnCommand(ss);
        Command increaseVolume = new IncreaseVolumeCommand(ss);

		rc.setCommand(0, tvOn);
		rc.setCommand(1, setChannel);
		rc.setCommand(2, soundOn);
		rc.setCommand(3, increaseVolume);
		
		rc.pressButton(0);
		rc.pressButton(1);
		rc.pressButton(2);
		rc.pressButton(3);
		
	}

}
