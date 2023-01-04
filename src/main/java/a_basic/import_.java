package a_basic;

import java.util.*; // 导入util下(不包含util子目录中的类)所有类
import java.util.LinkedList;
import java.util.ArrayList;

import c_oop.ClassBasic;

public class import_ {
    public static void main(String[] args) {
        ClassBasic cd = new ClassBasic();
        cd.printName();
        System.out.println(cd.age);
        System.out.println(cd.getName());
    }
}
