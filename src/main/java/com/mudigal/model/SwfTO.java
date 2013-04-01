package com.mudigal.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/***************************************
 * 
 * @author: Vijayendra Mudigal
 * @email: vijayendrap@gmail.com
 * 
***************************************/

public class SwfTO {
	
	private String i00;
	private String i01;
	private String i02;
	private String i03;
	
	private String i10;
	private String i11;
	private String i12;
	private String i13;
	
	private String i20;
	private String i21;
	private String i22;
	private String i23;
	
	private String i30;
	private String i31;
	private String i32;
	private String i33;
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI00() {
		return i00;
	}
	
	public void setI00(String i00) {
		this.i00 = i00;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI01() {
		return i01;
	}
	
	public void setI01(String i01) {
		this.i01 = i01;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI02() {
		return i02;
	}
	
	public void setI02(String i02) {
		this.i02 = i02;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI03() {
		return i03;
	}
	
	public void setI03(String i03) {
		this.i03 = i03;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI10() {
		return i10;
	}
	
	public void setI10(String i10) {
		this.i10 = i10;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI11() {
		return i11;
	}
	
	public void setI11(String i11) {
		this.i11 = i11;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI12() {
		return i12;
	}
	
	public void setI12(String i12) {
		this.i12 = i12;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI13() {
		return i13;
	}
	
	public void setI13(String i13) {
		this.i13 = i13;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI20() {
		return i20;
	}
	
	public void setI20(String i20) {
		this.i20 = i20;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI21() {
		return i21;
	}
	
	public void setI21(String i21) {
		this.i21 = i21;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI22() {
		return i22;
	}
	
	public void setI22(String i22) {
		this.i22 = i22;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI23() {
		return i23;
	}
	
	public void setI23(String i23) {
		this.i23 = i23;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI30() {
		return i30;
	}
	
	public void setI30(String i30) {
		this.i30 = i30;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI31() {
		return i31;
	}
	
	public void setI31(String i31) {
		this.i31 = i31;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI32() {
		return i32;
	}
	
	public void setI32(String i32) {
		this.i32 = i32;
	}
	
	@Size(min = 1, max = 1, message="Please enter a Valid character!!")
	@Pattern(regexp = "[a-z|A-Z]*", message="Please enter a Valid character!!")
	public String getI33() {
		return i33;
	}
	
	public void setI33(String i33) {
		this.i33 = i33;
	}

}