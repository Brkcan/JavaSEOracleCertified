package com.week06.property.resource.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertyResourceBundleTest01 {

	public static void main(String[] args) {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("config", new Locale("en"));
		
		String msg = resourceBundle.getString("message");
		System.out.println(msg);
	}
}
