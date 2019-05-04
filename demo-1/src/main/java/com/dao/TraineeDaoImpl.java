package com.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.model.TraineeDetails;
@Component("dao")
@Repository
@ComponentScan("com")
public class TraineeDaoImpl implements TraineeDao{
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public int addTrainee(TraineeDetails trainee) {
		// TODO Auto-generated method stub
		entityManager.persist(trainee);
		return 0;
	}

	@Override
	public int deleteTrainee(int id) {
		// TODO Auto-generated method stub
		TraineeDetails traineeDetails=new TraineeDetails();
		traineeDetails.setId(id);
		entityManager.remove(getById(id));
		return 0;
	}

	@Override
	public int modifyTrainee(TraineeDetails trainee) {
		// TODO Auto-generated method stub
		entityManager.merge( trainee);
		return 0;
	}

	@Override
	public ArrayList<TraineeDetails> getAll() {
		// TODO Auto-generated method stub
		Query query = (Query) entityManager.createQuery("from Product ");
		ArrayList<TraineeDetails> list = (ArrayList<TraineeDetails>) query.list();
		return list;
	}

	@Override
	public TraineeDetails getById(int id) {
		// TODO Auto-generated method stub
		TraineeDetails traineeDetails=entityManager.find(TraineeDetails.class, id);
         return traineeDetails;
	}
	
	@Override
	public void register(TraineeDetails traineeDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int login(TraineeDetails traineeDetails) {
		// TODO Auto-generated method stub
		return 0;
	}

	
  }
