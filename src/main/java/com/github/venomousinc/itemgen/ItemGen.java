package com.github.venomousinc.itemgen;

import com.github.venomousinc.itemgen.item.weapon.Weapon;
import com.github.venomousinc.itemgen.item.weapon.WeaponPrefix;
import com.github.venomousinc.itemgen.item.weapon.WeaponSuffix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ItemGen {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemGen.class);

    private ItemGen() {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Weapon name: ");
            String str = sc.nextLine();
            Weapon weapon = new Weapon(str);

            System.out.println(WeaponPrefix.getFormattedList());
            System.out.format("%n * Name: %s%n * Description: [%s]%n", weapon.getName(), weapon.getDescription());
            while(weapon.getPrefix() == null) {
                System.out.print("Choose a Prefix: ");
                if(sc.hasNextInt()) {
                    int index = sc.nextInt();
                    if(index >= 0 && index < WeaponPrefix.values().length) {
                        weapon.setPrefix(WeaponPrefix.values()[index]);
                    }
                } else {
                    sc.nextLine();
                }
            }

            System.out.println(WeaponSuffix.getFormattedList());
            System.out.format("%n * Name: %s%n * Description: [%s]%n", weapon.getName(), weapon.getDescription());
            while(weapon.getSuffix() == null) {
                System.out.print("Choose a Suffix: ");
                if(sc.hasNextInt()) {
                    int index = sc.nextInt();
                    if(index >= 0 && index < WeaponSuffix.values().length) {
                        weapon.setSuffix(WeaponSuffix.values()[index]);
                    }
                } else {
                    sc.nextLine();
                }
            }

            System.out.format("%n * Name: %s%n * Description: [%s]%n", weapon.getName(), weapon.getDescription());
        } catch(NullPointerException | InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ItemGen itemGen = new ItemGen();
    }

}
