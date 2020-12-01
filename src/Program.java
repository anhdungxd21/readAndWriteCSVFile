import csv.CSV;
import peron.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int choice;
        boolean loop = true;
        String id;
        String name;
        String result;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("1.Tao va thong tin student vao file.");
            System.out.println("2.In file.");
            System.out.println("0.Exit.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.print("Enter ID of student: ");
                    id = scanner.nextLine();
                    System.out.print("Enter Name of student: ");
                    name = scanner.nextLine();
                    System.out.print("Enter Result of student: ");
                    result = scanner.nextLine();
                    CSV.csvWriter("student.csv",new Student(id,name,result));
                    break;
                case 2:
                    CSV.csvReader("student.csv");
                    break;
                case 0:
                    loop = false;
                    break;
            }

        }while (loop);
    }
}
