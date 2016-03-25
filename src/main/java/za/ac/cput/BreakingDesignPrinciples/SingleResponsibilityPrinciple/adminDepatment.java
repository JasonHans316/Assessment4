package za.ac.cput.BreakingDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by Admin on 2016/03/24.
 */
public class adminDepatment extends incorrectPrincipleMethods{

    String name = "Jason", surname = "Hans";

    public void saveEmployeeDetails(){
        addEmployee(name, surname);
    }

    public void updateEmployee(String name, String surname)
    {
        updateName(name);
        updateSurname(surname);
    }
}
