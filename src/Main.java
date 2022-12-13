

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // Exercise 1 Solution
        String name, address;
        int age;

        // Create a scanner object to be ready to input information from user via keyboard
        Scanner scanner = new Scanner(System.in);

        // Create a PrintWriter object to create, modify, update a text file
        PrintWriter pw = new PrintWriter(new FileWriter("src/tutorialsolution8/users.txt", true));

        // Ask user for requested information
        System.out.println("Enter name : ");
        name = scanner.nextLine();

        System.out.println("Enter address:");
        address = scanner.nextLine();

        System.out.println("Enter age : ");
        age = Integer.parseInt(scanner.nextLine());

        // Write a string to the file (please note: "," is a common deliminator of CSV, you can use ";" also if needed)
        pw.println(name + "," + address + "," + age);

        // PrintWriter does not operate with your disc after each write operations,
        // it collects data in its buffer. flush() method is required to push your data to disc.
        pw.flush();
        pw.close();
    }}