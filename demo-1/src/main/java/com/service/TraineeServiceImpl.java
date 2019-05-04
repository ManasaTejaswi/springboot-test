package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.dao.TraineeDao;
import com.model.TraineeDetails;
@Component("traineeService")
@Service
@Transactional
public class TraineeServiceImpl implements TraineeService{
	@Autowired
	TraineeDao dao;
	@Override
	public int addTrainee(TraineeDetails trainee) {
		// TODO Auto-generated method stub
		return dao.addTrainee(trainee);
	}

	@Override
	public int deleteTrainee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteTrainee(id);
	}

	@Override
	public int modifyTrainee(TraineeDetails trainee) {
		// TODO Auto-generated method stub
		return dao.modifyTrainee(trainee);
	}

	@Override
	public ArrayList<TraineeDetails> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public TraineeDetails getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void register(TraineeDetails traineeDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int login(TraineeDetails traineeDetails) {
		// TODO Auto-generated method stub
		return dao.login(traineeDetails);
	}

	

}
