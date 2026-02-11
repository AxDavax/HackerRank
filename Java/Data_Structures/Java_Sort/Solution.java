import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student otherStudent) {
        int fstCmp = Double.compare(otherStudent.cgpa, this.cgpa);
        if(fstCmp != 0) return fstCmp;

        int sdCmp = fname.compareTo(otherStudent.fname);
        return (sdCmp != 0) ? sdCmp : Integer.compare(id, otherStudent.id);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases-- >0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            studentList.add(new Student(id, fname, cgpa));
        }

        Collections.sort(studentList);
        for(Student st: studentList)
            System.out.println(st.getFname());
    }
}