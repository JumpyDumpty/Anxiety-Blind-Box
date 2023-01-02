import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Anxiety.packagex.*;
import java.lang.Math;
public class ButtonListener implements ActionListener{
    private int choice;
    private BlindBox b;
    private int max = 10;
    private int min = 1;
    private int range = max - min + 1;
    public ButtonListener(BlindBox box){this.b = box;}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(b.getSanity() > 0){
            b.setSanity(10);
            choice = (int)(Math.random() * range) + min;
            select(choice);
        }else{
            b.setSanity(0);
        }

    }
    private void select(int c){
        StressFactory factory = new StressFactory();
        Anxiety a = factory.getAnxiety(c);
        b.DisplayAnxiety(a.getName(), a.getString());
        b.SetSans();
    }
}
