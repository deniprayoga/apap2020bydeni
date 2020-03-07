package com.apap.tu05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apap.tu05.model.PilotModel;
import com.apap.tu05.repository.PilotDb;

/**
 * 
 * PilotServiceImpl
 * @author deniprayoga
 *
 */
@Service
@Transactional
public class PilotServiceImpl implements PilotService {
	
	@Autowired
	private PilotDb pilotDb;
	
	public PilotServiceImpl(PilotDb pilotDb) {
		this.pilotDb = pilotDb;
	}

	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		return pilotDb.findByLicenseNumber(licenseNumber);
	}

	@Override
	public void addPilot(PilotModel pilot) {
		pilotDb.save(pilot);
		
	}

}
