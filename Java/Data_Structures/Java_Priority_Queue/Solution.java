import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    Student(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCGPA() {
        return cgpa;
    }

    @Override
    public int compareTo(Student otherStudent) {
        int fstCmp = Double.compare(otherStudent.cgpa, this.cgpa);
        if(fstCmp != 0) return fstCmp;

        int sdCmp = name.compareTo(otherStudent.name);
        return (sdCmp != 0) ? sdCmp : Integer.compare(id, otherStudent.id);
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> yetToBeServed = new PriorityQueue<>();

        for(String event : events) {
            if(!event.equals("SERVED")) {
                String[] parts = event.split(" ");
                yetToBeServed.add(
                        new Student(parts[1], Double.parseDouble(parts[2]), Integer.parseInt(parts[3]))
                );
            }
            else if(!yetToBeServed.isEmpty())
                yetToBeServed.poll();
        }

        List<Student> newList = new ArrayList<>();
        while(!yetToBeServed.isEmpty())
            newList.add(yetToBeServed.poll());

        return newList;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while(totalEvents-- != 0)
            events.add(scan.nextLine());

        List<Student> students = priorities.getStudents(events);

        if(students.isEmpty())
            System.out.println("EMPTY");
        else
            for(Student st : students)
                System.out.println(st.getName());
    }
}