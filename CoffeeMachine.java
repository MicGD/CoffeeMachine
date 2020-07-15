package machine;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int waterAmount = 400;
        int milkAmount = 540;
        int beanAmount = 120;
        int cupAmount = 9;
        int moneyAmount = 550;

        int fillWater = 0;
        int fillMilk = 0;
        int fillBeans = 0;
        int fillCups = 0;

        int takeCase = 0;

        boolean exitBoolean = false;


        String actionList = "Write action (buy, fill, take, remaining, exit):";
        String machineHas = "The coffee machine has:";
        String writeWater = "Write how many ml of water do you want to add:";
        String writeMilk = "Write how many ml of milk do you want to add: ";
        String writeBeans = "Write how many grams of coffee beans do you want to add:";
        String writeCups = "Write how many disposable cups of coffee do you want to add:";
        String action1;
        String action2;

        System.out.println(machineHas);
        System.out.println(waterAmount + " " + "of water");
        System.out.println(milkAmount + " " + "of milk");
        System.out.println(beanAmount + " " + "of coffee beans");
        System.out.println(cupAmount + " " + "of disposable cups");
        System.out.println(moneyAmount + " " + "of money");

        System.out.printf(actionList);
        action1 = s.next();

        while (!exitBoolean) {
            switch (action1) {
                case "buy":
                    System.out.printf("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    action2 = s.next();
                    switch (action2) {
                        case "3":
                            waterAmount = waterAmount - 200;
                            milkAmount = milkAmount - 100;
                            beanAmount = beanAmount - 12;
                            cupAmount = cupAmount - 1;
                            moneyAmount = moneyAmount + 6;

                            System.out.println(machineHas);
                            System.out.println(waterAmount + " " + "of water");
                            System.out.println(milkAmount + " " + "of milk");
                            System.out.println(beanAmount + " " + "of coffee beans");
                            System.out.println(cupAmount + " " + "of disposable cups");
                            System.out.println(moneyAmount + " " + "of money");
                            continue;
                        case "2":
                            waterAmount = waterAmount - 350;
                            milkAmount = milkAmount - 75;
                            beanAmount = beanAmount - 20;
                            cupAmount = cupAmount - 1;
                            moneyAmount = moneyAmount + 7;

                            System.out.println(machineHas);
                            System.out.println(waterAmount + " " + "of water");
                            System.out.println(milkAmount + " " + "of milk");
                            System.out.println(beanAmount + " " + "of coffee beans");
                            System.out.println(cupAmount + " " + "of disposable cups");
                            System.out.println(moneyAmount + " " + "of money");
                            continue;
                        case "1":
                            waterAmount = waterAmount - 250;
                            beanAmount = beanAmount - 16;
                            cupAmount = cupAmount - 1;
                            moneyAmount = moneyAmount + 4;

                            System.out.println(machineHas);
                            System.out.println(waterAmount + " " + "of water");
                            System.out.println(milkAmount + " " + "of milk");
                            System.out.println(beanAmount + " " + "of coffee beans");
                            System.out.println(cupAmount + " " + "of disposable cups");
                            System.out.println(moneyAmount + " " + "of money");
                            continue;
                    }
                    continue;
                case "fill":
                    System.out.println(writeWater);
                    fillWater = s.nextInt();

                    System.out.println(writeMilk);
                    fillMilk = s.nextInt();

                    System.out.println(writeBeans);
                    fillBeans = s.nextInt();

                    System.out.println(writeCups);
                    fillCups = s.nextInt();

                    waterAmount = waterAmount + fillWater;
                    milkAmount = milkAmount + fillMilk;
                    beanAmount = beanAmount + fillBeans;
                    cupAmount = cupAmount + fillCups;
                    moneyAmount = moneyAmount;

                    System.out.println(machineHas);
                    System.out.println(waterAmount + " " + "of water");
                    System.out.println(milkAmount + " " + "of milk");
                    System.out.println(beanAmount + " " + "of coffee beans");
                    System.out.println(cupAmount + " " + "of disposable cups");
                    System.out.println(moneyAmount + " " + "of money");
                    
                case "take":
                    System.out.println("I gave you $" + moneyAmount);

                    moneyAmount = moneyAmount - moneyAmount;

                    System.out.println(machineHas);
                    System.out.println(waterAmount + " " + "of water");
                    System.out.println(milkAmount + " " + "of milk");
                    System.out.println(beanAmount + " " + "of coffee beans");
                    System.out.println(cupAmount + " " + "disposable cups");
                    System.out.println(moneyAmount + " of money");


                case "remaining":
                    System.out.println(machineHas);
                    System.out.println(waterAmount + " " + "of water");
                    System.out.println(milkAmount + " " + "of milk");
                    System.out.println(beanAmount + " " + "of coffee beans");
                    System.out.println(cupAmount + " " + "disposable cups");
                    System.out.println(moneyAmount + " of money");
                default:
                    System.out.println("Unknown Input!");
                case "exit":
                    exitBoolean = true;

            }
        }
    }

}

