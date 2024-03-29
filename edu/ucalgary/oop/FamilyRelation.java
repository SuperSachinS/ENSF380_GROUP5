package edu.ucalgary.oop;

public class FamilyRelation {
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;

    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo){
        this.setPersonOne(personOne);
        this.setRelationshipTo(relationshipTo);
        this.setPersonTwo(personTwo);
    }
    
    public DisasterVictim getPersonOne(){
        return this.personOne;
    }


    public void setPersonOne(DisasterVictim personOne){
        this.personOne = personOne;
    }

    public String getRelationshipTo(){
        return this.relationshipTo;
    }

    public void setRelationshipTo(String relationshipTo){
        this.relationshipTo = relationshipTo;
    }

    public DisasterVictim getPersonTwo(){
        return this.personTwo;
    }

    public void setPersonTwo(DisasterVictim personTwo){
        this.personTwo = personTwo;
    }
}
