package phonemes;

public enum POA implements Comparable<POA> {
	
	BILABIAL, 
	LABIODENTAL, 
	DENTAL,
	ALVEOLAR,
	POSTALVEOLAR, 
	RETROFLEX,
	ALVEOPALATAL,
	PALATAL,
	VELAR, 
	UVULAR,
	PHARYNGEAL,
	EPIGLOTTAL,
	GLOTTAL,
	
	ANY;
	
	// TODO there might need to be some methods here too
	
	// TODO we will start with the very basic system (just have 
	// TODO a category for every main POA), and find a way to expand
	// TODO it later. I would like, eventually, to be able to use
	// TODO more general category labels, but that might not be 
	// TODO feasible in the first versions of this program. 
	
	/*
	 * TODO 
	 * 
	 * Let's think of ways that this could be made more convenient
	 * in the future. Maybe we would allow columns to be expanded in 
	 * the editor, and then collapsed in the eventual view version. 
	 * 
	 */
	
	
	/*
	 * Gets the string that will serve as the name for this POA
	 */
	public String getName() {
		switch(this) {
		case BILABIAL: return "Bilabial";
		case LABIODENTAL: return "Labiodental";
		case DENTAL: return "Dental"; 
		case ALVEOLAR: return "Alveolar"; 
		case POSTALVEOLAR: return "Postalveolar"; 
		case RETROFLEX: return "Retroflex"; 
		case ALVEOPALATAL: return "Alveopalatal"; 
		case PALATAL: return "Palatal"; 
		case VELAR: return "Velar"; 
		case UVULAR: return "Uvular"; 
		case PHARYNGEAL: return "Pharyngeal"; 
		case EPIGLOTTAL: return "Epiglottal";
		case GLOTTAL: return "Glottal";
		case ANY: return "Any"; 
		default: return "Unknown"; 
		}
	}

}
