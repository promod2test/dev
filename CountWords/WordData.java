package countWords;

public class WordData {
	    public int getFrequency() {
	        return frequency;
	    }

	    public void setFrequency(int frequency) {
	        this.frequency = frequency;
	    }

	    public String getWord() {
	        return word;
	    }

	    public void setWord(String word) {
	        this.word = word;
	    }

	    private int frequency=0;
	    private String word;

	    public WordData(int frequency, String word) {
	        this.frequency = frequency;
	        this.word = word;
	    }

	    public void increaseFrequency(){
	        this.frequency =this.frequency+1;
	    }
	}

