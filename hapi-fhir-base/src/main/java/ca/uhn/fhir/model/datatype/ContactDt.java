package ca.uhn.fhir.model.datatype;

import java.util.*;
import ca.uhn.fhir.model.api.*;
import ca.uhn.fhir.model.api.annotation.*;
import ca.uhn.fhir.model.datatype.*;

/**
 * HAPI/FHIR <b>${resourceName}</b> Datatype
 * (Technology mediated contact details (phone, fax, email, etc))
 *
 * <p>
 * <b>Definition:</b>
 * All kinds of technology mediated contact details for a person or organization, including telephone, email, etc.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Technology mediated contact details (phone, fax, email, etc)
 * </p> 
 */
@DatatypeDef(name="Contact") 
public class ContactDt extends BaseCompositeDatatype {

	@Child(name="system", order=0, min=0, max=1)	
	private CodeDt mySystem;
	
	@Child(name="value", order=1, min=0, max=1)	
	private String myValue;
	
	@Child(name="use", order=2, min=0, max=1)	
	private CodeDt myUse;
	
	@Child(name="period", order=3, min=0, max=1)	
	private Period myPeriod;
	
	/**
	 * Gets the value(s) for system (phone | fax | email | url)
	 *
     * <p>
     * <b>Definition:</b>
     * Telecommunications form for contact - what communications system is required to make use of the contact
     * </p> 
	 */
	public CodeDt getSystem() {
		return mySystem;
	}

	/**
	 * Sets the value(s) for system (phone | fax | email | url)
	 *
     * <p>
     * <b>Definition:</b>
     * Telecommunications form for contact - what communications system is required to make use of the contact
     * </p> 
	 */
	public void setSystem(CodeDt theValue) {
		mySystem = theValue;
	}
	
	/**
	 * Gets the value(s) for value (The actual contact details)
	 *
     * <p>
     * <b>Definition:</b>
     * The actual contact details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
     * </p> 
	 */
	public String getValue() {
		return myValue;
	}

	/**
	 * Sets the value(s) for value (The actual contact details)
	 *
     * <p>
     * <b>Definition:</b>
     * The actual contact details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
     * </p> 
	 */
	public void setValue(String theValue) {
		myValue = theValue;
	}
	
	/**
	 * Gets the value(s) for use (home | work | temp | old | mobile - purpose of this address)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the purpose for the address
     * </p> 
	 */
	public CodeDt getUse() {
		return myUse;
	}

	/**
	 * Sets the value(s) for use (home | work | temp | old | mobile - purpose of this address)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the purpose for the address
     * </p> 
	 */
	public void setUse(CodeDt theValue) {
		myUse = theValue;
	}
	
	/**
	 * Gets the value(s) for period (Time period when the contact was/is in use)
	 *
     * <p>
     * <b>Definition:</b>
     * Time period when the contact was/is in use
     * </p> 
	 */
	public Period getPeriod() {
		return myPeriod;
	}

	/**
	 * Sets the value(s) for period (Time period when the contact was/is in use)
	 *
     * <p>
     * <b>Definition:</b>
     * Time period when the contact was/is in use
     * </p> 
	 */
	public void setPeriod(Period theValue) {
		myPeriod = theValue;
	}
	

}