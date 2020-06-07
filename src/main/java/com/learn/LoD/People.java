package com.learn.LoD;

import java.util.List;

public class People {
    public void showPolitiansBad(Policy policy){
        // a bad implementation
        List<Opponent> opponents = policy.getOpponents();
        List<Supporter> supporters = policy.getSupporters();

        for(Supporter supporter: supporters){
            System.out.println(supporter.getName());
        }
        for(Opponent opponent: opponents){
            System.out.println(opponent.getName());
        }
    }

    public void showPolitiansGood(Policy policy){
        policy.printAll();
    }
}
