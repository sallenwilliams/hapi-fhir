
package ca.uhn.fhir.model.dstu.valueset;

/*
 * #%L
 * HAPI FHIR - Core Library
 * %%
 * Copyright (C) 2014 - 2015 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.HashMap;
import java.util.Map;

import ca.uhn.fhir.model.api.IValueSetEnumBinder;

public enum PractitionerRoleEnum {

	/**
	 * Code Value: <b>doctor</b>
	 */
	DOCTOR("doctor", "http://hl7.org/fhir/practitioner-role"),
	
	/**
	 * Code Value: <b>nurse</b>
	 */
	NURSE("nurse", "http://hl7.org/fhir/practitioner-role"),
	
	/**
	 * Code Value: <b>pharmacist</b>
	 */
	PHARMACIST("pharmacist", "http://hl7.org/fhir/practitioner-role"),
	
	/**
	 * Code Value: <b>researcher</b>
	 */
	RESEARCHER("researcher", "http://hl7.org/fhir/practitioner-role"),
	
	/**
	 * Display: <b>Teacher/educator</b><br>
	 * Code Value: <b>teacher</b>
	 */
	TEACHER_EDUCATOR("teacher", "http://hl7.org/fhir/practitioner-role"),
	
	/**
	 * Display: <b>ICT professional</b><br>
	 * Code Value: <b>ict</b>
	 */
	ICT_PROFESSIONAL("ict", "http://hl7.org/fhir/practitioner-role"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * http://hl7.org/fhir/vs/practitioner-role
	 */
	public static final String VALUESET_IDENTIFIER = "http://hl7.org/fhir/vs/practitioner-role";

	/**
	 * Name for this Value Set:
	 * PractitionerRole
	 */
	public static final String VALUESET_NAME = "PractitionerRole";

	private static Map<String, PractitionerRoleEnum> CODE_TO_ENUM = new HashMap<String, PractitionerRoleEnum>();
	private static Map<String, Map<String, PractitionerRoleEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, PractitionerRoleEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (PractitionerRoleEnum next : PractitionerRoleEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, PractitionerRoleEnum>());
			}
			SYSTEM_TO_CODE_TO_ENUM.get(next.getSystem()).put(next.getCode(), next);			
		}
	}
	
	/**
	 * Returns the code associated with this enumerated value
	 */
	public String getCode() {
		return myCode;
	}
	
	/**
	 * Returns the code system associated with this enumerated value
	 */
	public String getSystem() {
		return mySystem;
	}
	
	/**
	 * Returns the enumerated value associated with this code
	 */
	public PractitionerRoleEnum forCode(String theCode) {
		PractitionerRoleEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<PractitionerRoleEnum> VALUESET_BINDER = new IValueSetEnumBinder<PractitionerRoleEnum>() {
		@Override
		public String toCodeString(PractitionerRoleEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(PractitionerRoleEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public PractitionerRoleEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public PractitionerRoleEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, PractitionerRoleEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	PractitionerRoleEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
