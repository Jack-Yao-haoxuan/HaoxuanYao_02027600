
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;
public class DoctorDisplay {
    static GraphicsConfiguration gc;
    private MRI mri;
    private BP bp;
    public DoctorDisplay(MRI mri,BP bp){
        this.mri=mri;
        this.bp=bp;

    }

    public void Display(){

        //create a new frame and set its size
        JFrame frame= new JFrame(gc);
        frame.setSize(900,300);
        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        JPanel mainPanel=new JPanel();

        //create the image of patient
        JLabel labelimage1 = new JLabel();
        URL imageURL1=null;
        try {
            imageURL1 = new URL(mri.getPat().getURL());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL1);
        labelimage1.setIcon(thisImageIcon);

        //name and age of Patient
        JLabel labeltext1=new JLabel("<html>Name: "+mri.getPat().getName()+"<br>Age: "+mri.getPat().getAge()+"</html>");


        //create the image of Investigation.MRI brain
        JLabel labelimage2 = new JLabel();
        URL imageURL2=null;
        try {
            imageURL2 = new URL(mri.getURL());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon2 = new ImageIcon(imageURL2);
        labelimage2.setIcon(thisImageIcon2);

        //BP data of patient
        JLabel labeltext2=new JLabel("<html>Blood pressure: <br> "+bp.getSP()+" over "+bp.getDP()+"</html>");


        //add to the frame
        frame.getContentPane().add(mainPanel);

        mainPanel.setLayout(new GridLayout(1,4));
        //means 1 row and 4 column
        mainPanel.add(labelimage1);
        mainPanel.add(labeltext1);
        mainPanel.add(labelimage2);
        mainPanel.add(labeltext2);
        frame.setVisible(true);


    }
}
