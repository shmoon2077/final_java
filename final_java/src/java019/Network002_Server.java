package java019;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Network002_Server {
	public static void main(String[] args) {
		//1. 서버 소켓
		ServerSocket ascenter=null;
		Socket       socket;  // socket은 고객의 정보를 갖고 있음
		try { ascenter= new ServerSocket(7703); } catch (IOException e) {  e.printStackTrace(); } // localhost, port
		System.out.println("1. 서버 준비 완료....대기중");
		
		//3. 클라이언트의 요청이 오면 연결 
		try { socket= ascenter.accept(); 
		System.out.println("연결 "+ "요청 확인...연결 완료 !");
		Thread sender = new Sender(socket); sender.start();
		Thread receiver = new Receiver(socket); receiver.start();
		
		
		} catch (IOException e) {  e.printStackTrace(); }
		
		//4. 데이터 주고 받기
		
		
	}
}

//말하기 기능 클래스              > [프로그램] > OutputStream
class Sender extends Thread {
	String who; SimpleDateFormat sdf;
	public Sender() {}
	Socket socket; DataOutputStream out;
	
	public Sender(Socket socket) { 
		this.socket = socket; 
		try {out = new DataOutputStream(socket.getOutputStream());
		this.who = "["+(socket.getPort()==7703 ? "Client" : "Server"+"]");
		this.sdf = new SimpleDateFormat("[hh:mm:ss]");
		out.writeUTF("하이");}
		catch (IOException e) {  e.printStackTrace(); } 	}

	@Override public void run() {
//		Scanner scan = new Scanner(System.in);
//		scan.next();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
		while ( out != null) {
			String data = in.readLine();
			String time = sdf.format(System.currentTimeMillis());
			out.writeUTF( who+time+data); } }
		catch(Exception e) { System.out.println("ㅃ2"+socket); }
//		{e.printStackTrace();}
		 finally {
		   try {
			if (out != null) {out.close();}
			if (in != null) {in.close();}
			if (!socket.isClosed()) {socket.close();}
		   } catch (Exception e) {e.printStackTrace();}
		}
	}
	
	
}


// 듣기 기능 클래스               > [프로그램] > InputStream
class Receiver extends Thread {
	public Receiver() {	}
	Socket socket; DataInputStream in;
	public Receiver(Socket socket) {
		this.socket = socket;
		try {in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {  e.printStackTrace(); }
	}
	@Override public void run() {
		try {
			while ( in != null ) {System.out.println(in.readUTF());}}
			catch (Exception e) { System.out.println("ㅃ2"+socket); } 
		    finally { 
		    	try {
		    	      if(in != null) { in.close(); }
				      if(!socket.isClosed()) {socket.close();} 
		    	} catch (Exception e) {e.printStackTrace();}
		    	}
//				e.printStackTrace(); }
		
		
	
}
}	