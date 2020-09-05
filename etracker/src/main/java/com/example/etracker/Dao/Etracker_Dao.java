package com.example.etracker.Dao;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.example.etracker.Model.Mentor;

public interface Etracker_Dao {
  

	public Map<String, java.lang.Object> retrieveNote(int shareId);
	public int insertWish(Mentor mentor);


}
