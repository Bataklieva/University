package University;

import java.util.ArrayList;
import java.util.List;

public class University {
    public List<Student> students;
    public int capacity;

    public University(int capacity) {
        this.capacity = capacity;
        students = new ArrayList<>();
    }


    public int getCapacity() {
        return this.capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentCount() {
        return this.students.size();
    }

    public String registerStudent(Student student) {

        if (this.students.contains(student)) {
            return "Student is already in the university";
        } else if (students.size() == capacity){
            return "No seats in the university";
        } else {
            this.students.add(student);
            return  "Added student " + student.getFirstName() + " " + student.getLastName();
        }
    }

    public String dismissStudent(Student student) {
        if (this.students.contains(student)) {
            this.students.remove(student);
            return "Removed student " + student.getFirstName() + " " + student.getLastName();
        } else {
            return "Student not found";
        }
    }

    public Student getStudent(String firstName, String lastName) {

        for (Student student: students) {
           if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
               return student;
            }
        }
        return null;
    }

    public String getStatistics() {
        StringBuilder stringer = new StringBuilder();

        for (Student student : students) {

            stringer.append("==Student: First Name = ").append(student.getFirstName())
                    .append(", Last Name = ").append(student.getLastName())
                    .append(", Best Subject = ").append(student.getBestSubject()).append(System.lineSeparator());
        }

        return stringer.toString();
    }

}
