package edu.ucalgary.oop;

public class Inquirer {
    private static String FIRST_NAME;
    private static String LAST_NAME;
    private static String INFO;
    private static String SERVICES_PHONE;
    
    public Inquirer(String FIRST_NAME, String LAST_NAME, String SERVICES_PHONE, String INFO){
      Inquirer.FIRST_NAME = FIRST_NAME;
      Inquirer.LAST_NAME = LAST_NAME;
      Inquirer.SERVICES_PHONE = SERVICES_PHONE;
      Inquirer.INFO = INFO;
    }
    public String getFirstName(){return Inquirer.FIRST_NAME;}
    public String getLastName(){return Inquirer.LAST_NAME;}
    public String getInfo(){return Inquirer.INFO;}
    public String getServicesPhone(){return Inquirer.SERVICES_PHONE;}
}
