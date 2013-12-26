package phonemes;

public enum Voicing {
	
	UNVOICED, 
	VOICED,
	ANY;
	
	public String getName() {
		switch(this) {
		case UNVOICED: return "Unvoiced"; 
		case VOICED: return "Voiced"; 
		case ANY: return "Any"; 
		default: return "Unknown"; 
		}
	}

}
