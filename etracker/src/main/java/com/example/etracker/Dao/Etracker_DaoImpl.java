package com.example.etracker.Dao;


import java.math.BigInteger;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.etracker.Model.Mentor;
import com.example.etracker.utils.Sql;


import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  


@Repository
public class Etracker_DaoImpl implements Etracker_Dao {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Map<String, java.lang.Object> retrieveNote(int shareId){
		
		return jdbcTemplate.queryForMap(Sql.MetadataSql.FETCH_NOTE,shareId);

	}
	public int insertWish(Mentor mentor) {
		String rand = Double.toString(Math.random());
		Date date = new Date();
		long time = date.getTime();
		Timestamp ts = new Timestamp(time);
		String ts1 = ts.toString();
		String temp = rand.concat(ts1);
		int shareId = temp.hashCode();
		String email = mentor.getEmailID();
		String sender   = mentor.getSender();
		String note = mentor.getNote();
		String recipient   =  mentor.getRecipient();
		String image = mentor.getImageId();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		  
		
		 jdbcTemplate.update(Sql.MetadataSql.INSERT_WISH,email, shareId, sender,note,recipient,image, dtf.format(now),dtf.format(now));
		 return shareId;

	}

      
   
}
