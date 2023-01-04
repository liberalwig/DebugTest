package sample;

public class Dbtest {
    public static void main(String[] args) {

        Person person = new Person();
        person.setAddr("Seoul");
        person.setBaseSalary(1000000);
        person.setBonus(50000);
        person.setName("홍길동");
        person.SalaryCalc(1000);

        int pay = person.SalaryCalc(1000);
        System.out.println(String.format("월급은 %d 입니다.", pay));

    }
}
