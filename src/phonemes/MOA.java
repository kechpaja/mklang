package phonemes;

public enum MOA implements Comparable<MOA> {
	
	NASAL, 
	STOP,
	FRICATIVE,
	APPROXIMANT, 
	TAP,
	TRILL, 
	
	ANY; // For when we don't know which 
	
	
	// TODO Add things like nasal friactives. Not sure how to deal
	// TODO with them, since they are so rare. Maybe they should be part
	// TODO of this setup, or perhaps they should be elsewhere. 
	// TODO We could make stops and nasals the same here, and have
	// TODO nasality be an additional feature? 
	
	
	
	/*
	 * Gets the string that will serve as the name for this MOA
	 */
	public String getName() {
		switch(this) {
		case NASAL: return "Nasal"; 
		case STOP: return "Stop";
		case FRICATIVE: return "Fricative"; 
		case APPROXIMANT: return "Approximant"; 
		case TAP: return "Tap";
		case TRILL: return "Trill"; 
		case ANY: return "Any"; 
		default: return "Unknown"; 
		}
	}

}
