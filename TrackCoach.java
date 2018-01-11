package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	
	//Define a private field for the dependency
		private FortuneService fortuneService;
		
		
		public TrackCoach(FortuneService fortuneService) {
			this.fortuneService = fortuneService;
		}
		
	

	@Override
	public String getDailyWorkOut() {
		
		return "Run 5 miles";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	//on start
	public void weStartHere() {
		System.out.println("This is the initialization method define in the configuration file");
	}
	
	//on destroy
	public void weEndHere() {
		System.out.println("This is the on destroy method defined in the configuration file");
	}
	
	
}
