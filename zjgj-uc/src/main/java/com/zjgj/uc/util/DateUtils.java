package com.zjgj.uc.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * 
 * @author liuguangsheng
 *
 */
public class DateUtils {
	/**
	 * @desc 当前系统时间
	 * @return
	 */
	public static Date now() {
		ZoneId zoneId = ZoneId.systemDefault();
		LocalDate localDate = LocalDate.now();
		 ZonedDateTime zdt = localDate.atStartOfDay(zoneId);
		 Date date = Date.from(zdt.toInstant());
		return date;
	}

}
