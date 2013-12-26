package phonemes;

import java.util.ArrayList;

public class Series extends ArrayList<Phoneme> {

	/**
	 * ???
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 * TODO A field for the place or manner of articulation
	 * associated with this series is needed. However, that 
	 * probably means some sort of union of all POA and MOA
	 * items. 
	 */
	private POA poa_; 
	private MOA moa_; 
	private Voicing voicing_; 
	
	
	/*
	 * The main constructor. 
	 * 
	 * TODO needs to take another argument, for other features. 
	 * 
	 * How do we represent prenasalized consonants? Coarticulates? TODO
	 */
	public Series(POA poa, MOA moa, Voicing voicing) {
		poa_ = poa; 
		moa_ = moa; 
		voicing_ = voicing; 
	}
	
	
	
	
	/*
	 * A series, say of voiced sounds or of fricatives. 
	 * 
	 */
	
	

}
