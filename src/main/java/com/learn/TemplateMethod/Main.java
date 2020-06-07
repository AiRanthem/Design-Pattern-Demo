package com.learn.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        SiChuanRen sichuanren = new SiChuanRen();
        Korea hanguoren = new Korea();
        ColleageStudent daxuesheng = new ColleageStudent();

        System.out.println("\n四川人的一天");
        sichuanren.day();
        System.out.println("\n韩国人的一天");
        hanguoren.day();
        System.out.println("\n大学生的一天");
        daxuesheng.day();
    }
}
