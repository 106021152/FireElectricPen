package go;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hard extends JFrame {
    private JMenuBar jmb = new JMenuBar();
    private JMenu jmusystem = new JMenu("System");
    private JMenu jmuabout = new JMenu("About");
    private JMenuItem jmiback = new JMenuItem("Back");
    private JMenuItem jmiexit = new JMenuItem("Exit");
    private JMenuItem jmiabout = new JMenuItem("關於作者");
    private Final frame;
    private JButton jbtnpause = new JButton("");
    private ImageIcon img4 = new ImageIcon("pause.png");
    private ImageIcon img5 = new ImageIcon("start2.png");
    private Sprite stick = new Sprite();
    private Sprite boom  = new Sprite();
    private Sprite wall1 = new Sprite();
    private Sprite wall2 = new Sprite();
    private Sprite wall3 = new Sprite();
    private Sprite wall4 = new Sprite();
    private Sprite wall5 = new Sprite();
    private Sprite wall6 = new Sprite();
    private Sprite wall7 = new Sprite();
    private Sprite wall8 = new Sprite();
    private Sprite wall9 = new Sprite();
    private Sprite wall10 = new Sprite();
    private Sprite wall11 = new Sprite();
    private Sprite wall12 = new Sprite();
    private Sprite wall13 = new Sprite();
    private Sprite wall14 = new Sprite();
    private Sprite wall15 = new Sprite();
    private Sprite wall16 = new Sprite();
    private Sprite wall17 = new Sprite();
    private Sprite wall18 = new Sprite();
    private Sprite wall19 = new Sprite();
    private Sprite wall20 = new Sprite();
    private Sprite wall21 = new Sprite();
    private Sprite wall22 = new Sprite();
    private Sprite wall23 = new Sprite();
    private Sprite wall24 = new Sprite();
    private Sprite wall25 = new Sprite();
    private Sprite wall26 = new Sprite();
    private Sprite wall27 = new Sprite();
    private Sprite finish = new Sprite();
    private ImageIcon img1 = new ImageIcon("stick.PNG");
    private ImageIcon img2 = new ImageIcon("boom.png");
    private Container cp;
    private Timer bgTimer;
    private int bg = 1;
    private Finalgo frameeasy;
    public Hard(Finalgo frameeasy){
        this.frameeasy = frameeasy;
        init();
    }

    public void init(){
        this.setLayout(null);
        jmb.add(jmusystem);
        jmb.add(jmuabout);
        jmusystem.add(jmiback);
        jmusystem.add(jmiexit);
        jmuabout.add(jmiabout);
        cp=this.getContentPane();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1000);
        this.setResizable(false);
        this.setTitle("電流急急棒");
        jbtnpause.setBounds(1500,10,80,80);
        jbtnpause.setFont(new Font(null,Font.BOLD,30));
        jbtnpause.setContentAreaFilled(false);
        jbtnpause.setBorderPainted(false);
        jbtnpause.setForeground(Color.RED);
        this.add(jbtnpause);
        jbtnpause.setIcon(img4);
        stick.setPosition(0, 20, 80, 48);
        stick.customRange(40, 14, 5, 16);    //****
        stick.setIcon(img1);

        boom.setPosition(0,0,80,48);
        stick.customRange(40,14,5,16);
        wall1.setPosition(0, 0, 1400, 15);
        wall1.setBackground(Color.RED);
        wall1.setOpaque(true);

        wall2.setPosition(0, 65, 110, 15);
        wall2.setBackground(Color.ORANGE);
        wall2.setOpaque(true);

        wall3.setPosition(175, 5, 15, 185);
        wall3.setBackground(Color.YELLOW);
        wall3.setOpaque(true);

        wall4.setPosition(95, 65, 15, 75);
        wall4.setBackground(Color.GREEN);
        wall4.setOpaque(true);

        wall5.setPosition(0, 125, 130, 15);
        wall5.setBackground(Color.BLUE);
        wall5.setOpaque(true);

        wall6.setPosition(85, 175, 105, 15);
        wall6.setBackground(Color.CYAN);
        wall6.setOpaque(true);

        wall7.setPosition(0, 140, 15, 100);
        wall7.setBackground(Color.MAGENTA);
        wall7.setOpaque(true);

        wall8.setPosition(0, 225, 230, 15);
        wall8.setBackground(Color.BLACK);
        wall8.setOpaque(true);

        wall9.setPosition(230, 50, 15, 190);
        wall9.setBackground(Color.RED);
        wall9.setOpaque(true);

        wall10.setPosition(230, 50, 100, 15);
        wall10.setBackground(Color.ORANGE);
        wall10.setOpaque(true);

        wall11.setPosition(330, 50, 15, 90);
        wall11.setBackground(Color.YELLOW);
        wall11.setOpaque(true);

        wall12.setPosition(335, 125, 140, 15);
        wall12.setBackground(Color.GREEN);
        wall12.setOpaque(true);

        wall13.setPosition(395, 0, 15, 90);
        wall13.setBackground(Color.BLUE);
        wall13.setOpaque(true);

        wall14.setPosition(460, 45, 15, 85);
        wall14.setBackground(Color.CYAN);
        wall14.setOpaque(true);

        wall15.setPosition(460, 45, 125, 15);
        wall15.setBackground(Color.MAGENTA);
        wall15.setOpaque(true);

        wall16.setPosition(570, 50, 15, 190);
        wall16.setBackground(Color.BLACK);
        wall16.setOpaque(true);

        wall17.setPosition(640, 15, 15, 175);
        wall17.setBackground(Color.RED);
        wall17.setOpaque(true);

        wall18.setPosition(645, 175, 60, 15);
        wall18.setBackground(Color.ORANGE);
        wall18.setOpaque(true);

        wall19.setPosition(570, 225, 190, 15);
        wall19.setBackground(Color.YELLOW);
        wall19.setOpaque(true);

        wall20.setPosition(690, 15, 15, 175);
        wall20.setBackground(Color.GREEN);
        wall20.setOpaque(true);

        finish.setPosition(1550,610,40,100);
        finish.setBackground(Color.RED);
        finish.setOpaque(true);

        this.add(stick);
        this.add(wall1);
        this.add(wall2);
        this.add(wall3);
        this.add(wall4);
        this.add(wall5);
        this.add(wall6);
        this.add(wall7);
        this.add(wall8);
        this.add(wall9);
        this.add(wall10);
        this.add(wall11);
        this.add(wall12);
        this.add(wall13);
        this.add(wall14);
        this.add(wall15);
        this.add(wall16);
        this.add(wall17);
        this.add(wall18);
        this.add(wall19);
        this.add(wall20);
        this.add(wall21);
        this.add(wall22);
        this.add(wall23);
        this.add(wall24);
        this.add(wall25);
        this.add(wall26);
        this.add(wall27);
        this.add(finish);
//        bgTimer = new Timer(200, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (bg == 1){
////                    jlb.setIcon(imageIcon[0]);
//                    cp.setBackground(Color.gray);
//                    bg = 2;
//                }else if (bg == 2){
////                    jlb.setIcon(imageIcon[1]);
//                    cp.setBackground(Color.white);
//                    bg = 1;
//                }
//            }
//        });
//        bgTimer.start(); //在timer以下

        stick.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                stick.changePosition(stick.getX() + e.getX() - stick.getWidth()/2, stick.getY() + e.getY() - stick.getHeight()/2);

            }
        });
        jbtnpause.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmpbtn = (JButton) e.getSource();
                if (tmpbtn.getIcon().equals(img5)) {          //tmpbtn.getText().equals("turn on")
                    bgTimer.start();
                    tmpbtn.setIcon(img4);
                } else {
                    bgTimer.stop();
                    tmpbtn.setIcon(img5);
                }
            }
        });
        stick.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
