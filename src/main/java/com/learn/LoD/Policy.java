package com.learn.LoD;

import java.util.List;

public class Policy {
    private List<Supporter> supporters;
    private List<Opponent> opponents;

    public List<Supporter> getSupporters() {
        return supporters;
    }

    public void setSupporters(List<Supporter> supporters) {
        this.supporters = supporters;
    }

    public List<Opponent> getOpponents() {
        return opponents;
    }

    public void setOpponents(List<Opponent> opponents) {
        this.opponents = opponents;
    }

    public void printAll(){
        for(Supporter supporter: supporters){
            System.out.println(supporter.getName());
        }
        for(Opponent opponent: opponents){
            System.out.println(opponent.getName());
        }
    }
}
