package com.fancl.abstractfactory;

public class TestMe {
    public static void main(String[] args) {
        Kingdom elfKingdom = new Kingdom("elfkingdom", Kingdom.createKingdomFactory(Kingdom.KingdomType.ELF));
        System.out.println(elfKingdom.getKingdomName()+" has bean build,king's name is:"+elfKingdom.getKing().getName());
        Kingdom orcKingdom = new Kingdom("orckingdom", Kingdom.createKingdomFactory(Kingdom.KingdomType.ORC));
        System.out.println(orcKingdom.getKingdomName()+" has bean build,king's name is:"+elfKingdom.getKing().getName());
    }
}
