package com.mudigal.controller;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.mudigal.model.SwfTO;
import com.mudigal.model.WwfTO;
import com.mudigal.service.BaseServiceImpl;

/***************************************
 * 
 * @author: Vijayendra Mudigal
 * @email: vijayendrap@gmail.com
 * 
 ***************************************/

@Controller
public class BaseController {

	protected static Logger logger = Logger.getLogger("controller");

	@Resource(name = "baseService")
	private BaseServiceImpl baseService;

	@RequestMapping(value = "/")
	public String home(ModelMap model) {

		return "home";

	}

	@RequestMapping(value = "/hwf", method = RequestMethod.GET)
	public String hwf(ModelMap model) {

		return "hwf";

	}

	@RequestMapping(value = "/swf", method = RequestMethod.GET)
	public SwfTO getSwf(Model model, WebRequest request) {
		return new SwfTO();
	}

	@RequestMapping(value = "/swf", method = RequestMethod.POST)
	public String getAllWords(ModelMap model, @Valid SwfTO form,
			BindingResult formBinding) {

		if (formBinding.hasErrors()) {
			model.addAttribute("error", "Please input valid data!!");
			return "swf";
		}

		String[][] board = new String[4][4];
		board[0][0] = form.getI00().toLowerCase();
		board[0][1] = form.getI01().toLowerCase();
		board[0][2] = form.getI02().toLowerCase();
		board[0][3] = form.getI03().toLowerCase();

		board[1][0] = form.getI10().toLowerCase();
		board[1][1] = form.getI11().toLowerCase();
		board[1][2] = form.getI12().toLowerCase();
		board[1][3] = form.getI13().toLowerCase();

		board[2][0] = form.getI20().toLowerCase();
		board[2][1] = form.getI21().toLowerCase();
		board[2][2] = form.getI22().toLowerCase();
		board[2][3] = form.getI23().toLowerCase();

		board[3][0] = form.getI30().toLowerCase();
		board[3][1] = form.getI31().toLowerCase();
		board[3][2] = form.getI32().toLowerCase();
		board[3][3] = form.getI33().toLowerCase();

		long startTime = System.currentTimeMillis();
		List<String> words = baseService.getAllWords(board);

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;

		List<String> words7 = new LinkedList<String>();
		List<String> words6 = new LinkedList<String>();
		List<String> words5 = new LinkedList<String>();
		List<String> words4 = new LinkedList<String>();
		List<String> words3 = new LinkedList<String>();

		for (String word : words) {
			if (word.length() == 7) {
				words7.add(word);
			} else if (word.length() == 6) {
				words6.add(word);
			} else if (word.length() == 5) {
				words5.add(word);
			} else if (word.length() == 4) {
				words4.add(word);
			} else if (word.length() == 3) {
				words3.add(word);
			}
		}

		Collections.sort(words7);
		Collections.sort(words6);
		Collections.sort(words5);
		Collections.sort(words4);
		Collections.sort(words3);

		model.addAttribute("words7", words7);
		model.addAttribute("words7s", words7.size());
		model.addAttribute("words6", words6);
		model.addAttribute("words6s", words6.size());
		model.addAttribute("words5", words5);
		model.addAttribute("words5s", words5.size());
		model.addAttribute("words4", words4);
		model.addAttribute("words4s", words4.size());
		model.addAttribute("words3", words3);
		model.addAttribute("words3s", words3.size());
		model.addAttribute("size", words.size());
		model.addAttribute("time", elapsedTime);
		return "swfr";

	}

	@RequestMapping(value = "/wwf", method = RequestMethod.GET)
	public WwfTO getWwf(Model model, WebRequest request) {
		WwfTO wwfTO = new WwfTO();
		wwfTO.setI00("");
		wwfTO.setI01("");
		wwfTO.setI02("");
		wwfTO.setI03("");
		wwfTO.setI04("");
		wwfTO.setI05("");
		wwfTO.setI06("");
		return new WwfTO();
	}

	@RequestMapping(value = "/wwf", method = RequestMethod.POST)
	public String getAllWords(ModelMap model, @Valid WwfTO form,
			BindingResult formBinding) {

		if (formBinding.hasErrors()) {
			for (ObjectError error : formBinding.getAllErrors()) {
				if (error.toString().contains("i00")
						|| error.toString().contains("i01")
						|| error.toString().contains("i02")
						|| error.toString().contains("i03")
						|| error.toString().contains("i04")
						|| error.toString().contains("i05")
						|| error.toString().contains("i06")) {
					model.addAttribute("error", "Only A-Z allowed");
				}
			}
			return null;
		}

		String[] board = new String[7];
		board[0] = form.getI00().toLowerCase();
		board[1] = form.getI01().toLowerCase();
		board[2] = form.getI02().toLowerCase();
		board[3] = form.getI03().toLowerCase();
		board[4] = form.getI04().toLowerCase();
		board[5] = form.getI05().toLowerCase();
		board[6] = form.getI06().toLowerCase();

		long startTime = System.currentTimeMillis();
		List<String> words = baseService.getAllWords(board,
				form.getStartsWith(), form.getEndsWith(), form.getIndexKey(),
				form.getIndexValue());

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;

		List<String> words7 = new LinkedList<String>();
		List<String> words6 = new LinkedList<String>();
		List<String> words5 = new LinkedList<String>();
		List<String> words4 = new LinkedList<String>();
		List<String> words3 = new LinkedList<String>();

		for (String word : words) {
			if (word.length() == 7) {
				words7.add(word);
			} else if (word.length() == 6) {
				words6.add(word);
			} else if (word.length() == 5) {
				words5.add(word);
			} else if (word.length() == 4) {
				words4.add(word);
			} else if (word.length() == 3) {
				words3.add(word);
			}
		}

		Collections.sort(words7);
		Collections.sort(words6);
		Collections.sort(words5);
		Collections.sort(words4);
		Collections.sort(words3);

		model.addAttribute("words7", words7);
		model.addAttribute("words7s", words7.size());
		model.addAttribute("words6", words6);
		model.addAttribute("words6s", words6.size());
		model.addAttribute("words5", words5);
		model.addAttribute("words5s", words5.size());
		model.addAttribute("words4", words4);
		model.addAttribute("words4s", words4.size());
		model.addAttribute("words3", words3);
		model.addAttribute("words3s", words3.size());
		model.addAttribute("size",
				words7.size() + words6.size() + words5.size() + words4.size()
						+ words3.size());
		model.addAttribute("time", elapsedTime);

		return "wwfr";

	}

}