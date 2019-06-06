package assignments;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {

public PasswordValidator()
        {
                super();
        }

        public static void main(String[] args)
        {
                PasswordValidator passwordValidator = new PasswordValidator();
                
                String userName = "techdive";
                String passWord = "java2011";
                System.out.println("Input : UserName "+userName+" PassWord -> "+passWord);
                
                passwordValidator.passwordValidation(userName,passWord);
                System.out.println();
                passWord = "Java2011*";
                System.out.println("Input : UserName "+userName+" PassWord -> "+passWord);
                passwordValidator.passwordValidation(userName,passWord);
        }

	 public void passwordValidation(String userName, String password)
        {
                boolean valid = true;
                if (password.length() > 15 || password.length() < 8)
                {
                        System.out.println("Password should be less than 15 and more than 8 characters in length.");
                        valid = false;
                }
                if (password.indexOf(userName) > -1)
                {
                        System.out.println("Password Should not be same as user name");
                        valid = false;
                }
                String upperCaseChars = "(.*[A-Z].*)";
                if (!password.matches(upperCaseChars ))
                {
                        System.out.println("Password should contain atleast one upper case alphabet");
                        valid = false;
                }
                String lowerCaseChars = "(.*[a-z].*)";
                if (!password.matches(lowerCaseChars ))
                {
                        System.out.println("Password should contain atleast one lower case alphabet");
                        valid = false;
                }
                String numbers = "(.*[0-9].*)";
                if (!password.matches(numbers ))
                {
                        System.out.println("Password should contain atleast one number.");
                        valid = false;
                }
                String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
                if (!password.matches(specialChars ))
                {
                        System.out.println("Password should contain atleast one special character");
                        valid = false;
                }
                if (valid)
                {
                        System.out.println("Password is valid.");
                }
        }
}

    public static void main(String[] args) {

        String filePath = "read.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            boolean usernameExists = false;
            while((line = bufferedReader.readLine()) != null) {
                if (line.equals(username)) {
                    usernameExists = true;
                    break;
                }
            }
            if (usernameExists) {
                System.out.println("Username exists! Please try again.");
            } else {
                System.out.println("Username accepted");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
