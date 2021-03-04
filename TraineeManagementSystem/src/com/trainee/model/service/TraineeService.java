package com.trainee.model.service;

import java.util.List;

import com.trainee.model.dao.Trainee;

public interface TraineeService {
	public void addTrainee(Trainee trainee);
	public List<Trainee> allTrainees();
}
