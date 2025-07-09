package com.TestNGDemos;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class SystemTest {
	public static void main(String[] args) {
        String fullPath = "/Users/harrshinimn/Desktop/Harrshini_WebDriverDemos/MyAutomationProject/ExcelFiles/FriendsData.xlsx";
        
        try {
            File parentDir = new File(fullPath).getParentFile();
            parentDir.mkdirs(); // Ensure directory exists
            
            File file = new File(fullPath);
            FileOutputStream fos = new FileOutputStream(file);
            fos.write("Test".getBytes());
            fos.close();
            System.out.println("File saved successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}