package com.learn.Observer;

public class Main {
    public static void main(String[] args) {
        Supporter zhangsan = new Supporter("zhangsan");
        Supporter lisi = new Supporter("lisi");
        Opponent ryon = new Opponent("ryon");
        Opponent harry = new Opponent("harry");

        Policy policy = new Policy();
        policy.attach(zhangsan);
        policy.attach(lisi);
        policy.attach(ryon);
        policy.attach(harry);

        policy.notify("非毕业班回校");

        System.out.println();

        policy.detach(ryon);
        policy.detach(harry);

        policy.notify("毕业班回校");
    }
}
