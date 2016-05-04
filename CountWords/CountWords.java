package countWords;

import java.io.File;
//import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWords {
	
	   public static void main( String args[]) {
	        TreeMap<String, WordData> Words = new TreeMap<String, WordData>();
	        int total =0;
	        try {
	        	System.out.println("==============WordCounter==============");
	        	System.out.println("Bitte geben Sie den Pfad der Datei an:");
	        	Scanner input = new Scanner(System.in);
	            File f1 = new File(input.next());
	            Scanner scan1 = new Scanner(f1, "UTF-8");
	            String word, line;
	            WordData wordData;
	            String[] wordsOfLine;
	            
	            while (scan1.hasNext()) {
	                line = scan1.nextLine().toLowerCase().trim(); //.replaceAll(",", "")
	                wordsOfLine = line.split("\\s");
	                
	                for (int i = 0; i < wordsOfLine.length&&wordsOfLine[i]!=""; i++) {

	                    word = wordsOfLine[i].trim();
	                    if (Words.get(word)==null){
	                        wordData = new WordData(1, word);
	                        Words.put(word, wordData);
	                        total =total+1;
	                    } else {
	                        wordData = Words.get(word);
	                        wordData.increaseFrequency();
	                        Words.put(word, wordData);
	                        total =total+1;
	                    }
	                }
	            }
	            System.out.println("\n Die Datei enthält folgende Worte(Anzahl:"+total+"):\n" );
	            for (WordData s : Words.values()){
	            	
	                System.out.println(s.getWord() +" (" + s.getFrequency()+")");
	            }
	            
                input.close();
                scan1.close();
                
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        
	        }
}

