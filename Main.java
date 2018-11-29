package ua.i.sonne.homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student petrov = new Student("Ivan", "Petrov", "Sidorovich", 22, true);
        Student ivanov = new Student("Petr", "Ivanov", "Nikolaevich", 22, true);
        Student sidorov = new Student("Ivan", "Sidorov", "Sidorovich", 22, true);
        Student glushak = new Student("Ivan", "Glushak", "Sidorovich", 22, true);
        Student shirobokov = new Student("Igor", "Shirobokov", "Evgenevich", 35, true);
        Student sachko = new Student("Ivan", "Sachko", "Sidorovich", 22, true);
        Student student7 = new Student("Ivan", "Petrov", "Sidorovich", 22, true);
        Student student8 = new Student("Ivan", "Petrov", "Sidorovich", 22, true);
        Student student9 = new Student("Ivan", "Petrov", "Sidorovich", 22, true);
        Student student10 = new Student("Ivan", "Petrov", "Sidorovich", 22, true);
        Student student11 = new Student("Ivan", "Petrov", "Sidorovich", 22, true);

        Group group = new Group();
        try {
            group.addStudent(petrov);
            group.addStudent(ivanov);
            group.addStudent(sidorov);
            group.addStudent(glushak);
            group.addStudent(shirobokov);
        } catch (GroupOverflowException e) {
            e.printStackTrace();
        }

        System.out.println(petrov);

        group.searchStudentBySurname("Petrov");
        group.searchStudentBySurname("Tsimbaliuk");

        System.out.println(group);
    }
}
