import java.time.LocalDate;
public class BP extends Medical_investigation {
    private int SP;//systolic pressure
    private int DP;//diastolic pressure
    private String term;

    public BP(Patient pat, LocalDate ld, int SP, int DP, String term){
        super(pat,ld);
        this.SP=SP;
        this.DP=DP;
        this.term=term;
    }

    public String adminDisplay(){
        return "BP: "+term+", "+getDate();
    }

    public int getSP(){
        return SP;
    }
    public int getDP(){
        return DP;
    }
}