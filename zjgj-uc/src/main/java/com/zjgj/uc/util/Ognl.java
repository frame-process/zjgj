package com.zjgj.uc.util;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
/**
 * Ognl工具类，主要是为了在ognl表达式访问静态方法时可以减少长长的类名称编写
 * 
 * @author liuguangsheng
 * 
 */
public class Ognl {

	/**
	 * dsc 可以用于判断String,Map,Collection,Array是否为空
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isEmpty(Object obj) throws IllegalArgumentException {
		if (obj == null) return true;
		// String
		if (obj instanceof String) {
			return ((String) obj).length() == 0;
		}
		// Collection
		if (obj instanceof Collection) {
			return ((Collection<?>) obj).isEmpty();
		}
		// Array
		if (obj.getClass().isArray()) {
			return Array.getLength(obj) == 0;
		}
		// Map
		if (obj instanceof Map) {
			return ((Map<?, ?>) obj).isEmpty();
		}
		return false;
	}
	
	public static boolean isNotEmpty(Object obj) {
		return !isEmpty(obj);
	}
}
