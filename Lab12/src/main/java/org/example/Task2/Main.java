package org.example.Task2;

public class Main {
    public static void main(String[] args) {
        Tester.printStaticInfo();
        Tester tester1 = new Tester("John", "Doe");
        Tester tester2 = new Tester("Jane", "Smith", 5);
        Tester tester3 = new Tester("Alice", "Johnson", 3, "Advanced");
        tester1.printInfo();
        tester2.printInfo(true);
        tester3.printInfo("Памагите");
    }
}
