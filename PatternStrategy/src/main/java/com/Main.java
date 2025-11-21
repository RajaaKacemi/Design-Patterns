package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws  Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String, Strategy> StrategyMap = new HashMap<>();
        Strategy strategy;
            while(true){

            System.out.println("Quelle strategie ?");
            String  str= scanner.nextLine();
            strategy=StrategyMap.get(str);
            if(strategy == null){
                System.out.println("Creation d'un nouvel objet de StrategyImpl"+str);
                strategy = (Strategy) Class.forName("com.StrategyImpl"+str).getConstructor().newInstance();
                StrategyMap.put(str, strategy);
            }
            context.setStrategy(strategy);
            context.effectuerOperation();
        }
    }

}