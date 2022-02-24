package com.recursion.hard;

public class PartyInvitations {

    static int countInvitations(int quests){
        if(quests==1) return 1;
        if(quests==2) return 2;
        // invite single
        int afterSingle = countInvitations(quests-1);
        //invite couple
        int afterCouple = (quests-1)*countInvitations(quests-2);
        return afterSingle + afterCouple;

    }
    public static void main(String[] args) {
        int quests = 4;
        System.out.println(countInvitations(quests));
    }
}
