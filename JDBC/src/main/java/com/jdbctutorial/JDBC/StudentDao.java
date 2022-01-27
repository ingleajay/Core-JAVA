package com.jdbctutorial.JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	
	static Connection con = Conn.createConn();
	
	// use statement interface for getting data :
	public static void getDataByStatement() throws SQLException {
		Statement stmt=con.createStatement(); 
		String q = "select * from students";
		ResultSet set = stmt.executeQuery(q);
		while (set.next()) {
            int id = set.getInt(1);
            String name = set.getString("sname");
            String phone = set.getString("sphone");
            String city = set.getString("scity");
            System.out.println("Students Details by statement : ");
            System.out.println("Id : " + id);
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phone);
            System.out.println("city: " + city);
            System.out.println("+++++++++++++++++++++++++++++++");
        }
	}
	
	// use prepreadStatement interface for getting data
	public static void getDataByPreparedStatement() throws SQLException {
		PreparedStatement stmt=con.prepareStatement("select * from students");  
		ResultSet rs=stmt.executeQuery();  
		while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString("sname");
            String phone = rs.getString("sphone");
            String city = rs.getString("scity");
            System.out.println("Students Details by prepadStatement: ");
            System.out.println("Id : " + id);
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phone);
            System.out.println("city: " + city);
            System.out.println("+++++++++++++++++++++++++++++++");
        }
	}
	
	// use statement for inserting data
	public static boolean insertDataByStatement() {
        boolean f = false;
        try {
        	Statement stmt=con.createStatement();
            String q = "insert into students(sname,scity,sphone) values('Shila','Baglore','2323232321')";
            stmt.executeUpdate(q);
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
	
	// use Prepread statement for inserting data
	public static boolean insertDataByPrepared(Student st) {
        boolean f = false;
        try {
            String q = "insert into students(sname,sphone,scity) values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, st.getName());
            pstmt.setString(2, st.getPhone());
            pstmt.setString(3, st.getCity());
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
	
	// use statement for updating data
	public static boolean updateDataByStatement() {
        boolean f = false;
        try {
        	Statement stmt=con.createStatement();
            String q = "update students set sname='Manohar',scity='Oman',sphone='8989898921' where sid = 3 ";
            stmt.executeUpdate(q);
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
	
	// use prepared for updating data
	public static boolean updateDataByPrepared(Student st) {
        boolean f = false;
        try {
            String q = "update students set sname=?,scity=?,sphone=? where sid = ? ";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, st.getName());
            pstmt.setString(2, st.getCity());
            pstmt.setString(3, st.getPhone());
            pstmt.setInt(4, st.getId());
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
	
	// use statement for deleting data
	public static boolean deleteDataByStatement() {
        boolean f = false;
        try {
        	Statement stmt=con.createStatement();
            String q = "delete from students where sid = 3 ";
            stmt.executeUpdate(q);
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
	
	// use prepared statement for deleting data
	public static boolean deleteDataByPrepared(Student st) {
        boolean f = false;
        try {
            String q = "delete from students where sid = ? ";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, st.getId());
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

	// use of resultsetmetadata for getting data about data from resultset object
	
	public static void getResultSetMetaDataByStatement() throws SQLException {
		Statement stmt=con.createStatement(); 
		String q = "select * from students";
		ResultSet set = stmt.executeQuery(q);
		ResultSetMetaData rsmd=set.getMetaData();  
		
		System.out.println("Total columns: "+rsmd.getColumnCount());  
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
	}
	
	// use of databasemetadata for getting data about data from database
	public static void getDatabaseSetMetaData() throws SQLException {
		DatabaseMetaData dbmd=con.getMetaData();   
		System.out.println("Driver Name: "+dbmd.getDriverName());  
		System.out.println("Driver Version: "+dbmd.getDriverVersion());  
		System.out.println("UserName: "+dbmd.getUserName());  
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
		System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());   
	}

	
	// store images in files
	public static boolean StoreImages(StudentsImg st) {
		boolean f = false;
        try {
        	PreparedStatement ps=con.prepareStatement("insert into students_img values(?,?)");  
            ps.setString(1, st.getStud_name());
            FileInputStream fin=new FileInputStream(st.getStud_img());  
            ps.setBinaryStream(2, fin, fin.available()); 
            ps.executeUpdate();  
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
	}
	
	// get images in files
	
}
