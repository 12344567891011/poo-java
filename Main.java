public class Main
{
    public static void main(String[] args)
    {
       Employee e1 = new Employee("asmae","taza","it","a@s",34567);
       SalariedEmployee e2 = new SalariedEmployee(200,"asmae","taza","it","a@s",34567);
       DailyEmployee e3 = new DailyEmployee(10,5,"asmae","taza","it","a@s",34567);
       HourlyEmployee e4 = new HourlyEmployee(100,54,"asmae","taza","it","a@s",34567);
       System.out.println("salary = "+e1.getSalary());
       System.out.println("salary = "+e2.getSalary());
       System.out.println("salary = "+e3.getSalary());
       System.out.println("salary = "+e4.getSalary());
    }

}
