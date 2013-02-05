package dippractice;

import java.util.Scanner;

public class ConsoleInputStrategy implements InputStrategy {
    
    @Override
    public String getMessage(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
