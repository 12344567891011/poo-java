public class DailyEmployee extends Employee
{
    private float worlDayPrice;
    private int dailyRate;



    public float getWorlDayPrice() {
        return this.worlDayPrice;
    }

    public void setWorlDayPrice(float worlDayPrice) {
        this.worlDayPrice = worlDayPrice;
    }

    public int getDailyRate() {
        return this.dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    public float getSalary() {
        return worlDayPrice * dailyRate;
    }

    public DailyEmployee(float worlDayPrice, int dailyRate,String name, String address, String department, String email, float salary)
    {
        super(name, address, department, email, salary);
        this.worlDayPrice = worlDayPrice;
        this.dailyRate = dailyRate;
    }
    
}