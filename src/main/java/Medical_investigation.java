import java.time.LocalDate;
public abstract class Medical_investigation {
    private LocalDate ld;
    private Patient pat;

    //constructor to input the patient object and date
    public Medical_investigation(Patient pat, LocalDate ld){
    this.pat=pat;
    this.ld=ld;
    }

    public LocalDate getDate(){
        return  ld;
    }
    public Patient getPat(){
        return pat;
    }
}
