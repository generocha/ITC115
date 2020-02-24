	//**************************************
	// ITC 115 - Seattle Central College
	// Instructor Ava Meredith
	// Student1: Allessandra Lima
	// Student2: Gene Rocha
	// The Mid Term Exam 
	// ant 
	// The method ant that simulates an ant trying to crawl up a building of height 6 steps.
	// The ant starts on the ground, at height 0. Each iteration, the ant either crawls up one step,
	// or slips off and falls all the way back to the ground. There is a 50% chance on each iteration
	// that the ant will slip.
	//
	// By:  Gene Rocha 
	// Date: 02/20/2020
	//
	//**************************************

	public static void main(String[] args) {
		antCrawl();

	}
	public static void antCrawl() {
		int height = 0;
		int steps = 0;
		int fallsCount = 0;
		Random rand  = new Random();
		while(height < 6) {
			int step = rand.nextInt(2);
			if(step == 0) {//random number is 0 increment the height
				height++;
			}else {// random number is 1 the ant falls to the ground. height is 0
				height = 0;
				fallsCount++;
				
			}
		}
		System.out.println("number of falls: " + fallsCount);
		
	}