//                System.out.println("x1: " + stick.xStart);
//                System.out.println("x2: " + stick.xEnd);
//                System.out.println("y1: " + stick.yStart);
//                System.out.println("y2: " + stick.yEnd);

                stick.changePosition(stick.getX() + e.getX() - stick.getWidth()/2, stick.getY() + e.getY() - stick.getHeight()/2);

                if (!e.isControlDown()) {           //外掛

                    if (stick.overlapCheck(wall1) || stick.overlapCheck(wall2) || stick.overlapCheck(wall3) || stick.overlapCheck(wall4) || stick.overlapCheck(wall5) || stick.overlapCheck(wall6) || stick.overlapCheck(wall7) || stick.overlapCheck(wall8) || stick.overlapCheck(wall9) || stick.overlapCheck(wall10)||stick.overlapCheck(wall11)||stick.overlapCheck(wall12)||stick.overlapCheck(wall13)||stick.overlapCheck(wall14)||stick.overlapCheck(wall15)
                            ||stick.overlapCheck(wall16)||stick.overlapCheck(wall17)||stick.overlapCheck(wall18)||stick.overlapCheck(wall19)||stick.overlapCheck(wall20)||stick.overlapCheck(wall21)||stick.overlapCheck(wall22)||stick.overlapCheck(wall23)||stick.overlapCheck(wall24)||stick.overlapCheck(wall25)||stick.overlapCheck(wall26)||stick.overlapCheck(wall27)) {
                        stick.setIcon(img2);
                        JOptionPane.showMessageDialog(Hard.this, "豬喔碰到了啦");
                        stick.setIcon(img1);
                        stick.setPosition(0, 20, 80, 48);
                    } else if (stick.overlapCheck(finish)) {
                        JOptionPane.showMessageDialog(Hard.this, "過關唷");
                        frameeasy.setVisible(true);
                        Hard.this.setVisible(false);

                    }

                }
            }
        });


        jmiabout.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"子堯&健伊製作");
            }
        });

    }
}
