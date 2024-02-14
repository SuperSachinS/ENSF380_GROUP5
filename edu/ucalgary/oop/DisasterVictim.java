


package edu.ucalgary.oop;
import java.util.regex.*;
import java.util.random;
public class DisasterVictim{
	
	//Attributes
    private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String comments;
	private final int ASSIGNED_SOCIAL_ID;
	private MedicalRecord[] medicalRecords;
	private FamilyRelation[] familyConnections;
	private final String ENTRY_DATE;
	private Supply[] personalBelongings;
	private String gender;
	private static final int counter = 0;
	private static final String REGEX = "\\d{4}-\\d{2}-\\d{2}";
	private static final Pattern PATTERN = Pattern.compile(REGEX);
	
	//Methods
	
	//Constructors
	
	public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException{
		Matcher match = PATTERN.matcher(ENTRY_DATE);
		boolean valid_date = match.find();
		
		if (!valid_date){
			throw new IllegalArgumentException("Invalid format for date");
		}
		
		this.firstName = firstName;
		this.ENTRY_DATE = ENTRY_DATE;
		
		this.lastName = null;
		this.dateOfBirth = null;
		this.comments = null;
		
		this.ASSIGNED_SOCIAL_ID = counter;
		counter++;
		this.medicalRecords = null;
		this.familyConnections = null;
		this.ENTRY_DATE = ENTRY_DATE;
		this.personalBelongings = null;
		this.gender = null;
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
		Matcher match = PATTERN.matcher(dateOfBirth);
		boolean valid_date = match.find();
		
		if (!valid_date){
			throw new IllegalArgumentException("Invalid format for date");
		}
		
		this.dateOfBirth = dateOfBirth;
		
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