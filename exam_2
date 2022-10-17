import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "POSITIVE" if the number is a positive number. 
        // print "NEGATIVE" if the number is a negative number. 
        // print "ZERO" if the number is ZERO. 
        //(10 pts)
        System.out.println("1. Positive, negative, zero");
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        // Answer
        if (number > 0) {
            System.out.print("Positive");
        } 
        else if (number < 0) {
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }

        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // or a composite number.
        // (10 pts)

        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();

        // Answer
        String composite = "Composite";
        switch (lastDigit) {
            case 4:
            composite = "Composite Number";
        break;
            case 6:
            composite = "Composite Number";
        break;
            case 8:
            composite = "Composite Number";
        break;
            case 9:
            composite = "Composite Number";
        break;
            case 2:
            composite = "Prime Number";
        break;
            case 3:
            composite = "Prime Number";
        break;
            case 5:
            composite = "Prime Number";
        break;        
            case 7:
        composite = "Prime Number";
        break;
            default:
            System.out.print("NEITHER");
        return;
}
        System.out.print(composite);

        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();

        // Answer
        int sum = firstName.length() + surName.length();
        System.out.print(firstName + " " + surName + " - Total sum of the character length: " + sum);

        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest number.
   
        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();

        // Answer
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.print(firstNumber + "  is the largest number");
        } 
        else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.print(secondNumber + "  is the largest number");
        } else {
            System.out.print(thirdNumber + "  is the largest number");
        }

        // ==============================================================================

        // 5. Create a method that will print "VOWEL" if your name starts with
        // a vowel and "CONSONANT" if your name starts with a consonant.
        
        System.out.println("5. Vowel or Consonant");
        System.out.print("Enter the first character of your first name: ");
        char firstChar = scan.next().charAt(0);

        // Answer
        String vowel;
        switch (firstChar) {
            case 'A':
                vowel = "Vowel";   
                break;
            case 'E':   
                vowel = "Vowel";
                break;  
            case 'I':   
                vowel = "Vowel";
                break;
            case 'O': 
                vowel = "Vowel";  
                break;  
            case 'U':   
                vowel = "Vowel";
                break;    
            default:
                System.out.println("The first character of your first name is a Consonant");
                return;
        }
        System.out.println("The first character of your first name is a " + vowel);

        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();

        // Answer
        if (studentNumber == 2022101538) {
            System.out.print("Valid");
        } else {
            System.out.print("Invalid");
        }       

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String surName = scan.next();

        // Answer
        if (firstName == firstName.toUpperCase() && surName == surName.toLowerCase()) {
            System.out.print("Valid");
        } else {
            System.out.print("Invalid");
        }          

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();

        // If BSIT
        System.out.print("Enter your specialization (MWAA or MAA): ");
        String specialization1 = scan.next();

        // If BSCS
        System.out.print("Enter your specialization (DF or ML): ");
        String specialization2 = scan.next();

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();

        // Answer
        String valid = "Valid";
        switch (strand) {
            case "STEM":
                valid = "Valid";
                break;
            case "ICT":
                valid = "Valid";
                break;
            case "HUMSS":
                valid = "Valid";
                break;
            case "HOME ECONOMICS":
                valid = "Valid";
                break;
            case "ARTS AND DESIGN":
                valid = "Valid";
                break;
            case "TVL MARITIME":
                valid = "Valid";
                break;
            default:
                System.out.print("Invalid");
                return;
        }
        System.out.print("SHS strand: " + valid);

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        //(10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        // Answer
        String valid = "Valid";
        switch (studentEmailAddress) {
            case "navarro@students.national-u.edu.ph":
                valid = "Valid";
                break;
        
            default:
            System.out.println("Invalid");
                return;
        }
        System.out.print(valid);

        // Close scanner
        scan.close();
    }
}
