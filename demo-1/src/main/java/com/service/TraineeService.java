package com.service;

import java.util.ArrayList;


import com.model.TraineeDetails;

public interface TraineeService {
int addTrainee(TraineeDetails trainee);
int deleteTrainee(int id);
int modifyTrainee(TraineeDetails trainee);
ArrayList<TraineeDetails> getAll();
TraineeDetails getById(int id);
void register(TraineeDetails traineeDetails);
int login(TraineeDetails traineeDetails);
}
