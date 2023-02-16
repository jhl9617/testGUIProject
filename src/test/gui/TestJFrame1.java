package test.gui;

import javax.swing.*;
import java.awt.*;

//방법 1: JFrame 을 상속받아서 윈도우 창을 구성함

public class TestJFrame1 extends JFrame {

    //기본 윈도우 창 안의 구성 설정은 생성자에서 주로 구현함


    public TestJFrame1() throws HeadlessException {
        super("GUI 테스트");
        JFrame frame = new JFrame();


        this.setTitle("타이틀 문구 변경");

        //창의 위치 지정
//        this.setLocation(100,120);
        this.setLocation(new Point(100,120));
        //창의 크기 지정
//        this.setSize(500,400);
        this.setSize(new Dimension(1000,800));
//        this.setBounds(new Rectangle(100,100,500,400));

        //창의 위치 지정
        this.setLocation(100, 120);

        //만들어진 윈도우가 화면에 보여지게 함
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        //JFrame 사용 테스트 1
        new TestJFrame1();
    }
}
