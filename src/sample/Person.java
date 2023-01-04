package sample;

public class Person {

    private String name;
    private String addr;
    private int baseSalary;
    private int bonus;

    int SalaryCalc(int tax) {

        int salaryTot = baseSalary + bonus;
        int pay = salaryTot - tax;
        return pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
