import javax.swing.*;
import java.awt.*;
import java.util.Deque;

public class Main extends JPanel {
    static Linkedlist buttons = new Linkedlist();
    Deque<Element> queue = buttons.getList();

    public void paintComponent(Graphics g){
        super.paintComponent(g);


        if (queue == null) {
            System.out.println("Null error ");
        } else if (queue.isEmpty()) {
            //do nothing
        } else {
            for (Element p : queue) {
                p.draw(g);
            }
        }

        repaint();
    }

    public static void main(String[] args){

        System.out.println(buttons.getList());

        Main dispenser = new Main();
        dispenser.setBackground(Color.WHITE);
        JFrame app = new JFrame("Queue Implementation");
        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(Color.WHITE);


        btnPanel.setLayout(new GridLayout(5, 3, 80, 20));

        btnPanel.add(buttons.insertfirst);
        btnPanel.add(buttons.insertlast);
        btnPanel.add(buttons.removefirst);
        btnPanel.add(buttons.removelast);
        btnPanel.add(buttons.last);
        btnPanel.add(buttons.first);
        btnPanel.add(buttons.isempty);
        btnPanel.add(buttons.size);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);
        panel1.setLayout(new FlowLayout());


        panel1.add(btnPanel);


        app.setLayout(new BorderLayout());


        app.getContentPane().setBackground(Color.BLUE);
        app.add(dispenser);
        app.add(panel1, BorderLayout.SOUTH);


        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(800, 600);
        app.setVisible(true);

    }

}





