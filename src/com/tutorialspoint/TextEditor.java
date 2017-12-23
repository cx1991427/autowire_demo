package com.tutorialspoint;

public class TextEditor {
	private int id;
	private String name;
	private SpellChecker spellChecker;
	
	public TextEditor() {
		System.out.println("TextEditor Constructor!");
	}
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setSpellChecker(SpellChecker spellChecker) {
//		this.spellChecker = spellChecker;
//	}
//	public SpellChecker getSpellChecker() {
//		return spellChecker;
//	}
//
//	public void spellCheck() {
//		spellChecker.checkSpelling();
//	}

	@Override
	public String toString() {
		return "TextEditor [id=" + id + ", name=" + name + ", spellChecker=" + spellChecker + "]";
	}
}