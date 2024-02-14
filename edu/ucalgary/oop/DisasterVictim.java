package edu.ucalgary.oop;
import java.util.regex.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class DisasterVictim{
	
	//Attributes
    private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String comments;
	private final int ASSIGNED_SOCIAL_ID;
	private ArrayList<MedicalRecord> medicalRecords;
	private ArrayList<FamilyRelation> familyConnections;
	private final String ENTRY_DATE;
	private ArrayList<Supply> personalBelongings;
	private String gender;
	private static int counter = 0;
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
		this.personalBelongings = null;
		this.gender = null;
	}
	//Getters
	
	public String getFirstName(){ return this.firstName; }
	public String getLastName() { return this.lastName; }
	public String getDateOfBirth() { return this.dateOfBirth; }
	public String getComments() { return this.comments; }
	public ArrayList<MedicalRecord> getMedicalRecords() { return this.medicalRecords; }
	public String getEntryDate() { return this.ENTRY_DATE; }
	public int getAssignedSocialID() { return this.ASSIGNED_SOCIAL_ID; }
	public ArrayList<Supply> getPersonalBelongings() { return this.personalBelongings; }
	public ArrayList<FamilyRelation> getFamilyConnections() {return this.familyConnections; }
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
	
	public void setMedicalRecords(ArrayList<MedicalRecord> medicalRecords){
		this.medicalRecords = medicalRecords;
	}
	
	public void setPersonalBelongings(ArrayList<Supply> supplies){
		this.personalBelongings = supplies;
	}
	
	public void setFamilyConnections(ArrayList<FamilyRelation> relation){
		this.familyConnections = relation;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public void addPersonalBelonging(Supply supply){
		int supplyLength = personalBelongings.size();
		for(int i = 0; i < supplyLength; i++){
			if (this.personalBelongings.get(i).getType() == supply.getType()){
				int current_quantity = this.personalBelongings.get(i).getQuantity();
				int new_quantity = current_quantity + supply.getQuantity();
				this.personalBelongings.get(i).setQuantity(new_quantity); 
				return;
			}
		}
		this.personalBelongings.add(supply);	
	}
	
	public void removedPersonalBelonging(Supply supply){
		int supplyLength = personalBelongings.size();
		for(int i = 0; i < supplyLength; i++){
			if (this.personalBelongings.get(i).getType() == supply.getType()){
				this.personalBelongings.remove(i);
				return;
			}
		}
	}
	
	public void addFamilyConnection(FamilyRelation familyConnection){
		this.familyConnections.add(familyConnection);
	}
	
	public void removeFamilyConnection(FamilyRelation familyConnection){
		int relationLength = this.familyConnections.size();
		
		for(int i = 0; i < relationLength; i++){
			if(this.familyConnections.get(i) == familyConnection){
				this.familyConnections.remove(i);
				return;
			}
			
			
		}
		
	}
	
	public void addMedicalRecord(MedicalRecord medicalRecord){
		this.medicalRecords.add(medicalRecord);
	}
}