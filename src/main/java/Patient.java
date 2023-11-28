public class Patient {
    private String name;
    private String imageURL;
    private int age;

    //constructor to input the name,URL and age
    public Patient(String name,String imageURL,int age){
        this.name=name;
        this.imageURL=imageURL;
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public String getURL(){
        return imageURL;
    }
    public String getName(){
        return name;
    }


}
