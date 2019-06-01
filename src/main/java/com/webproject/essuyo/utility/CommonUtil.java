package com.webproject.essuyo.utility;

public class CommonUtil {

	
	
	//핸드폰 번호 포멧팅 (010-0000-0000)
	public static String phoneFormat(String phoneNo) {
		String result = phoneNo.substring(0,3) + "-" + phoneNo.substring(3,7) + "-" + phoneNo.substring(7, phoneNo.length());
		
		return result;
	}
	
	//숫자 앞에 숫자포함 5자리까지 0으로 채워주는 함수
	public static String plusZero(int no) {
		    String result = String.format("%05d", no);
		    // 출력 결과: 03
		    return result;
	}	    
	
	
	
}
