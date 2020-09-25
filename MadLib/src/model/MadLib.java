package model;

//Luke Xiong

public class MadLib {
	
	private String words;
	private String adjective;
	private String noun;
	private String verb;
	
	public MadLib() {
		super();
	}
	//changed words to adjective
	public MadLib(String adjective, String noun, String verb) {
		super();
		this.adjective = adjective;
		this.noun = noun;//added this
		this.verb = verb;
		//This line was rewriting all the instance variables with final values.
		//setLib(adjective, noun, verb); //error
	}
	//changed words to adjective
	public void setWords(String adjective, String noun, String verb) {
		this.adjective = adjective;
		this.noun = noun;//added this
		this.verb = verb;
		//setLib(adjective, noun, verb); //throwing error status 500
	}
	
	public void setLib(String adjective, String noun, String verb) {
		final String WORDS = "word";
		final String ADJECTIVE = "adjective";
		final String NOUN = "noun";
		final String VERB = "verb";
		
		setWords(ADJECTIVE.toUpperCase(), NOUN.toUpperCase(), VERB.toUpperCase()); //error
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
