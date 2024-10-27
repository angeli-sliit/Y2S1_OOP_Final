package Q1;



public class SatelliteDemo {

	public static void main(String[] args) {
		ISatellite navigationSatellite = new NavigationSatellite("Ravana-01");
		IGeoLocation locationTracker1 = new SatelliteLocation("SriLanka");
		ISatellite droneSatellite = new DroneSatellite("Ravana-02");
		IGeoLocation locationTracker2 = new SatelliteLocation("Russia");
		
		ISatellite[] satelliteArray = new ISatellite[] {navigationSatellite,droneSatellite};
		IGeoLocation[] trackerArray = new IGeoLocation[] {locationTracker1,locationTracker2};
		
		SatalliteCenter satalliteCenter = new SatalliteCenter(0, satelliteArray, trackerArray);
		satalliteCenter.startService();
		satalliteCenter.stopService();
		satalliteCenter.locationService();
		
		SatalliteCenter remoteConroller2 = new SatalliteCenter(1, satelliteArray, trackerArray);
		remoteConroller2.startService();
		remoteConroller2.stopService();
		remoteConroller2.locationService();
		
		

	}

}

class SatalliteCenter{
	ISatellite[] iSatellite;
	IGeoLocation[] iGeoLocation;
	int option;
	
	public SatalliteCenter(int option, ISatellite[] iSatellite, IGeoLocation[] iGeoLocation) {
		super();
		this.iSatellite = iSatellite;
		this.iGeoLocation = iGeoLocation;
		this.option = option;
	}
	
	public void startService() {
		if(option == 0) {
			iSatellite[0].active();
		}
		else if (option == 1) {
			iSatellite[1].active();
		}
	}
	
	public void stopService() {
		if(option == 0) {
			iSatellite[0].deactive();
		}
		else if (option == 1) {
			iSatellite[1].deactive();
		}
	}
	
	public void locationService() {
		if(option == 0) {
			iGeoLocation[0].displayLocation();
		}
		else if (option == 1) {
			iGeoLocation[1].displayLocation();
		}
	}
	
}


interface ISatellite {
	public void active();
	public void deactive();
}


interface IGeoLocation {
	public void displayLocation();
	
}

class DroneSatellite implements ISatellite{
	String name;
	
	public DroneSatellite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void active() {
		System.out.println(name + " drone satellite active");
		
	}

	@Override
	public void deactive() {
		System.out.println(name + " drone satellite deactive");
		
	}
	 
}

class NavigationSatellite implements ISatellite{
	
	String name;
	
	public NavigationSatellite(String name) {
		super();
		this.name = name;
	}
	@Override
	public void active() {
		System.out.println(name + " navigational satellite active");
		
	}

	@Override
	public void deactive() {
		System.out.println(name + " navigational satellite deactive");
		
	}
	 
}




class SatelliteLocation implements IGeoLocation{
	String location;
	
	public SatelliteLocation(String location) {
		super();
		this.location = location;
	}

	@Override
	public void displayLocation() {
		System.out.println("Satellite Location is = " + location);
		System.out.println();
		
	}
	
}
