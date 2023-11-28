

import java.time.LocalDate;
public class MRI extends Medical_investigation {
    private String URL;
    private int MFS;//Magnetic field strength in Tesla
    public MRI(Patient pat, LocalDate ld, String URL, int MFS){
        super(pat,ld);
        this.URL=URL;
        this.MFS=MFS;
    }
    public String adminDisplay(){
        return "Patient: "+getPat().getName()+"MRI: "+MFS+" Tesla, "+getDate()+"; ";
    }
    public String getURL(){
        return URL;
    }
}
