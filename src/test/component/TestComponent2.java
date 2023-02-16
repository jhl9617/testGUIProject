package test.component;

import javax.swing.*;
import java.awt.*;

public class TestComponent2 extends JFrame{
    //field
    private JButton oneBtn, twoBtn, thirdBtn, fourthBtn, fiveBtn;



    public TestComponent2() {
        this.setTitle("Components Test 2");
        this.setBounds(new Rectangle(100, 100, 600, 400));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //JFrame은 기본 레이아웃이 BoardLayout임
        //동,서,남,북, 가운데 5개의 구역으로 나눔
        this.setLayout(new BorderLayout());

        //컴포넌트 객체 생성
        oneBtn = new JButton("one");
        twoBtn =new JButton("two");
        thirdBtn= new JButton("three");
        fourthBtn= new JButton("four");
        fiveBtn =new JButton("five");

        //프레임에 배치 : 설정한 레이아웃에 맞춤
        this.add(oneBtn, BorderLayout.NORTH);
        this.add(twoBtn, BorderLayout.WEST);
        this.add(thirdBtn, BorderLayout.CENTER);
        this.add(fourthBtn, BorderLayout.EAST);
        this.add(fiveBtn, BorderLayout.SOUTH);

        //각 컴포넌트에 이벤트 연결 처리



        this.setVisible(true);
    }

    public static void main(String[] args) {
        //BoarderLayout 사용 테스트
        new TestComponent2();

    }
}
