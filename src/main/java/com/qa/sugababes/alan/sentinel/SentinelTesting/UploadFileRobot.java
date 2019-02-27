package com.qa.sugababes.alan.sentinel.SentinelTesting;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFileRobot {
	
	public static void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}
	
	public void uploadFile() {
		
		String fileLocation = "C:\\Users\\Admin\\Documents\\SynopsisOfNarcos.pdf";
		
		try {
			Thread.sleep(2000);
			setClipboardData(fileLocation);
			
			Robot robot = new Robot();
			 robot.keyPress(KeyEvent.VK_CONTROL);
	         robot.keyPress(KeyEvent.VK_V);
	         robot.keyRelease(KeyEvent.VK_V);
	         robot.keyRelease(KeyEvent.VK_CONTROL);
	         robot.keyPress(KeyEvent.VK_ENTER);
	         robot.keyRelease(KeyEvent.VK_ENTER);
	        } catch (Exception exp) {
	        	exp.printStackTrace();
	        }
			
		}
	}


