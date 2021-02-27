/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.program;

/**
 *
 * @author 2ndyrGroupB
 */
public class Employee { //MAIN CLASS
       //stores the first name
        private String firstName;
        //  stores the last name
	private String lastName; 
        // instance variable monthly salary
	private double monthlySalary; 
        
        
       public Employee(String fname, String lname,double monthsalary){ //CONSTRUCTOR
           
           // ACCESSING THE PRIVATE VARIABLES OF EMPLOYEE TO BE ABLE TO SET AND RETRIEVE
           //INITIALIZING
           this.firstName=fname; 
           this.lastName=lname;
           this.monthlySalary=monthsalary;
           
           
          
           
           if(monthsalary<0.0){ // IF monthly salary is not positive, set it to 0.0.
               monthlySalary=0.0;
               
               
           }           
        }
       
       //START OF SET METHOD
       
       // method to set the first name
       public void setFN(String fname){
           firstName=fname;
          
           
       }
       
       
       // method to set the last name
       
       public void setLN(String lname){
           lastName=lname;
           
           
       }
          // method to set the month salary
       public void setMonthS(double monthsalary){
           monthlySalary=monthsalary;
           
       }
       
       // END OF SET METHOD
       
       
      
       
       // START OF GET METHOD
       // method to return the firstname //STRING ATTRIBUTE
       public String getFN(){
           return firstName;
       }
       
       //method to return the lastname// STRING ATTRIBUTE
       
       public String getLN(){
           return lastName;
       }
       
       //method to return the monthly salary // DOUBLE ATTRIBUTE
       
       public double getMS(){
           return monthlySalary;
       }
       
       
       // END OF GET METHOD
       
       //method to return salary yearly
       
       public double getannualsalary(){
           double annualsalary=monthlySalary*12; // CREATE ANNUAL SALARY WITH A DOUBLE ATTRIBUTE FOR STORING THE VALUE
                                               // MONTHLY SALARY MULTIPLIED BY 12 BECAUSE 12 MONTHS = 1 YEAR.                                                
           return annualsalary; //RETURN ANNUALSALARY
       }
       
       
       public double getraiseannualsalary(){
           double raise=monthlySalary*0.1; // DOUBLE RAISE WILL HOLD the monthlySalary multiplied by 0.1; (monthlysalaray is set to (1000)raise is 1200  for annual salary  12000 + 1200)
           double raiseannualsalary = ( monthlySalary + raise ) * 12; //DOUBLE RAISEANNUALSALARY WILL HOLD THE  // monthlysalary+raise multiplied by 12.
           return raiseannualsalary;
       }
       
       
       
       
}
