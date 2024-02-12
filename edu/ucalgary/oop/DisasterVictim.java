package edu.ucalgary.oop;

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
	
	
	
	
}