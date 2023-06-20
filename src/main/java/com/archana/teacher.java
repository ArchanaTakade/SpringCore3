package com.archana;

import org.springframework.beans.factory.annotation.Autowired;

public class teacher {

	@Autowired
	Student student;
	

    @Autowired
	batch batch;
	public void Msg() {
		
		
		System.out.println("Welcome teacher");
		student.stdMsg();
		batch.batchMsg();
	}
}
