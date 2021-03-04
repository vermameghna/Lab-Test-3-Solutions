package com.trainee.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.trainee.exceptions.DataAccessException;
import com.trainee.model.connections.ConnectionFactory;

public class TraineeDaoImpl implements TraineeDao{
	
	private Connection connection;
	
	
	public TraineeDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public void addTrainee(Trainee trainee) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into trainee(name,branch,percentage) values(?,?,?)");
			pstmt.setString(1, trainee.getName());
			pstmt.setString(2, trainee.getBranch());
			pstmt.setDouble(3, trainee.getPercentage());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			throw new DataAccessException("Exception occured in adding trainee record");
		}
	}

	@Override
	public List<Trainee> allTrainees() {
		 List<Trainee> trainees =new ArrayList<>();
			try {
				PreparedStatement pstmt = connection.prepareStatement("select * from trainee");
				pstmt.execute();
				ResultSet rs = pstmt.getResultSet();
				
				while(rs.next()) {
					
					trainees.add(new Trainee(rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getDouble(4)));
				}
			} catch (SQLException e) {
				throw new DataAccessException(e.getMessage());
			}
			
			return trainees;
	}

}
