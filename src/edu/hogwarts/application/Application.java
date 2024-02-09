package edu.hogwarts.application;

public class Application {

    public static void main(String[] args) {

        Application app = new Application();
        app.start();
    }

    private void start() {
        InitData initData = new InitData();
        initData.initData();


    }


}
