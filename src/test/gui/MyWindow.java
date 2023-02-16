package test.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame implements ActionListener {
    private JButton okBtn;
    private JButton removeBtn;
    public MyWindow()  {
        super("GUI 테스트 3");
        //윈도우 창의 위치와 크기 한번에 지정
        this.setBounds(new Rectangle(0,0,500,350));
        //윈도우 창닫기 버튼 클릭시 설정 : 프로그램도 같이 종료
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //윈도우 창 크기 조정 설정
        this.setResizable(false);

        //컴포넌트 배치 방식 지정
        this.setLayout(new FlowLayout());
        //프레임은 기본 배치방식이 BoardLayout임

        //컴포넌트 객체 생성함
        okBtn = new JButton("ok");
        removeBtn = new JButton("ok 버튼 제거");

        //컴포넌트를 프레임(컨테이너에 해당됨)에 추가함
        this.add(okBtn);
        this.add(removeBtn);

        //컴포넌트에 이벤트 연결 처리
        okBtn.addActionListener(this);  //상속받아서
        removeBtn.addActionListener(this);



        //맨 마지막에 보이게 설정함
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //연결된 컴포넌트가 클릭 되었을 때의 처리 내용 구현
        //매개변수 ActionEvent e가 이벤트 발생한 객체를 받음

        //클릭한 버튼에 기록된 글자가 "ok" 문자열이냐?
        if(e.getActionCommand().equals("ok")) {
            JOptionPane.showConfirmDialog(this, "버튼을 클릭했습니다");
        }

        //클릭 이벤트가 발생한 객체가 removeBtn 이냐 ?
        if(e.getSource() == removeBtn) {
            //컴포넌트 제거
            this.remove(okBtn);
            this.repaint();
        }
    }
}
