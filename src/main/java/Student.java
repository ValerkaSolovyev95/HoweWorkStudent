import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private int age;
    private long id;
    private HashMap<String, ArrayList<Integer>> journal;

    public Student(String name, int age, long id, HashMap<String, ArrayList<Integer>> journal) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.journal = journal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public HashMap<String, ArrayList<Integer>> getJournal() {
        return journal;
    }

    public void setJournal(HashMap<String, ArrayList<Integer>> journal) {
        this.journal = journal;
    }

    public static int getSumObjectMarks(ArrayList<Integer> marks) {
        int sumObject = 0;
        for (Integer mark : marks
        ) {
            sumObject += mark;
        }
        return sumObject;
    }

    public static double getSumObjectsMarks(int... sumObject) {
        double sumObjects = 0;
        for (int sum : sumObject
        ) {
            sumObjects += sum;
        }
        return sumObjects;
    }

    public static HashMap<String, Double> getBestStudent(ArrayList<Student> students) {
        HashMap<String, Double> bestStudent = new HashMap<>();
        double middleSum;
        for (Student student : students
        ) {
            var listMarksMath = student.getJournal().get("Math");
            var listMarksEnglish = student.getJournal().get("English");
            double sizeMarks = (listMarksMath.size() + listMarksEnglish.size());
            middleSum = getSumObjectsMarks(getSumObjectMarks(listMarksMath), getSumObjectMarks(listMarksEnglish)) / sizeMarks;
            if (middleSum >= 4.5) {
                bestStudent.put(student.getName(), (double) (Math.round(middleSum * 100)) / 100);
            }
        }
        return bestStudent;
    }
}
