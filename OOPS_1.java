

public class OOPS_1 {
    public static void main(String args[]){
        Pen p1=new Pen(); // ceated a pen object p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        //p1.setColor("yellow");
        p1.setColor("Red");
        System.out.println(p1.getColor());
        BankAccount myAccount=new BankAccount();
        myAccount.username="Rohan Jain";
      myAccount.setPassword("yjgdgf");
      Student s1= new Student();
      //System.out.println(s1.name);
      s1.name="shanu";
      s1.rollnumber=1453;
      s1.password="rut";
      //copy constructor
      Student s2=new Student(s1);
      s2.password="abc";
    

        
    }
    
}


class Pen{
    // function and Properties
    private String color;
    private int tip;
    String getColor(){
        return this.color;// this on java current object or reference 
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color=newColor;

    }

    void setTip(int newTip){
        this.tip=newTip;
    }


}
/*class Student{
    String name;
    int age;
    float percentage;

    void calPercentage(int chem,int phy,int math){
         percentage=(chem+phy+math)/3;


    }
}*/
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}

class Student{
    int rollnumber;
    String name;
    String password;
    // constructor
    Student(){
        //this.name=name;
        System.out.println("Constructor is called us ....");
    }
    // copy constructor
    Student(Student s1){
        this.name=s1.name;
        this.rollnumber=s1.rollnumber;
    }


}



