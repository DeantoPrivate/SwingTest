package code;

import javax.swing.*;

/**
 * Created by deanto on 27.12.13.
 */
public class threeWindows {
    public static void Show()
    {

        JFrame frame1,frame2,frame3;
        frame1 = new JFrame("frame1");
        frame2 = new JFrame("frame2");
        frame3 = new JFrame("frame3");

        frame1.setBounds(100,100,500,100);

        frame1.setVisible(true);
        frame2.setVisible(true);
        frame3.setVisible(true);

    }
}
