/**
 * 
 */
package com.example.utility;

/**
 * @author ab68478
 *
 */
public class CommonUtils {
	public static boolean isEmpty(String value){
		if(value != null && value.trim() != "null" && !value.isEmpty())
			return false;
		return true;
	}
}
