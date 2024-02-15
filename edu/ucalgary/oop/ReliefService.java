package edu.ucalgary.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    Pattern dateFormat = Pattern.compile("^\\d{4}[-]{1}\\d{2}[-]{1}\\d{2}");
    Matcher myMatcher = dateFormat.matcher(dateOfInquiry);
    if (!myMatcher.find()){
      throw new IllegalArgumentException("Invalid date");
    }else{
      this.dateOfInquiry = dateOfInquiry;
    }
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
  public String getLogDetails(){
    String inq = "Inquirer: ".concat(this.inquirer.getFirstName());
    String miss = ", Missing Person: ".concat(this.missingPerson.getFirstName());
    String date = ", Date of Inquiry: ".concat(this.dateOfInquiry);
    String info = ", Info Provided: ".concat(this.infoProvided);
    String loc = ", Last Known Location: ".concat(this.lastKnownLocation.getName());
    return inq.concat(miss).concat(date).concat(info).concat(loc);
   }
}

