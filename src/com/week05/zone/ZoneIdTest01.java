package com.week05.zone;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdTest01 {

	public static void main(String[] args) {
		ZoneId defaultZone = ZoneId.systemDefault();
		System.out.println(defaultZone);
		
		Set<String> zoneId = ZoneId.getAvailableZoneIds();
		System.out.println(zoneId);
	}
}
