
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ficonic Terry
 */
public class Grade {
    
    String grade0 = "";
    String grade1 = "";
    String grade2 = "";
    String grade3 = "";
    String grade4 = "";
    String grade5 = "";
    
    int sum;
    double credit;

    public void doSomething(Scanner scanner) {
        while (true){
            int i = Integer.parseInt(scanner.nextLine());
            if(i == -1){
                break;
            }else if(i >= 0 && i <= 29){
                grade0 += "*";
            }else if(i >= 30 && i <= 34){
                grade1 += "*";
            }else if(i >= 35 && i <= 39){
                grade2 += "*";
            }else if(i >= 40 && i <= 44){
                grade3 += "*";
            }else if(i >= 45 && i <= 49){
                grade4 += "*";
            }else if(i >= 50 && i <= 60){
                grade5 += "*";
            }
        }
    }

    public void printStars() {
        System.out.println("Grade distribution:");
        System.out.println("5: " + grade5);
        System.out.println("4: " + grade4);
        System.out.println("3: " + grade3);
        System.out.println("2: " + grade2);
        System.out.println("1: " + grade1);
        System.out.println("0: " + grade0);
    }
    
    public void sum(){
        sum = grade1.length() + grade2.length() + grade3.length() + grade4.length() + grade5.length() + grade0.length();
    }

    public void printAcceptance() {
        sum();
        if(sum == 0){
            credit = 50.0;
        }else{
            credit = (sum - grade0.length()) * 100 / sum;
        }
        System.out.println("Acceptance percentage: " + credit);
    }
   
}
