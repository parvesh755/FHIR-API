/*
* AMRIT – Accessible Medical Records via Integrated Technology 
* Integrated EHR (Electronic Health Records) Solution 
*
* Copyright (C) "Piramal Swasthya Management and Research Institute" 
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.wipro.fhir.service.ndhm;

import com.wipro.fhir.data.healthID.HealthIDResponse;
import com.wipro.fhir.data.healthID.VerifyOTP;
import com.wipro.fhir.utils.exception.FHIRException;

public interface CreateHealthID_Aadhaar_NDHMService {
	
	public String generateOTP(String request) throws FHIRException;
	public String verifyOTP(String request) throws FHIRException;
	public HealthIDResponse createHealthIDWithUID(String request) throws FHIRException;
	public String checkAndGenerateMobileOTP(String request) throws FHIRException;
	String verifyMobileOTP(String request) throws FHIRException;
	public String verifyBio(String request) throws FHIRException;
	public String generateMobileOTP(String request) throws FHIRException;
}
