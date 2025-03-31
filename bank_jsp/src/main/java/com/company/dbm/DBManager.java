package com.company.dbm;

import java.sql.Connection;
import javax.naming.*;
import javax.sql.DataSource;

public class DBManager {
	public static Connection conn;

	public DBManager() { super();  } 
	
	public Connection getConnetion() {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/mbank");
			conn = ds.getConnection();
		} catch (Exception e) {e.printStackTrace();}
		return conn;
		
	}
	

}
