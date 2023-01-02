import Anxiety.packagex.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BlindBox extends JFrame{
    private int max = 100;
    private int sanity = max;
    static JFrame f;
    static JButton b;
    static JLabel intro0, intro1, intro2, intro3;
    private JLabel DisplayName;
    private JLabel Describe;
    static JLabel SansRemaining;
    static JLabel Insane;
    public static void main(String[] args) {
        Runnable r = () -> new BlindBox();
        SwingUtilities.invokeLater(r);
    }
    BlindBox(){
        f = new JFrame("Anxiety Blind box");
        b = new JButton("Purchase");
        intro0 = new JLabel("Welcome to buy blind boxes follow me.");
        intro1 = new JLabel("What is damaging your sanity?");
        intro2 = new JLabel("Opening your eyes wide and facing it.");
        intro3 = new JLabel("Stay for the night I will sell you anxiety.");
        DisplayName = new JLabel("");
        Describe = new JLabel("");
        SansRemaining = new JLabel("Rationality: " + max);
        Insane = new JLabel("");
        JPanel p = new JPanel(new BorderLayout());
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        JPanel p1 = new JPanel();
        p1.add(intro0);
        p1.add(intro1);
        p1.add(intro2);
        p1.add(intro3);
        p.add(p1);
        p.add(SansRemaining);
        p.add(b);
        p.add(DisplayName, BorderLayout.WEST);
        p.add(Describe, BorderLayout.WEST);
        p.add(Insane, BorderLayout.SOUTH);
        p.setBackground(Color.white);
        f.add(p);
        f.setSize(750, 400);
        f.setVisible(true);
        ButtonListener newHandler = new ButtonListener(this);
        b.addActionListener(newHandler);
    }
    public void setSanity(int decrease){
        if(getSanity() > 0){
            sanity -= decrease;
        }else{
            setInsane();
        }
    }
    private void setInsane(){
        if(getSanity() == 0){
            resetSanity();
            SetSans();
            Insane.setText("Sanity restored.");
        }else{
            Insane.setText("");
        }
    }
    public int getSanity(){
        return sanity;
    }
    public void resetSanity(){
        sanity = max;
        System.out.println(getSanity());
    }
    public void DisplayAnxiety(String n, String m){
        DisplayName.setText(n);
        Describe.setText(m);
    }
    public void SetSans(){
        SansRemaining.setText("Rationality: " + getSanity());
    }
}
