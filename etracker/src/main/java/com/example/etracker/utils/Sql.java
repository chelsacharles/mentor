package com.example.etracker.utils;

public interface Sql {

	public interface MetadataSql{
		
		 
		 
		 final String FETCH_NOTE = "SELECT SENDER, NOTE, RECIPIENT, IMAGE_ID,CREATION_DATE CREATION_TIME FROM T_MENTOR WHERE SHARE_ID =?";
		 final String INSERT_WISH = "INSERT INTO T_MENTOR (EMAIL_ID,SHARE_ID,SENDER,NOTE, RECIPIENT,IMAGE_ID, CREATION_DATE, CREATION_TIME) VALUES (?,?,?,?,?,?,?,?)";
		 

	}
}
