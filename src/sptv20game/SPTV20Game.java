/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class SPTV20Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // программа загадывает число и просит пользователя отгадать
        //если пользователь угадал, он выйграл
        //иначе пользователь проиграл
        int max = 5, min = 0;
        Random random = new Random();
        int gameNum = random.nextInt (max - min +1) + min;
        System.out.println("Программа загадала число в диапозоне от 0 до 5, угадай : ");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        if(gameNum == userNum){
            System.out.println("Ты выйграл");
        }else{
            System.out.println(":(ты проиграл. Задуманное число: " + gameNum);
        }
    }
    
}
