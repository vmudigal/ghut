package com.mudigal.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


/***************************************
 * 
 * @author: Vijayendra Mudigal
 * @email: vijayendrap@gmail.com
 * 
***************************************/

public class WwfTO {
	
	private String i00;
	private String i01;
	private String i02;
	private String i03;
	private String i04;
	private String i05;
	private String i06;
	private String endsWith;
	private String startsWith;
	private String indexKey;
	private String indexValue;
	
	@Size(max = 1, message="Only 1 character allowed")
	@Pattern(regexp = "[a-z|A-Z]?", message="Only A - Z allowed")
	public String getI00() {
		return i00;
	}
	
	public void setI00(String i00) {
		this.i00 = i00;
	}
	
	@Size(max = 1, message="Only 1 character allowed")
	@Pattern(regexp = "[a-z|A-Z]?", message="Only A - Z allowed")
	public String getI01() {
		return i01;
	}
	
	public void setI01(String i01) {
		this.i01 = i01;
	}
	
	@Size(max = 1, message="Only 1 character allowed")
	@Pattern(regexp = "[a-z|A-Z]?", message="Only A - Z allowed")
	public String getI02() {
		return i02;
	}
	
	public void setI02(String i02) {
		this.i02 = i02;
	}
	
	@Size(max = 1, message="Only 1 character allowed")
	@Pattern(regexp = "[a-z|A-Z]?", message="Only A - Z allowed")
	public String getI03() {
		return i03;
	}
	
	public void setI03(String i03) {
		this.i03 = i03;
	}
	
	@Size(max = 1, message="Only 1 character allowed")
	@Pattern(regexp = "[a-z|A-Z]?", message="Only A - Z allowed")
	public String getI04() {
		return i04;
	}
	
	public void setI04(String i04) {
		this.i04 = i04;
	}
	
	@Size(max = 1, message="Only 1 character allowed")
	@Pattern(regexp = "[a-z|A-Z]?", message="Only A - Z allowed")
	public String getI05() {
		return i05;
	}
	
	public void setI05(String i05) {
		this.i05 = i05;
	}
	
	@Size(max = 1, message="Only 1 character allowed")
	@Pattern(regexp = "[a-z|A-Z]?", message="Only A - Z allowed")
	public String getI06() {
		return i06;
	}
	
	public void setI06(String i06) {
		this.i06 = i06;
	}

	@Size(max = 6, message="Max 6 characters allowed")
	@Pattern(regexp = "[a-z|A-Z]*", message="Only A-Z allowed")
	public String getEndsWith() {
		return endsWith;
	}

	public void setEndsWith(String endsWith) {
		this.endsWith = endsWith;
	}

	@Size(max = 6, message="Max 6 characters allowed")
	@Pattern(regexp = "[a-z|A-Z]*", message="Only A-Z allowed")
	public String getStartsWith() {
		return startsWith;
	}

	public void setStartsWith(String startsWith) {
		this.startsWith = startsWith;
	}

	@Size(max = 1, message="Only 1 character allowed")
	@Pattern(regexp = "[1-9]?", message="Only 1 - 9 allowed")
	public String getIndexKey() {
		return indexKey;
	}

	public void setIndexKey(String indexKey) {
		this.indexKey = indexKey;
	}

	@Size(max = 1, message="Only 1 character allowed")
	@Pattern(regexp = "[a-z|A-Z]?", message="Only A - Z allowed")
	public String getIndexValue() {
		return indexValue;
	}

	public void setIndexValue(String indexValue) {
		this.indexValue = indexValue;
	}
	
}