package StudentInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String stusent[][] ={
                //{"1","Saima","4","Dhaka"},
                {"Saima","4","Dhaka"},
                {"Farzana","4","Dhaka"},
                {"Bithy","4","Dhaka"}

              //  {"2","FARZANA","4","Dhaka"},
                //{"3","Bithy","5","Khulna"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id");
        int id = scanner.nextInt();
        scanner.nextLine();
       System.out.println("Set name");
        String name = scanner.nextLine();
       scanner.nextLine();
        System.out.println("Set class");
        int sclass = scanner.nextInt();
       scanner.nextLine();
        System.out.println("Set address");
        String address = scanner.nextLine();
       // scanner.nextLine();


        Students students = new Students();
        students.setId(id);
       students.setName(name);
        students.setsClass(sclass);
        students.setAddress(address);


        InsertStu insertStu = new InsertStu();
       insertStu.insertStudentInfo(stusent);
        insertStu.updateStudent(students);

    }
}
