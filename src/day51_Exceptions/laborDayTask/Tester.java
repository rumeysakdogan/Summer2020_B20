package day51_Exceptions.laborDayTask;
/*
3. create subclasses of Employee called:
						1. Tester
						2. Developer
 */
public class Tester extends Employee{

    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }
}
