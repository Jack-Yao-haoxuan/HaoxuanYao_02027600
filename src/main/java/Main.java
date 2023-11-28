
import java.time.LocalDate;
public class Main {

    public static void main(String[] args){


        //First patient data input
        Patient pat1=new Patient("Daphne Von Oram","https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg",62);
        LocalDate ld1=LocalDate.of(2023,9,14);
        MRI MRI1=new MRI(pat1,ld1,"https://martinh.netfirms.com/BIOE60010/mri1.jpg",2);
        LocalDate ld2=LocalDate.of(2023,9,15);
        BP BP1=new BP(pat1,ld2,130,70,"ST");

        //Second Patient data input
        Patient pat2=new Patient("Sebastian Compton","https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg",31);
        LocalDate ld3=LocalDate.of(2023,11,19);
        MRI MRI2=new MRI(pat2,ld3,"https://martinh.netfirms.com/BIOE60010/mri2.jpg",4);
        LocalDate ld4=LocalDate.of(2023,11,20);
        BP BP2=new BP(pat2,ld4,150,80,"VST");


        //patient 1's details and examination outputs for doctor
        DoctorDisplay DisplayForDoctor1=new DoctorDisplay(MRI1,BP1);
        DisplayForDoctor1.Display();

        //patient 2's details and examination outputs for doctor
        DoctorDisplay DisplayForDoctor2=new DoctorDisplay(MRI2,BP2);
        DisplayForDoctor2.Display();


        //Dates and details of each examination on the console
        System.out.println(MRI1.adminDisplay()+BP1.adminDisplay());
        System.out.println(MRI2.adminDisplay()+BP2.adminDisplay());

    }
}
