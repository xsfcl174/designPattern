package com.fancl.facade;

public class TestMe {
    public static void main(String[] args) {
        FileCipherFacade facade = new FileCipherFacade();
        facade.loadFile("/user/docuemnt/save.txt");

        facade.saveFile("/user/document/file.txt", "text".getBytes());
    }
}
