package ru.netology;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      int slot;
      Scanner scanner = new Scanner(System.in);
      Player player = new Player();
      // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
      System.out.format("У игрока %d слотов с оружием,"
          + " введите номер начиная с 0, чтобы выстрелить."
          + " -1, чтобы выйти%n", player.getSlotsCount()
      );

      while (true) {
        //считываем ввод пользователя
        slot = scanner.nextInt();
        if (slot == -1) {
          System.out.println("игра окончена!");
          break;
        } 
          player.shotWithWeapon(slot);
      }
      scanner.close();
    }  
}