package com;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Quelle est la strategie ?");
            String  str= scanner.nextLine();
            Strategy strategy = (Strategy) Class.forName("com.StrategyImpl"+str).newInstance();
            context.setStrategy(strategy);
            context.effectuerOperation();
        }
    }
}