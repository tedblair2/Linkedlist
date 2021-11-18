import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class Linkedlist implements ActionListener {

    Deque<Element> queue=new LinkedList<Element>();

    JButton insertfirst;
    JButton insertlast;
    JButton removefirst;
    JButton removelast;
    JButton isempty;
    JButton size;
    JButton first;
    JButton last;
    JLabel display;


    public Linkedlist(){
        insertfirst = new JButton("AddFirst(e)");
        insertfirst.setFocusable(false);
        insertfirst.addActionListener(this);

        insertlast = new JButton("AddLast(e)");
        insertlast.setFocusable(false);
        insertlast.addActionListener(this);

        removefirst = new JButton("removeFirst()");
        removefirst.setFocusable(false);
        removefirst.addActionListener(this);

        removelast = new JButton("removeLast()");
        removelast.setFocusable(false);
        removelast.addActionListener(this);

        isempty = new JButton("isEmpty()");
        isempty.setFocusable(false);
        isempty.addActionListener(this);

        size = new JButton("size()");
        size.setFocusable(false);
        size.addActionListener(this);

        first = new JButton("first()");
        first.setFocusable(false);
        first.addActionListener(this);


        last = new JButton("last()");
        last.setFocusable(false);
        last.addActionListener(this);


        display = new JLabel();
        display.setFont(new Font("Arial", Font.BOLD,20));
    }
    public void setList(Deque<Element> queue){

        this.queue = queue;

    }
    public Deque<Element> getList(){

        System.out.println(queue);

        return this.queue;
    }


    public Deque<Element> insertfirst(){
        String item=JOptionPane.showInputDialog(null,"Enter customer number");
        if (queue.size()==8)
            JOptionPane.showMessageDialog(null,"Queue Full");
        else if (queue.size() ==0){
            queue.addFirst(new Element(300,150, 50,50,item));

        }
        else
            queue.addFirst(new Element(queue.peekFirst().getX()-60,150, 50,50,item));

        Linkedlist buttons = new Linkedlist();
        buttons.setList(queue);

        return queue;

    }
    public Deque<Element> insertlast(){
        String item=JOptionPane.showInputDialog(null,"Enter customer number");
        if (queue.size()==8)
            JOptionPane.showMessageDialog(null,"Queue Full");
        else if (queue.size() ==0){
            queue.addLast(new Element(300,150,50,50,item));
        }
        else
            queue.addLast(new Element(queue.peekLast().getX()+60,150, 50,50,item));

        Linkedlist buttons = new Linkedlist();
        buttons.setList(queue);


        return queue;
    }
    public Deque<Element> removefirst(){
        if (!queue.isEmpty())
            queue.removeFirst();

        Linkedlist buttons = new Linkedlist();
        buttons.setList(queue);

        return queue;

    }
    public Deque<Element> removelast(){
        if (!queue.isEmpty())

            queue.removeLast();


        Linkedlist buttons = new Linkedlist();
        buttons.setList(queue);


        return queue;

    }

    public String first(){
        if (queue.isEmpty()) return null;
        return queue.peekFirst().gettext();

    }
    public String last(){
        if (queue.isEmpty()) return null;
        return queue.peekLast().gettext();

    }

    public boolean isempty(){
        if(queue.isEmpty()){
            return true;
        }
        return false;
    }

    public int size(){
        int size = queue.size();
        return size;
    }

    public void actionPerformed(ActionEvent actionEvent){
        LinkedList buttons = new LinkedList();
        if (actionEvent.getSource() == insertfirst) {

            insertfirst();

        } else if (actionEvent.getSource() == insertlast) {

            insertlast();

        } else if (actionEvent.getSource() == removefirst) {
            if (queue.isEmpty()) {
                JOptionPane.showMessageDialog(null, "The queue is empty.");
            } else {
                removefirst();
            }

        }else if (actionEvent.getSource() == removelast) {
                if (queue.isEmpty())
                    JOptionPane.showMessageDialog(null, "The queue is empty.");
                else {
                    removelast();
                }

            } else if (actionEvent.getSource() == last) {
            if (queue.isEmpty()) {
                JOptionPane.showMessageDialog(null, "The queue is empty.");
            } else {
                JOptionPane.showMessageDialog(null, "The last customer is  : " + last());
            }


            } else if (actionEvent.getSource() == first) {
            if (queue.isEmpty()) {
                JOptionPane.showMessageDialog(null, "The queue is empty.");
            } else {
                JOptionPane.showMessageDialog(null, "The first customer is  : " + first());
            }


            } else if (actionEvent.getSource() == isempty) {

                if (isempty()) {
                    JOptionPane.showMessageDialog(null, "True");
                } else {
                    JOptionPane.showMessageDialog(null, "False");
                }

            } else if (actionEvent.getSource() == size) {
            if (queue.isEmpty()) {
                JOptionPane.showMessageDialog(null, "The queue is empty.");
            } else {
                JOptionPane.showMessageDialog(null, "Size of the queue : " + size() + "");
            }

            } else { //do nothing

            }

        }
    }




