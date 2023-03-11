package utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Iterator;

public class TimeZone {
	public static void main(String[] args) {
		// Locale

		// TimeZone : múi giờ đc chia theo kinh tuyến
		// GMT : giờ quay của trái đất, giờ pháp lý của mỗi quốc gia
		// vì độ quay của trái đất có thể chệnh lệch nên giờ mỗi năm sẽ trễ
		// UTC : giờ điện tử, chính xác hơn

		String zoneId = "Europe/Berlin";
		zoneId = "Etc/GMT-2";
		
		LocalDateTime ldt = LocalDateTime.now(ZoneId.of(zoneId));
		System.out.println("datetime : " + ldt);

		String[] timezones = java.util.TimeZone.getAvailableIDs();
		for (String timezone : timezones) {
			System.out.println(timezone);
		}
	}
}
