package com.example.etracker.Service;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.example.etracker.Model.Mentor;

public interface Etracker_Service {
	
   
	public Map<String, java.lang.Object> retrieveNote(int shareId);
	public int insertWish(Mentor mentor);
	
}
