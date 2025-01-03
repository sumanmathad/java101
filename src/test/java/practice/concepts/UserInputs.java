package practice.concepts;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class UserInputs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter a name:");
        name= sc.nextLine();
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println("Enter the weight:");
        float weight = sc.nextFloat();

        System.out.println("name is "+name);
        System.out.println("age is "+age);
        System.out.println("weight is "+weight);
    }





}
