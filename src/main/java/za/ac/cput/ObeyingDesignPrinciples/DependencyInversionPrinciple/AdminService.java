package za.ac.cput.ObeyingDesignPrinciples.DependencyInversionPrinciple;

/**
 * Created by Admin on 2016/03/25.
 */
public class AdminService {
    public double calculateSalary(IAdministration employee)
    {
        return employee.calculateSalary();
    }
}
