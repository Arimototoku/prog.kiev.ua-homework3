package ua.i.sonne.homework3;

public class Main {
    public static void main(String[] args) {
        Student petrov = new Student("Ivan", "Petrov", "Sidorovich", 22, true, 12345, "PM212");
        Student ivanov = new Student("Petr", "Ivanov", "Nikolaevich", 22, true, 2345, "PM212");
        Student sidorov = new Student("Ivan", "Sidorov", "Sidorovich", 22, true, 3545, "PM212");
        Student glushak = new Student("Ivan", "Glushak", "Sidorovich", 22, true, 2356, "PM212");
        Student shirobokov = new Student("Igor", "Shirobokov", "Evgenevich", 35, true, 7674, "PM212");
        Student sachko = new Student("Ivan", "Sachko", "Sidorovich", 22, true, 3431, "PM212");
        Student student7 = new Student("Ivan", "Petrov", "Sidorovich", 22, true, 6867, "PM212");
        Student student8 = new Student("Ivan", "Petrov", "Sidorovich", 22, true, 1214, "PM212");
        Student student9 = new Student("Ivan", "Petrov", "Sidorovich", 22, true, 5657, "PM212");
        Student student10 = new Student("Ivan", "Petrov", "Sidorovich", 22, true, 12132, "PM212");
        Student student11 = new Student("Ivan", "Petrov", "Sidorovich", 22, true, 7676, "PM212");

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

        System.out.println(group.searchStudentBySurname("Petrov"));
        System.out.println(group.searchStudentBySurname("Tsimbaliuk"));

        System.out.println(group);

        try {
            group.addStudent(student7);
        }catch (GroupOverflowException e){
            e.printStackTrace();
        }

        group.removeStudent(sidorov);
        System.out.println(group);

        try {
            group.addStudent(student10);
        } catch (GroupOverflowException e){
            e.printStackTrace();
        }

        System.out.println(group.searchStudentBySurname("Sachko"));
        System.out.println(group.searchStudentBySurname("Petrov"));
    }
}
