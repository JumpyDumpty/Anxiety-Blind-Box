package Anxiety.packagex;

public class StressFactory {
    public Anxiety getAnxiety(int type){
        if(type == 1) return new Academic();
        if(type == 2) return new Skills();
        if(type == 3) return new JobApply();
        if(type == 4) return new Social();
        if(type == 5) return new Romance();
        if(type == 6) return new Future();
        if(type == 7) return new Appearance();
        if(type == 8) return new Body();
        if(type == 9) return new Money();
        if(type == 10) return new Sex();
        return null;
    }
}
