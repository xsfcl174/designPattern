package com.fancl.ambassador;

public class TestMe {
    public static void main(String[] args) {
        Client client = new Client();
        long res = client.call(10);
        if(res==100)
            System.out.println("success");
        else
            System.out.println("fail");
    }
}
