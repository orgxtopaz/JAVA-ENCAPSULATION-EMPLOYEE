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
public class EmployeeProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //FIRST EMPLOYEE 
        Employee firstemployee = new Employee("Miguel","Estopa",1000);
        System.out.println("FIRST EMPLOYEE");
        System.out.println("");
        System.out.println(firstemployee.getFN()+" "+" " +firstemployee.getLN()+" " +"MonthlySalary is "+firstemployee.getMS());
        System.out.println("");
        System.out.println("The Annual Salary of "+firstemployee.getFN()+ " "+ "is "+firstemployee.getannualsalary());
        System.out.println("");
        System.out.println("The Annual raise Salary of "+firstemployee.getFN()+ " "+ "is "+firstemployee.getraiseannualsalary());
        
        
         //SECOND EMPLOYEE 
        System.out.println("");
        System.out.println("SECOND EMPLOYEE");
        System.out.println("");
        
        Employee secondemployee = new Employee("Kerwien","Bengil",2000);
        System.out.println(secondemployee.getFN()+" "+" " +secondemployee.getLN()+" " +"MonthlySalary is "+secondemployee.getMS());
        System.out.println("");
        System.out.println("The Annual Salary of "+secondemployee.getFN()+ " "+ "is "+secondemployee.getannualsalary());
        System.out.println("");
        System.out.println("The Annual raise Salary of "+secondemployee.getFN()+ " "+ "is "+secondemployee.getraiseannualsalary());
        
        
    }
    
}
