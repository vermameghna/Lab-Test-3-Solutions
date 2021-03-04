package com.trainee.model.service;

import java.util.List;

import com.trainee.model.dao.Trainee;
import com.trainee.model.dao.TraineeDao;
import com.trainee.model.dao.TraineeDaoImpl;

public class TraineeServiceImpl implements TraineeService{
	
	private TraineeDao traineeDao;
	
	public TraineeServiceImpl() {
		traineeDao = new TraineeDaoImpl();
	}

	@Override
	public void addTrainee(Trainee trainee) {
		traineeDao.addTrainee(trainee);
	}

	@Override
	public List<Trainee> allTrainees() {
		return traineeDao.allTrainees();
	}

}
