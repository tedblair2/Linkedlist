import java.awt.*;

public class Element {
    private int x;
    private int y;
    private int width;
    private int height;
    private String text;
    private Color color;

    private int xStart;
    private int yStart;


    public Element(int x, int y, int width, int height, String text){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;

    }

    public void setColor(Color color){
        this.color = color;
    }
    public String gettext(){
        return this.text;
    }
    public int getX(){
        return this.x;
    }
    Font font = new Font ("Times New Roman", 1, 17);




    public void draw(Graphics g){

        g.setFont(font);
        FontMetrics metrics = g.getFontMetrics(font);



        g.setColor(Color.GREEN);

        g.fillOval(x, y, width, height);
        int xStart = x + (width - metrics.stringWidth(text)) / 2;
        int yStart = y + ((height - metrics.getHeight()) / 2) + metrics.getAscent();

        g.setColor(Color.WHITE);

        g.drawString(text, xStart, yStart);


    }

}


