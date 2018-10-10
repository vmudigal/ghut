package com.mudigal.model;

import java.util.LinkedList;
import java.util.List;

/***************************************
 * 
 * @author: Vijayendra Mudigal
 * @email: vijayendrap@gmail.com
 * 
***************************************/

public class Word {

	private String word;
	private Integer iPos;
	private Integer jPos;
	private List<String> path = new LinkedList<String>();

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Integer getiPos() {
		return iPos;
	}

	public void setiPos(Integer iPos) {
		this.iPos = iPos;
	}

	public Integer getjPos() {
		return jPos;
	}

	public void setjPos(Integer jPos) {
		this.jPos = jPos;
	}

	public List<String> getPath() {
		return path;
	}

	public void setPath(List<String> path) {
		this.path = path;
	}

}
