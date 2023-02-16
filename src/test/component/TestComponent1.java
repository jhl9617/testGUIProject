package test.component;

import javax.swing.*;
import java.awt.*;

public class TestComponent1 extends JFrame {

    //field
    private JList list;
    private JRadioButton genderM, genderF;
    private JTextField nameTF;
    private JSpinner ageSpin;


    public TestComponent1() throws HeadlessException {
        super("컴포넌트 연습 1");
        setBounds(100, 100, 500, 400);
        setLayout(new GridLayout(2,2,5,5));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        list = new JList();
        genderM = new JRadioButton("남자");
        genderF = new JRadioButton("여자");
        ButtonGroup gender = new ButtonGroup();
        gender.add(genderF);
        gender.add(genderM);

        nameTF = new JTextField(30);    //가로 크기 20글자
        Integer value = Integer.valueOf(25);
        Integer min = Integer.valueOf(1);
        Integer max = Integer.valueOf(80);
        Integer step = Integer.valueOf(1);
        SpinnerNumberModel model = new SpinnerNumberModel(value,min, max,step);

        ageSpin = new JSpinner(model);

        add(nameTF);
        add(ageSpin);
        add(list);
        //컨테이너에 컨테이너를 배치할 수 있음
        //컨테이너에 컴포넌트가 배치됨
        //레이아웃으로 나누어진 구역에는 기본 1개의 컴포넌트만 배치 가능
        //한 구역에 여러개 컴포넌트 배치가 필요하면
        //해당 구엽에 컨테이너를 배치하고, 컨테이너에 컴포넌트 배치
        //컨테이터 : 컨포넌트의 후손임
        //  컴포넌트를 배치할 수 있는 컴포넌트임
        JPanel genderPan = new JPanel();
        //JPanel 은 기본 레이아웃이 FlowLayout 임.
        genderPan.add(genderM);
        genderPan.add(genderF);
        add(genderPan); //프레임 구역에 추가

        setVisible(true);
    }

    public static void main(String[] args) {
        //gui 컴포넌트 사용 테스트
        new TestComponent1();

    }
}
