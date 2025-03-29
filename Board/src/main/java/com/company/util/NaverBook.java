package com.company.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class NaverBook {
	public void getBooks() {
		 try {
		//#1. url
		String apiurl="https://openapi.naver.com/v1/search/news.json?query="
						+ URLEncoder.encode("헤르만 헤세","UTF-8");
		URL url = new URL(apiurl);
		
		
		//#2. HttpURLConnection
		HttpURLConnection conec = (HttpURLConnection) url.openConnection();
		
		
		//#3. 요청 설정
		conec.setRequestMethod("GET");
		conec.setRequestProperty("X-Naver-Client-Id","nr_a4Hzl92bkfsAa1t9x");
		conec.setRequestProperty("X-Naver-Client-Secret","nWkl61EIQF");
		

		
		//#4. 응답 확인
		int code = conec.getResponseCode();
		BufferedReader br;
		if (code==200) {br = new BufferedReader ( new InputStreamReader (conec.getInputStream()));}
		else { br = new BufferedReader ( new InputStreamReader (conec.getErrorStream()));
		}
		
		//#5. 응답 데이터 
		String line;
		StringBuffer sb = new StringBuffer();
		while ( (line=br.readLine()) !=null ) { sb.append(line+"\n"); }
		
		System.out.println(sb.toString());
		br.close();
		conec.disconnect();

		
	} catch (Exception e) {e.printStackTrace();}

}
}
// id nr_a4Hzl92bkfsAa1t9x

