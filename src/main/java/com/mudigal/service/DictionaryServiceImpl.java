package com.mudigal.service;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/***************************************
 * 
 * @author: Vijayendra Mudigal
 * @email: vijayendrap@gmail.com
 * 
 ***************************************/

@Service("dictionaryService")
class DictionaryServiceImpl {

	private Set<String> dictionary;
	
	 @Value( "${selected.words.scramble}")
	 private String[] words = null;
	
	@PostConstruct
	public void init() {
		dictionary = new HashSet<String>(60000);
		for(String word : words ){
			dictionary.add(word);
		}
	}

	public Set<String> getWords() {
		return dictionary;
	}
}