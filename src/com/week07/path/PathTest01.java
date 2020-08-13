package com.week07.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {

	public static void main(String[] args) {
		Path path = Paths.get("/Folder/Folder");
		System.out.println(path);
		
		System.out.println(path.getClass());
	}
}
