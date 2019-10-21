package emailapp;

import java.util.Scanner;

public class Email {

    private String firsName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength = 10;
    priveta String email;
    private int mailboxCapacity;
    private String alternateEmail;

    // constructor to recieve the firstname and lastname

    public Email(String firstName, String lastName){
        this.firsName = firstName;
        this.lastName = lastName;
        System.out.println("Email created" + this.firsName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // combile elements to generate email

    }

    // Ask for department
    private String setDepartment(){
        System.out.print("Department codes:  \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \nEnter the department code \n");
        Scanner in = new Scanner(System.in);
        int dptChoice = in.nextInt();

        // conditions
        if(dptChoice == 1) {return "sales";}
        else if(dptChoice == 2){return "dev";}
        else if(dptChoice == 3){return "acc";}
        else {return "";}
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890!@#$%";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
