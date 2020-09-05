package com.example.etracker.Service;


import java.math.BigInteger;

import java.util.Collection;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.etracker.Dao.Etracker_Dao;
import com.example.etracker.Model.Mentor;


@Service
public class Etracker_ServiceImpl implements Etracker_Service{
	
	@Autowired
	Etracker_Dao epTrackDao;
	public Map<String, java.lang.Object> retrieveNote(int shareId){
		return epTrackDao.retrieveNote(shareId);
		
	}
	public int insertWish(Mentor mentor) {
		return epTrackDao.insertWish(mentor);
	}	

	
}
