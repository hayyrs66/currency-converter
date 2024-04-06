package main;

import interfaces.Command;

import modules.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Map<Integer, Command> commandMap = new HashMap<>();
        commandMap.put(1, new DollarToArgentinePeso());
        commandMap.put(2, new ArgentinePesoToDollar());
        commandMap.put(3, new DollarToBrazilianReal());
        commandMap.put(4, new BrazilianRealToDollar());
        commandMap.put(5, new DollarToColombianPeso());
        commandMap.put(6, new ColombianPesoToDollar());


        String mainMessage = """
                ----------------------------------
                Welcome to Currency Converter
                
                Press 1 - Dollar -> Argentine Peso.
                Press 2 - Argentine Peso -> Dollar.
                Press 3 - Dollar -> Brazilian real.
                Press 4 - Brazilian real -> Dollar.
                Press 5 - Dollar -> Colombian Peso.
                Press 6 - Colombian Peso -> Dollar.
                Press 7 - Exit.
                ----------------------------------
                """;

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println(mainMessage);
            int choice = scanner.nextInt();

            if(choice >=1 && choice <= 6){
                System.out.println("Enter the amount to convert:");
                double amount = scanner.nextDouble();
                Command command = commandMap.get(choice);

                if(command != null){
                    command.execute(amount);
                    System.in.read();
                }

            } else if(choice == 7){
                System.out.println("Thank you for using this app");
                break;
            } else{
                System.out.println("Invalid option");
            }
        }
    }
}