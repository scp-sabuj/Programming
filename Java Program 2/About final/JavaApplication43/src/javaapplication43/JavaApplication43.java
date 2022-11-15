package javaapplication43;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaApplication43 extends JFrame{

    static  void s()
    {
        System.out.println("jsfkgs");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("sssssssss");
        s();
        C obj=new C();
        obj.s();
        JLabel j;
        JFrame in=new JFrame();
        in.setVisible(true);
        in.setSize(400, 300);
        in.setExtendedState(123);
        in.setLayout(null);
        

    }

   
}
 class C extends JavaApplication43{
        static void s()
        {
            System.out.println("rrrrrrrr");
        }
 }