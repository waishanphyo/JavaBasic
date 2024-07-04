package Payment;

public class Developer extends Employee {
    int bonus=10000;
    public static void main(String[] args){
        Developer d1=new Developer();
        System.out.print("Bonus+Salary"+d1.salary+d1.bonus);
    }
}
