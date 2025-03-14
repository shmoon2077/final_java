package java019;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Network002_Client {
	public static void main(String[] args) {
		//2. 통신사에 연락 - 7703     127.0.0.1 (자신의 컴퓨터 의미)
		Socket socket=null;
		try {socket = new Socket("127.0.0.1", 7703);
		System.out.println("as센터에 연결 요청");
		//4. 데이터 주고 받기
		Thread sender = new Sender(socket); sender.start();
		Thread receiver = new Receiver(socket); receiver.start();
	
		} catch (UnknownHostException e) {  e.printStackTrace(); } catch (IOException e) {  e.printStackTrace(); } 
		
		
		
		
		
		
	}
}
