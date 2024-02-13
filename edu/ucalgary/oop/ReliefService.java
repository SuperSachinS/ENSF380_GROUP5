package edu.ucalgary.oop;

public class ReliefService {
  private Inquirer inquirer;
  private DisasterVictim missingPerson;
  private String dateOfInquiry;
  private String infoProvided;
  private Location lastKnownLocation;

  public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, 
  String infoProvided, Location lastKnownLocation){
    this.setInquirer(inquirer);
    this.setMissingPerson(missingPerson);
    this.setDateOfInquiry(dateOfInquiry);
    this.setInfoProvided(infoProvided);
    this.setLastKnownLocation(lastKnownLocation);
  }

  public void setInquirer(Inquirer inquirer){
    this.inquirer = inquirer;
  }
  public void setMissingPerson(DisasterVictim missingPerson){
    this.missingPerson = missingPerson;
  }
  public void setDateOfInquiry(String dateOfInquiry) throws IllegalArgumentException{
    if(dateOfInquiry){
      this.dateOfInquiry = dateOfInquiry;
      return;
    }
    throw new IllegalArgumentException();
  }
  public void setInfoProvided(String infoProvided){
    this.infoProvided = infoProvided;
  }
  public void setLastKnownLocation(Location lastKnownLocation){
    this.lastKnownLocation = lastKnownLocation;
  }

  public Inquirer getInquirer(){return this.inquirer;}
  public DisasterVictim getMissingPerson(){return this.missingPerson;}
  public String getDateOfInquiry(){return this.dateOfInquiry;}
  public String getInfoProvided(){return this.infoProvided;}
  public Location getLastKnownLocation(){return this.lastKnownLocation;}
}

