package com.mudigal.service;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mudigal.model.Word;

/***************************************
 * 
 * @author: Vijayendra Mudigal
 * @email: vijayendrap@gmail.com
 * 
 ***************************************/

@Service("baseService")
public class BaseServiceImpl {

	@Resource(name = "dictionaryService")
	private DictionaryServiceImpl dictionaryService;

	/**
	 * Uses Depth First Search algorithm to traverse through the two dimensional
	 * matrix to find out all possible words for Scramble with Friends Hack.
	 */
	public List<String> getAllWords(String[][] board) {
		List<String> wordsFound = new LinkedList<String>();
		Set<String> dictionary = dictionaryService.getWords();
		Set<String> allPossibleWords = new HashSet<String>(10000);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				List<String> currentPath = new LinkedList<String>();
				currentPath.add(i + "" + j);
				LinkedList<Word> queue = new LinkedList<Word>();
				Word word = new Word();
				word.setiPos(i);
				word.setjPos(j);
				word.setPath(currentPath);
				String sb = new String(board[i][j]);
				word.setWord(sb);
				queue.add(word);
				permuteWords(board, allPossibleWords, queue, word.getPath());
			}
		}
		for (String allPossibleWord : allPossibleWords) {
			if (dictionary.contains(allPossibleWord)) {
				wordsFound.add(allPossibleWord);
			}
		}

		return wordsFound;
	}

	private static void permuteWords(String[][] board,
			Set<String> allPossibleWords, LinkedList<Word> queue,
			List<String> currentPath) {

		if (!queue.isEmpty()) {

			Word wordFromQueue = queue.removeFirst();
			int i = wordFromQueue.getiPos();
			int j = wordFromQueue.getjPos();

			if (j < 3) {
				addToQueue(board, wordFromQueue.getWord(), i, j + 1,
						wordFromQueue.getPath(), queue);
				if (i > 0) {
					addToQueue(board, wordFromQueue.getWord(), i - 1, j + 1,
							wordFromQueue.getPath(), queue);
				}
			}

			if (i < 3) {
				addToQueue(board, wordFromQueue.getWord(), i + 1, j,
						wordFromQueue.getPath(), queue);
				if (j < 3) {
					addToQueue(board, wordFromQueue.getWord(), i + 1, j + 1,
							wordFromQueue.getPath(), queue);
				}
			}

			if (j > 0) {
				addToQueue(board, wordFromQueue.getWord(), i, j - 1,
						wordFromQueue.getPath(), queue);
				if (i < 3) {
					addToQueue(board, wordFromQueue.getWord(), i + 1, j - 1,
							wordFromQueue.getPath(), queue);
				}
			}

			if (i > 0) {
				addToQueue(board, wordFromQueue.getWord(), i - 1, j,
						wordFromQueue.getPath(), queue);
				if (j > 0) {
					addToQueue(board, wordFromQueue.getWord(), i - 1, j - 1,
							wordFromQueue.getPath(), queue);
				}
			}

			int wordLength = wordFromQueue.getWord().length();
			if (wordLength > 2) {
				allPossibleWords.add(wordFromQueue.getWord().toString());
			}
			if (wordLength < 7) {
				permuteWords(board, allPossibleWords, queue,
						wordFromQueue.getPath());
			}
		}

	}

	private static void addToQueue(String[][] board, String sb, int i, int j,
			List<String> currentPath, LinkedList<Word> queue) {
		if (!currentPath.contains(i + "" + j)) {
			Word word = getWord(board, sb, i, j, currentPath);
			if (word.getWord().length() < 7) {
				queue.addLast(word);
			}
		}

	}

	private static Word getWord(String[][] board, String sb, int i, int j,
			List<String> currentPath) {
		Word word = new Word();
		String newSb = sb + board[i][j];
		word.setWord(newSb);
		List<String> newPath = new LinkedList<String>();
		newPath.addAll(currentPath);
		newPath.add(i + "" + j);
		word.setPath(newPath);
		word.setiPos(i);
		word.setjPos(j);
		return word;
	}

	// public static class LengthComparator implements Comparator<String> {
	// public int compare(String s1, String s2) {
	// return s2.length() - s1.length();
	// }
	// }

	/**
	 * Finds out all possible combinations and permutations from a given string,
	 * for Words with Friends Hack.
	 * 
	 * @param board
	 * @param startsWith
	 * @param endsWith
	 * @param positionedCharacter
	 */
	public List<String> getAllWords(String[] board, String startsWith,
			String endsWith, String index, String indexChar) {

		Set<String> allPossibleWords = new HashSet<String>();
		Set<String> set = getCombinations(board[0] + board[1] + board[2]
				+ board[3] + board[4] + board[5] + board[6],
				new StringBuffer(), 0);
		for (String str : set) {
			allPossibleWords = getPermutations("", str, allPossibleWords);
		}
		Set<String> dictionary = dictionaryService.getWords();
		Set<String> words = new HashSet<String>();

		int inPos = 0;
		if (!index.isEmpty()) {
			inPos = Integer.parseInt(index) - 1;
		}

		for (String allPossibleWord : allPossibleWords) {

			// If advanced options are not empty
			if (!startsWith.isEmpty() && !endsWith.isEmpty()
					&& !index.isEmpty() && !indexChar.isEmpty()) {
				if (dictionary.contains(allPossibleWord)
						&& allPossibleWord.startsWith(startsWith)
						&& allPossibleWord.endsWith(endsWith)
						&& allPossibleWord.length() > inPos
						&& allPossibleWord.charAt(inPos) == indexChar
								.toCharArray()[0]) {
					words.add(allPossibleWord);
				}
				if (dictionary.contains(startsWith + allPossibleWord)
						&& (startsWith + allPossibleWord).endsWith(endsWith)
						&& (startsWith + allPossibleWord).length() > inPos
						&& (startsWith + allPossibleWord).charAt(inPos) == indexChar
								.toCharArray()[0]) {
					words.add(startsWith + allPossibleWord);
				}
				if (dictionary.contains(allPossibleWord + endsWith)
						&& (allPossibleWord + endsWith).startsWith(startsWith)
						&& (allPossibleWord + endsWith).length() > inPos
						&& (allPossibleWord + endsWith).charAt(inPos) == indexChar
								.toCharArray()[0]) {
					words.add(allPossibleWord + endsWith);
				}
				if (dictionary
						.contains(startsWith + allPossibleWord + endsWith)
						&& (startsWith + allPossibleWord + endsWith).length() > inPos
						&& (startsWith + allPossibleWord + endsWith).charAt(inPos) == indexChar
								.toCharArray()[0]) {
					words.add(startsWith + allPossibleWord + endsWith);
				}
			} else if (!startsWith.isEmpty() && !endsWith.isEmpty()) {
				if (dictionary.contains(allPossibleWord)
						&& allPossibleWord.startsWith(startsWith)
						&& allPossibleWord.endsWith(endsWith)) {
					words.add(allPossibleWord);
				}
				if (dictionary.contains(startsWith + allPossibleWord)
						&& (startsWith + allPossibleWord).endsWith(endsWith)) {
					words.add(startsWith + allPossibleWord);
				}
				if (dictionary.contains(allPossibleWord + endsWith)
						&& (allPossibleWord + endsWith).startsWith(startsWith)) {
					words.add(allPossibleWord + endsWith);
				}
				if (dictionary
						.contains(startsWith + allPossibleWord + endsWith)) {
					words.add(startsWith + allPossibleWord + endsWith);
				}
			} else if (!startsWith.isEmpty() && !index.isEmpty()
					&& !indexChar.isEmpty()) {
				if (dictionary.contains(allPossibleWord)
						&& allPossibleWord.startsWith(startsWith)
						&& allPossibleWord.length() > inPos
						&& allPossibleWord.charAt(inPos) == indexChar
								.toCharArray()[0]) {
					words.add(allPossibleWord);
				}
				if (dictionary.contains(startsWith + allPossibleWord)
						&& (startsWith + allPossibleWord).length() > inPos
						&& (startsWith + allPossibleWord).charAt(inPos) == indexChar
								.toCharArray()[0]) {
					words.add(startsWith + allPossibleWord);
				}
			} else if (!endsWith.isEmpty() && !index.isEmpty()
					&& !indexChar.isEmpty()) {
				if (dictionary.contains(allPossibleWord)
						&& allPossibleWord.endsWith(endsWith)
						&& allPossibleWord.length() > inPos
						&& allPossibleWord.charAt(inPos) == indexChar
								.toCharArray()[0]) {
					words.add(allPossibleWord);
				}
				if (dictionary.contains(allPossibleWord + endsWith)
						&& (allPossibleWord + endsWith).length() > inPos
						&& (allPossibleWord + endsWith).charAt(inPos) == indexChar
								.toCharArray()[0]) {
					words.add(allPossibleWord + endsWith);
				}
			} else if (!startsWith.isEmpty()) {
				if (dictionary.contains(allPossibleWord)
						&& allPossibleWord.startsWith(startsWith)) {
					words.add(allPossibleWord);
				}
				if (dictionary.contains(startsWith + allPossibleWord)) {
					words.add(startsWith + allPossibleWord);
				}
			} else if (!endsWith.isEmpty()) {
				if (dictionary.contains(allPossibleWord)
						&& allPossibleWord.endsWith(endsWith)) {
					words.add(allPossibleWord);
				}
				if (dictionary.contains(allPossibleWord+endsWith)) {
					words.add(allPossibleWord + endsWith);
				}
			} else if (!index.isEmpty() && !indexChar.isEmpty()) {
				if (dictionary.contains(allPossibleWord)
						&& allPossibleWord.length() > inPos
						&& allPossibleWord.charAt(inPos) == indexChar
								.toCharArray()[0]) {
					words.add(allPossibleWord);
				}
			} else if (dictionary.contains(allPossibleWord)) {
				words.add(allPossibleWord);
			}
		}
		
		List<String> wordsList = new LinkedList<String>();
		for(String word : words) {
			wordsList.add(word);
		}
		return wordsList;
	}

	public static Set<String> getCombinations(String instr,
			StringBuffer outstr, int index) {
		Set<String> combinations = new HashSet<String>();
		for (int i = index; i < instr.length(); i++) {
			outstr.append(instr.charAt(i));
			combinations.add(outstr.toString());
			combinations.addAll(getCombinations(instr, outstr, i + 1));
			outstr.deleteCharAt(outstr.length() - 1);
		}
		return combinations;
	}

	public Set<String> getPermutations(String start, String end,
			Set<String> allPossibleWords) {
		if (end.length() <= 1) {
			allPossibleWords.add(start + end);
		} else {
			for (int i = 0; i < end.length(); i++) {
				String newString = end.substring(0, i) + end.substring(i + 1);

				getPermutations(start + end.charAt(i), newString,
						allPossibleWords);
			}
		}

		return allPossibleWords;
	}
}
