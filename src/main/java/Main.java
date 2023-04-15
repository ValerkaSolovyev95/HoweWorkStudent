import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

class Main{
    public static void main(String[] args) {
        HashMap <String, ArrayList<Integer>> mashaMarks = new HashMap<>();
        ArrayList<Integer> mashaMath = new ArrayList<>();
        mashaMath.add(5);
        mashaMath.add(5);
        mashaMath.add(5);

        ArrayList<Integer> mashaEnglish = new ArrayList<>();
        mashaEnglish.add(5);
        mashaEnglish.add(4);
        mashaEnglish.add(5);

        mashaMarks.put("Math", mashaMath);
        mashaMarks.put("English", mashaEnglish);

        Student student1 = new Student("Masha", 13, 38300,mashaMarks);

        HashMap <String, ArrayList<Integer>> dashaMarks = new HashMap<>();
        ArrayList<Integer> dashaMath = new ArrayList<>();
        dashaMath.add(5);
        dashaMath.add(4);
        dashaMath.add(4);

        ArrayList<Integer> dashaEnglish = new ArrayList<>();
        dashaEnglish.add(5);
        dashaEnglish.add(5);
        dashaEnglish.add(5);

        dashaMarks.put("Math", dashaMath);
        dashaMarks.put("English", dashaEnglish);

        Student student2 = new Student("Dasha", 13, 383001,dashaMarks);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);

        System.out.println(Student.getBestStudent(students));



    }

    }
