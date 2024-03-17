package com.utils;

import java.util.UUID;

public class UUIDUtils {
	private UUIDUtils(){}
	/**
	 * 生成不重复的32位长的大写字符串
	 * @return
	 */
	public static String getUuid() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}

}

