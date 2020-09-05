package com.example.etracker.Controller;



import java.math.BigInteger;

import java.util.Collection;



import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.etracker.Model.Mentor;
import com.example.etracker.Service.Etracker_Service;
import com.example.etracker.utils.PathRoutes;


@RestController
@RequestMapping(PathRoutes.SearchSQL.SEARCHSQL_ROOT)
public class Etracker_Controller {
	
	@Autowired
	private Etracker_Service exp;
	

	
	@GetMapping(PathRoutes.SearchSQL.RETRIEVE_WISH)
	public Map<String, java.lang.Object>  retrieveNote(@RequestParam int shareId) {
		return exp.retrieveNote(shareId);
	}
	
	@PostMapping(PathRoutes.SearchSQL.INSERT_WISH)
	public int abcd(@RequestBody Mentor mentor ) {
			
		return exp.insertWish(mentor);
		
		
	}
	
}
