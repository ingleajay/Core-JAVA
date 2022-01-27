package com.jdbctutorial.JDBC;

import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
       // get data by statement 
    	//StudentDao.getDataByStatement();
    	
       // get data by prepread statement 
    	//StudentDao.getDataByPreparedStatement();
    	
    	
       // insert data by statement
//    	boolean res  = StudentDao.insertDataByStatement();
//    	if(res)
//    		System.out.println("Data inserted successfully by statement !!");
    	
       // insert data by prepread statement
//    	Student st = new Student("Sonali", "1212122222","Chennai");
//    	boolean res  = StudentDao.insertDataByPrepared(st);
//    	if(res)
//    		System.out.println("Data inserted successfully by prepreadstatement !!");
    	
    	// update data by statement
//    	boolean res  = StudentDao.updateDataByStatement();
//    	if(res)
//    		System.out.println("Data updated successfully by statement !!");
    	
    	// update data by prepared statement
//    	Student st = new Student(2,"Vjajaj", "6767676767","dubai");
//    	boolean res  = StudentDao.updateDataByPrepared(st);
//    	if(res)
//    		System.out.println("Data updated successfully by prepreadstatement !!");
    	
    	// delete data by statement
//    	boolean res  = StudentDao.deleteDataByStatement();
//    	if(res)
//    		System.out.println("Data deleted successfully by statement !!");
    	
    	// delete data by prepared statement
//    	Student st = new Student(2);
//    	boolean res  = StudentDao.deleteDataByPrepared(st);
//    	if(res)
//    		System.out.println("Data deleted successfully by prepreadstatement !!");
    	
    	
    	// use of result set meta data
    	StudentDao.getResultSetMetaDataByStatement();
    	
    	// use of database set meta data
    	StudentDao.getDatabaseSetMetaData();
    	
    	//The setBinaryStream() method of PreparedStatement is used to set Binary information into the parameterIndex.
    	// Query : // create table students_img  ( stud_name varchar(30), stud_img longblob);
    	StudentsImg sd = new StudentsImg("Ajay","C:\\Users\\ADMIN\\OneDrive\\Desktop\\sign.jpeg");
    	boolean res  = StudentDao.StoreImages(sd);
    	if(res)
    		System.out.println("Img stored!!");
    }
}
