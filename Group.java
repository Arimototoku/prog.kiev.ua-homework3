package ua.i.sonne.homework3;

public class Group {

    private Student[] students = new Student[10];

    public Group() {
    }

    public Group(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    /**
     * Method adds student to group
     *
     * @param student
     */
    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("Student " + student + " added");
                return;
            }
        }
        throw new GroupOverflowException("No available room for student");
    }

    /**
     * Method remove student from the group
     *
     * @param student
     */
    public void removeStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            try {
                if (students[i].equals(student)) {
                    students[i] = null;
                    System.out.println("Student " + student + " removed");
                    return;
                }
            } catch (NullPointerException e) {
            }
        }
        System.out.println("No such student in group");
    }

    /**
     * Method search student in group by surname
     *
     * @param surname
     */
    public String searchStudentBySurname(String surname) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < students.length; i++) {
            try {
                if (students[i].getSurname().equals(surname)) {
                    sb.append("Student ").append(surname).append(" found at position ").append(i).append("\n");
                }
            } catch (NullPointerException e) {
            }
        }
        if (sb.length() == 0) {
            sb.append("Student ").append(surname).append(" not found");
        }
        return sb.toString();
    }


    /**
     * Method sorts students by surname
     *
     * @param students
     * @return
     */
    public Student[] sortStudentsBySurname(Student[] students) {
        Student temp;
        students = removeNull(students);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < students.length - 1; i++) {
                if (students[i].getSurname().compareTo(students[i + 1].getSurname()) > 0) {
                    isSorted = false;
                    temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
        }
        return students;
    }

    /**
     * Method creates new array from students without nulls
     *
     * @param students
     * @return
     */
    public Student[] removeNull(Student[] students) {
        Student[] studentsWithoutNull;
        int counter = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                counter++;
            }
        }
        studentsWithoutNull = new Student[counter];

        int i = 0;
        int j = 0;
        while (i < counter) {
            if (students[j] != null) {
                studentsWithoutNull[i] = students[j];
                i++;
                j++;
            } else {
                j++;
            }
        }
        return studentsWithoutNull;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Student[] sortedStudents = sortStudentsBySurname(students);
        for (int i = 0; i < sortedStudents.length; i++) {
            sb.append(sortedStudents[i]).append("\n");
        }
        return sb.toString();
    }
}
