package phonemes;

public enum Aspiration {
	
	UNASPIRATED, 
	ASPIRATED, 
	ANY; 
	
	public String getName() {
		switch(this) {
		case UNASPIRATED: return "Unaspirated"; 
		case ASPIRATED: return "Aspirated"; 
		case ANY: return "Any"; 
		default: return "Unknown"; 
		}
	}

}
