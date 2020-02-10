package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student (String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
        this.attendance = new HashMap<String, String>();
    }

    public String toString() {
        String result = String.format("[name: %s]", this.name);
        for (int grade: grades) {
            result += ", [grade: " + grade + "]";
        }
        result += ", [grade average: " + getGradeAverage() + "]";
        result += ", [Attendance Percentage: " + getAttendancePercentage() + "]\n";
        result += "[Absences: " + getAbsences().toString() + "]\n";
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAbsences() {
        ArrayList<String> absences = new ArrayList<>();
        for (String date: attendance.keySet()) {
            if (attendance.get(date).equalsIgnoreCase("A")) {
                absences.add(date);
            }
        }
        return absences;
    }

    public int getAttendancePercentage() {
        int attendancePercentage = 100;
        int days = attendance.size();
        double absences = 0;
        for (String date: attendance.keySet()) {
            if (attendance.get(date).equalsIgnoreCase("A")) {
                absences++;
            }
        }
        attendancePercentage = (int) (attendancePercentage - ((absences/days) * 100));

        return attendancePercentage;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double average = 0.0;
        double sum = 0.0;
        for (Integer grade: grades) {
            sum += grade.intValue();
        }
        average = sum/grades.size();
        return average;
    }

    public boolean recordAttendance(String date, String value) {

        // validate date
        if (validateDate(date) != true) {
            System.out.printf("Invalid date: %s\n", date);
            return false;
        } else if (!value.equalsIgnoreCase("A") && !value.equalsIgnoreCase("P")) {
            System.out.printf("Invalid attendance record: %s\n", value);
            return false;
        }

        // add record
        this.attendance.put(date, value);

        return true;
    }

    public String toCSVrow(String repo, String delimiter) {
        String result = String.format("%s%s%s%s%6.2f\n", this.name, delimiter, repo, delimiter, getGradeAverage());
        return result;
    }

    public static String getCSV(HashMap<String, Student> students) {
        String result = getCSV(students, "\t");
        return result;
    }

    public static String getCSV(HashMap<String, Student> students, String delimiter) {
        String result = String.format("NAME%sGIT REPO%sGRADE AVERAGE\n", delimiter, delimiter);
        for (String repo : students.keySet()) {
            Student student = students.get(repo);
            result += student.toCSVrow(repo, delimiter);
        }
        return result;
    }

    public static double getClassAverage(HashMap<String, Student> students) {
        double average = 0.0;
        double sum = 0.0;
        for (String repo : students.keySet()) {
            Student student = students.get(repo);
            sum += student.getGradeAverage();
        }
        if (students.size() > 0) average = sum/students.size();
        return average;
    }

    private static boolean validateDate(String date) {
        String regex = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public static HashMap<String, Student> seedData() {

        HashMap<String, Student> students = new HashMap<>();

        // seeding data
        Student student = new Student("Alpha");
        String key = "https://www.github/alpha-git-repo";
        student.addGrade(97);
        student.addGrade(90);
        student.addGrade(94);
        student.addGrade(98);
        students.put(key, student);
        student = new Student("Beta");
        key = "https://www.github/beta-git-repo";
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(80);
        student.addGrade(70);
        students.put(key, student);
        student = new Student("Gamma");
        key = "https://www.github/gamma-git-repo";
        student.addGrade(75);
        student.addGrade(85);
        student.addGrade(95);
        student.addGrade(100);
        students.put(key, student);
        student = new Student("Delta");
        key = "https://www.github/delta-git-repo";
        student.addGrade(82);
        student.addGrade(77);
        student.addGrade(96);
        student.addGrade(94);
        students.put(key, student);

        // set attendance records
        final String[] absentMatcher = {"A", "P", "P", "P", "P", "P", "P", "P", "P"};
        final String[] dates =
                {"2020-02-03", "2020-02-04", "2020-02-05", "2020-02-06", "2020-02-07",
                        "2020-02-10", "2020-02-11", "2020-02-12", "2020-02-13", "2020-02-14",
                        "2020-02-17", "2020-02-18", "2020-02-19", "2020-02-20", "2020-02-21"};
        for (String repo : students.keySet()) {
            student = students.get(repo);
            for (String date: dates) {
                int i = (int) (Math.random() * 9);
                boolean recorded = student.recordAttendance(date, absentMatcher[i]);
                if (!recorded) {
                    System.out.printf("There was an error recording attendance for %s with the values %s, %s\n",
                            student.name, date, absentMatcher[i]);
                }
            }
        }

        return students;
    }

    public static void main(String[] args) {
        Student student = new Student("James");
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(80);
        student.addGrade(70);
        System.out.println("\nThe average grade is " + student.getGradeAverage());

        // test the toString method
        System.out.println("Student: " + student);

        // test the CSV method
        HashMap<String, Student> students = seedData();
        System.out.println("\nCSV format:\n" + Student.getCSV(students));

        // test the CSV method with delimiter
        System.out.println("\nCSV format:\n" + Student.getCSV(students, "\t"));
    }
}
