
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
         ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String studentName = "";
        String studentNumber = "";
        String searchTerm = "";

        while (true) {
            System.out.println("name:");
            studentName = reader.nextLine();
            if (studentName.isEmpty()) {
                break;
            }

            System.out.println("studentnumber:");
            studentNumber = reader.nextLine();

            list.add(new Student(studentName, studentNumber));
        }

        for (Student students : list) {
            System.out.println(students);
        }

        System.out.println("");
        System.out.println("Give search term: ");
        searchTerm = reader.nextLine();
        System.out.println("");
        System.out.println("Result: ");

        int t = 0;
        while (t < list.size()) {
            Student nameToSearch = list.get(t); //get the student object
            String stNameToSearch = nameToSearch.getName(); //gets the student name from the student object
            if (stNameToSearch.contains(searchTerm)) {
                System.out.println(nameToSearch);
            }
            t++;
        }
    }
}
        
    
