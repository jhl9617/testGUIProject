package test.gui;

import javax.swing.*;
import java.awt.*;

//방법 2 : JFrame을 객체로 생성해서 사용
public class TestJFrame2 {
    private JFrame mainFrame;
    public void makeFrame() {
        mainFrame = new JFrame("GUI 테스트2");
        mainFrame.setBounds(new Rectangle(500,500,500,500));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setVisible(true);
        //윈도우 창이 보이게 하려면 반드시 맨 마지막에 보여지는 설정 함

    }


    public static void main(String[] args) {
    //상속받지 않고 직접 객체를 생성함
        new TestJFrame2().makeFrame();

    }
}
