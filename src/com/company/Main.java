package com.company;

public class Main {

    public static void main(String[] args) {
	Author author=new Author("Pavel","asdsfas@mail.com",'m');
	System.out.println(author.toString());
	Ball ball=new Ball();
	Ball ball2=new Ball(7.9,1.3);
	System.out.println(ball.toString());
	ball.move(10,5);
	System.out.println(ball.toString());
	System.out.println(ball2.toString());
    }
}
