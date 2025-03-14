package java019;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network001_InetAddress {
	public static void main(String[] args) throws UnknownHostException {
		//#1.
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("ip host name: "+local.getHostName());
		System.out.println("ip host Address : "+local.getHostAddress());
		
		
		local = InetAddress.getByName("www.naver.com");
		System.out.println("3. naver : "+local);
		
	}

}
