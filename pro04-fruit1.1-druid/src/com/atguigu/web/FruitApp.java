package com.atguigu.web;

import com.atguigu.dao.impl.FruitDAOImpl;
import com.atguigu.service.FruitServiceDAOImpl;

import java.util.Scanner;

/**
 * @author LiJH
 * @date 2022-12-11
 */
public class FruitApp {
    public static void main(String[] args) {
        FruitDAOImpl fruitDAO = new FruitDAOImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.查询所有");
            System.out.println("2.查询id");
            System.out.println("3.添加");
            System.out.println("4.根据id修改");
            System.out.println("5.根据id查询");
            System.out.print("请输入1-5");
            int i = input.nextInt();
            switch (i) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }
    public static void findAll(){
        FruitServiceDAOImpl fruitServiceDAO = new FruitServiceDAOImpl();

    }
}
