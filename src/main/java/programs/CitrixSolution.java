package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CitrixSolution {

	public final static char DUMMY_CHARACTER = '#';
	public final static char SPACE = ' ';

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfVeriticalLines = Integer.parseInt(input.nextLine());
		int numberOfLines = Integer.parseInt(input.nextLine());
		List<String> wordsWithinStrip = new ArrayList<String>();

		for (int i = 0; i < numberOfVeriticalLines; i++) {
			wordsWithinStrip.add(input.nextLine());
		}
		int numberOfDictoryWords = Integer.parseInt(input.nextLine());

		List<String> dictionaryWords = new ArrayList<String>();

		for (int i = 0; i < numberOfDictoryWords; i++) {
			dictionaryWords.add(input.nextLine());
		}

		StringBuffer[] buffers = new StringBuffer[numberOfLines];
		for (int i = 0; i < numberOfLines; i++) {
			buffers[i] = new StringBuffer();	
			for (String eachWord : wordsWithinStrip) {
				for (int j = 0; j < eachWord.length(); j++) {
					
					buffers[i].append(eachWord.charAt(j));
				}
			}
		}
		List<String> result = new ArrayList<String>();
		for (StringBuffer eachUnorderedLine : buffers) {
			for (int i = 0; i < eachUnorderedLine.length(); i++) {
				// take each character in the unOrderedText and check for a
				// dictionary words list.
				if (eachUnorderedLine.charAt(i) != DUMMY_CHARACTER && eachUnorderedLine.charAt(i) !=SPACE) {
					List<String> matchingWords = getMatchingWordsFromDictionary(eachUnorderedLine.charAt(i), dictionaryWords);
					// for each of the matching words find eachUnorderedLine has all the chars.
					String fullyPresentMatchingWord = getFullyPresentMatchingWord(matchingWords, eachUnorderedLine);
					System.out.println("char "+eachUnorderedLine.charAt(i) + " "+fullyPresentMatchingWord);
					result.add(fullyPresentMatchingWord.concat(" "));
					removeFullMatchingWordFromLine(fullyPresentMatchingWord,eachUnorderedLine);
					System.out.println(eachUnorderedLine);
					
				}
			}
			result.add("\n");
		}
		
		for (String eachResult : result)
		{
			System.out.println(eachResult);
		}

	}

	private static void removeFullMatchingWordFromLine(String fullyPresentMatchingWord, StringBuffer eachUnorderedLine) {
		String temp;
		for (char c : fullyPresentMatchingWord.toCharArray()) {
			temp=eachUnorderedLine.toString().replace(c, DUMMY_CHARACTER);
		}
		
	}

	private static String getFullyPresentMatchingWord(List<String> matchingWords, StringBuffer eachUnorderedLine) {
		for (String wordToBeChecked : matchingWords) {
			if (isWordFullyPresent(wordToBeChecked, eachUnorderedLine)) {
				return wordToBeChecked;
			}
		}
		return null;
	}

	private static boolean isWordFullyPresent(String wordToBeChecked, StringBuffer eachUnorderedLine) {
		boolean isAllCharsPresent=true;
		for (char c : wordToBeChecked.toCharArray())
		{
			isAllCharsPresent=isAllCharsPresent && eachUnorderedLine.toString().contains(String.valueOf(c));
		}
		return isAllCharsPresent;
	}

	private static List<String> getMatchingWordsFromDictionary(char c,List<String> dictionaryWords) {
		List<String> matchingWords= new ArrayList<String>(); 
		for (String eachdictionaryWord : dictionaryWords)
		{
			if(eachdictionaryWord.contains(String.valueOf(c))){
				matchingWords.add(eachdictionaryWord);
			};
		}
		return matchingWords;
	}
}
