public class SalariedEmployee extends Employee
{
    float bonus;
    
    public float getBounus ()
    {
        return (bonus);
    }
    public void setBounus(float bonus)
    {
        this.bonus = bonus;
    }

    public float getSalary() {
        return super.getSalary() + bonus;
    }

    public SalariedEmployee(float bonus,String name, String address, String department, String email, float salary)
    {
        super(name, address, department, email, salary);
        this.bonus = bonus;
    }
}