import javax.swing.*;

public class Todo {
    public static void main(String[] args) {

        JButton addbutton = new JButton("Add Event");
        JButton viewbutton = new JButton("view Event");
        addbutton.setSize(30,30);
        viewbutton.setSize(30,30);
        ImageIcon ii = new ImageIcon("C:/todo.jpg");
        JPanel panel = new JPanel();
        panel.add(addbutton);
        panel.add(viewbutton);
        JFrame frame = new JFrame();
//    frame.setBackground(Color);

        frame.setSize(300,300);
        frame.add(panel);
        frame.setVisible(true);
    }
}
