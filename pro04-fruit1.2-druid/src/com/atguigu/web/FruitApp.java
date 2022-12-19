package com.atguigu.web;

import com.atguigu.module.Fruit;
import com.atguigu.service.FruitService;
import com.atguigu.service.impl.FruitServiceImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

/**
 * @author LiJH
 * @date 2022-12-11
 */
public class FruitApp {
    public static void main(String[] args) {
        //键盘录入
        Scanner input = new Scanner(System.in);
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //循环执行
        while (true) {
            System.out.println("输入以下命令执行操作");
            System.out.println("C：创建  DI：根据id删除  DA:删除所有 U: 修改 FI: 根据ID查询  FA：查询所有   Q:退出");
            //读取操作命令
//            String s = bufferedReader.readLine();
            String s = input.next();
            //switch
            switch (s.toUpperCase()) {
                case "C":
//                    System.out.println("添加");
                    addProduct(input);
                    break;
                case "DI":
//                    System.out.println("根据id删除");
                    deleteByPid(input);
                    break;
                case "DA":
                    System.out.println("删除所有");
                    break;
                case "U":
//                    System.out.println("修改");
                    updateProduct(input);
                    break;
                case "FI":
                    //  System.out.println("根据ID查询");
                    findByPid(input);
                    break;
                case "FA":
                    //System.out.println("查询所有");
                    findAll();
                    break;
                case "Q":
                    System.out.println("退出");
                    System.exit(-1);
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }


        }
    }

    private static void findByPid(Scanner input) {
        FruitService fruitService = new FruitServiceImpl();
        System.out.println("请输入查找的水果编号：");
        int i = input.nextInt();
        Fruit que = fruitService.findById(i);
        System.out.println(que);
    }

    private static void updateProduct(Scanner input) {

        System.out.println("请输入需要修改水果的id：");
        int fid = input.nextInt();
        FruitService fruitService = new FruitServiceImpl();
        Fruit byId = fruitService.findById(fid);
        if (byId != null) {
            System.out.println("请输入修改后水果名称：");
            String fname = input.next();
            System.out.println("请输入修改后水果价格：");
            int price = input.nextInt();
            System.out.println("请输入修改后库存量：");
            int fcount = input.nextInt();
            System.out.println("请输入修改后备注信息：");
            String remark = input.next();
            byId.setFname(fname);
            byId.setPrice(price);
            byId.setFcount(fcount);
            byId.setRemark(remark);
            boolean update = fruitService.update(byId);
            if (update) {
                System.out.println("修改成功！");
            } else {
                System.out.println("修改失败！");
            }
        } else {
            System.out.println("没有此水果！");
        }
    }

    private static void deleteByPid(Scanner input) {
        FruitServiceImpl fruitService = new FruitServiceImpl();
        System.out.println("输入需要删除的水果id：");
        int fid = input.nextInt();
        boolean b = fruitService.delById(fid);
        if (b){
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败！");
        }
    }

    private static void findAll() {
        FruitServiceImpl fruitService = new FruitServiceImpl();
        List<Fruit> all = fruitService.findAll();
        all.forEach(System.out::println);
    }

    public static void addProduct(Scanner input) {
        FruitServiceImpl fruitService = new FruitServiceImpl();
        System.out.println("请输入水果ID：");
        int fid = input.nextInt();
        System.out.println("请输入水果名称：");
        String fname = input.next();
        System.out.println("请输入如水果价格：");
        int price = input.nextInt();
        System.out.println("请输入如库存量：");
        int fcount = input.nextInt();
        System.out.println("请输入备注信息：");
        String remark = input.next();
        Fruit fruit = new Fruit(fid, fname, price, fcount, remark);
        fruitService.add(fruit);
    }
}
