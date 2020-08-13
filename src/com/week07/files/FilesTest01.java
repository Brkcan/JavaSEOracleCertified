package com.week07.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest01 {

	public static void main(String[] args) {
		Path path = Paths.get("text.txt");
		
		if(!Files.exists(path)) {
			try {
				Files.createFile(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Path path2 = Paths.get("/home/burak/eclipse-workspace/ubuntu/JavaSE8OracleCertified/src/com/week07/files/myFiles2.txt");
		
		if(!Files.exists(path2)) {
			try {
				Files.createFile(path2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
