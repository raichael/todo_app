import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class BackgroundImageJFrame extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4;
    JLabel l1;

    public BackgroundImageJFrame()
    {
        setTitle("TODO Application");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("D:\\bbb.jpg")));
        setLayout(new FlowLayout());

        b1=new JButton("Add Event");
        b2=new JButton("View Event");
        b3=new JButton("Important Event");
        b4=new JButton("Personal Event");
        b1.setBounds(50,50,100,30);
        b1.addActionListener(this);
        b1.setActionCommand("open");

        add(b1);

        add(b2);
        add(b3);
        add(b4);
        setSize(399,399);
        setSize(400,400);
    }

    public static void main(String args[])
    {
        new BackgroundImageJFrame();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BackgroundImageJFrame().setVisible(true);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        Picker picker =new Picker();
        String cmd = e.getActionCommand();
        if (cmd.equals("open")){
            dispose();
            picker.picker();
        }
    }
}