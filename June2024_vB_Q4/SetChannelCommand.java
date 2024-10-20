package June2024_vB_Q4;

public class SetChannelCommand implements Command {

	Television tv;
	int channel;
	
	public SetChannelCommand(Television tv, int channel) {
		this.tv=tv;
		this.channel=channel;
		
	}
	@Override
	public void execute() {
		tv.setChannel(channel);

	}

}
