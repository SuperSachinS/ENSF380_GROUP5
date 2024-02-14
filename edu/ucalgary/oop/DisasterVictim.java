


package edu.ucalgary.oop;
import java.util.regex.*;

public class DisasterVictim{
	
	//Attributes
    private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String comments;
	private static final int ASSIGNED_SOCIAL_ID;
	private MedicalRecord[] medicalRecords;
	private FamilyRelation[] familyConnections;
	private static final String ENTRY_DATE;
	private Supply[] personalBelongings;
	private String gender;
	private int counter;
	
	//Methods
	
	//Constructors
	
	public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException{
		
	}
	//Getters
	
	public String getFirstName(){ return this.firstName; }
	public String getLastName() { return this.lastName; }
	public String getDateOfBirth() { return this.dateOfBirth; }
	public String getComments() { return this.comments; }
	public MedicalRecord getMedicalRecords() { return this.medicalRecords; }
	public String getEntryDate() { return this.ENTRY_DATE; }
	public int getAssignedSocialID() { return this.ASSIGNED_SOCIAL_ID; }
	public Supply getPersonalBelongings() { return this.personalBelongings; }
	public FamilyRelation getFamilyConnections() {return this.familyConnections; }
	public String getGender() { return this.gender; }
	
	//Setters
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException{
		//TODO
	}
	
	public void setComments(String comments){
		this.comments = comments;
	}
	
	public void setMedicalRecords(MedicalRecord[] medicalRecords){
		//TODO
	}
	
	public void setPersonalBelongings(Supply[] supplies){
		//TODO
	}
	
	public void setFamilyConnections(FamilyRelation[] relation){
		//TODO
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public void addPersonalBelonging(Supply supply){
		//TODO
	}
	
	public void removedPersonalBelonging(Supply supply){
		//TODO
	}
	
	public void addFamilyConnection(FamilyRelation familyConnection){
		//TODO
	}
	
	public void removeFamilyConnection(FamilyRelation familyConnection){
		//TODO
	}
	
	public void addMedicalRecord(MedicalRecord medicalRecord){
		//TODO
	}
}