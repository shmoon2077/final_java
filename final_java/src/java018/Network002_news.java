package java018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Network002_news {
	public static void main(String[] args) throws IOException {
		//#1. url
		String apiurl="https://openapi.naver.com/v1/search/book.xml?query="
						+ URLEncoder.encode("python","UTF-8");
		URL url = new URL(apiurl);
		
		
		//#2. HttpURLConnection
		HttpURLConnection conec = (HttpURLConnection) url.openConnection();
		
		
		//#3. 요청 설정
		conec.setRequestMethod("GET");
		conec.setRequestProperty("X-Naver-Client-Id","nr_a4Hzl92bkfsAa1t9x");
		conec.setRequestProperty("X-Naver-Client-Secret","nWkl61EIQF");
		
		/*
		GET , query UTF-8 쿼리스트링 주소창으로
		> X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
		> X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
		*/
		
		//#4. 응답 확인
//		System.out.println( conec.getResponseCode());
		int code = conec.getResponseCode();
		BufferedReader br;
		if (code==200) {br = new BufferedReader ( new InputStreamReader (conec.getInputStream()));}
		else { br = new BufferedReader ( new InputStreamReader (conec.getErrorStream()));
		}
		
		//#5. 응답 데이터 -xml/json/csv
		String line;
		StringBuffer sb = new StringBuffer();
		while ( (line=br.readLine()) !=null ) { sb.append(line+"\n"); }
		
		System.out.println(sb.toString());
		br.close();
		conec.disconnect();

		
	}

}
// id nr_a4Hzl92bkfsAa1t9x
// cs nWkl61EIQF	