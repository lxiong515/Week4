package model;

public class MadLib {
	
	private String words;
	private String adjective;
	private String noun;
	private String verb;
	
	public MadLib() {
		super();
	}
	
	public MadLib(String words) {
		super();
		this.words = words;
		setLib(words); //error
	}
	
	public void setWords(String words) {
		this.words = words;
		setLib(words); //throwing error status 500 - fixed
	}
	
	public void setLib(String words) {
		final String WORDS = null;
		final String ADJECTIVE = null;
		final String NOUN = null;
		final String VERB = null;
		
		setWords(WORDS.toUpperCase()); //error
		setAdjective(ADJECTIVE.toUpperCase());
		setNoun(NOUN.toUpperCase());
		setVerb(VERB.toUpperCase());
	}
	
	@Override
	public String toString() {
		return "I attend DMACC. I am a " + adjective + " student. I am studying " + noun + ". My academic standing is " + verb + ".";
	}

	public String getAdjective() {
		return adjective;
	}

	public void setAdjective(String adjective) {
		this.adjective = adjective;
	}

	public String getNoun() {
		return noun;
	}

	public void setNoun(String noun) {
		this.noun = noun;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public String getWords() {
		return words;
	}
	
	

}
