package com.nitin.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {

  @Autowired
	private ConsoleWriter consoleWriter;
	@Autowired
   private FileWriter fileWriter;
	
	
/*	@Autowired
	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		super();
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
*/
	//@Autowired
/*	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	//@Autowired
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
*/	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}
}
