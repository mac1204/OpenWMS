package mac.open.wms.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public class CommonUtils {

	private static final String[] HEADERS_TO_TRY = { "X-Forwarded-For", "Proxy-Client-IP", "WL-Proxy-Client-IP", "HTTP_X_FORWARDED_FOR", "HTTP_X_FORWARDED", "HTTP_X_CLUSTER_CLIENT_IP",
			"HTTP_CLIENT_IP", "HTTP_FORWARDED_FOR", "HTTP_FORWARDED", "HTTP_VIA", "REMOTE_ADDR" };

	public static String getClientIpAddress(HttpServletRequest request) {
		for (String header : HEADERS_TO_TRY) {
			String ip = request.getHeader(header);
			if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
				return ip;
			}
		}
		return request.getRemoteAddr();
	}
	
	public static String toCSVString(String[] input) {
		String output = "";
		for(int i = 0; i < input.length; i++) {
			output = output + input[i];
			if(i < input.length-1) {
				output = output + ",";
			} else {
				output = output + "\n";
			}
		}
		return output;
	} //end toCSVString()
	
	public static String toCSVByObject(Object[] input) {
		String output = "";
		if(null != input){
			for(int i = 0; i < input.length; i++) {
				output = output + input[i];
				if(i < input.length-1) {
					output = output + ",";
				} else {
					output = output + "\n";
				}
			}
		}
		return output;
	} //end toCSVString()
	
	public static List<Integer> stringListToInteger(List<String> strList) {
		List<Integer> intList = new ArrayList<Integer>();
		for(String s : strList) {
			intList.add(Integer.valueOf(s));
		}
		return intList;
	}
	
	public static boolean isBlank(Object obj) {
	    if (obj == null) {
	        return true;
	    }
	    return false;
	}

	public static boolean isBlank(Collection<?> value) {
	    if (value == null || value.isEmpty()) {
	        return true;
	    }
	    return false;
	}
	
	public static boolean isBlank(Map<?,?> value) {
	    if (value == null || value.isEmpty()) {
	        return true;
	    }
	    return false;
	}
	
	public static boolean isLong(String value) {
		
		try {
		    Long.parseLong(value);
		    return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
		
	}
	
	public static boolean isDouble(String value) {
		
		try {
		    Double.parseDouble(value);
		    return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
		
	}

}