
/**
 * Write a description of class PersonCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonCreator
{
    private String nameF;
    private String nameL;
    private int age;
    private String sex;
    private int height;
    private double weight;
    private int SSN1;
    private int SSN2;
    private int SSN3;
    private String address;
    private int p1;
    private int p2;
    private int p3;
    private int month;
    private int day;
    private int year;

    public PersonCreator(String nameF, String nameL) {
      this.nameF = nameF;
      this.nameL = nameL;
    }

    //gets users age
    public void setAge(int age) {
      if (age>110) {
        System.out.println("You are either really old or dead and thats acceptable.");
      }
      if (age < 0) {
        System.out.println("Youre a fetus, how am i talking to you?");
      }
      if (0 < age < 110) {
        System.out.println("Okay thanks for the info sucker!");
        this.age = age;
      }
    }

    // get users sex
    public void setSex(String secs) {
      this.sex = secs;
    }

    //get users height in inches
    public void setHeight(int height) {
      if (height > 90) {
        System.out.println("Do you play basket ball?");
      } else if (height < 0) {
        System.out.println("Do you even exist?");
      } else {
        System.out.println("I'm glad you have the mental capacity to answer the question.");
        this.height = height;
      }
    }

    //get Weight
    public void weight(double weight) {
      this.weight = weight;
    }

    //added this to quickly check numbers so dont have to repetitively type
    private int numberCheck(int num) {
      if ( (100<= num) && ( num <= 999)) {
        return num;
      }  else if (num < 100) {
      System.exit(0);
      }
    }

    //get users phone number
    public void phoneNumber(int p1, int p2, int p3) {
      this.p1 = numberCheck(p1);
      this.p2 = numberCheck(p2);
      if ( (1000<= p3) && (p3 <= 9999)) {
        this.p3 = p3;
      }  else if (p3 < 1000) {
      System.exit(0);
      }
    }

    // get address
    public void address(String address) {
      this.address = address;
    }

    // get users SSN
    public void SSN(int F, int S, int T) {
      this.SSN1 = numberCheck(F);

      if ( (10<= this.SSN2) && ( this.SSN2 <= 99)) {
        this.SSN2 = SSN2;
      }  else if (this.SSN2 < 10) {
      System.exit(0);
      }

      if ( (1000<= this.SSN3) && ( this.SSN3<= 9999)) {
        this.SNN3 = SSN3;
      }  else if (num < 1000) {
      System.exit(0);
      }
    }

   // get users DOB
    public void DOB(int month, int day, int year) {
      if ((1 <= month) && ( month <= 12) {
        this.month = month;
      }

      if ((1 <= day) ( day <= 31)) {
        this.day = day;
      }

      if ((month == 2) && (day <= 29)) {
        system.exit(0);
      }

      this.year = year;
    }

    public void Info() {
      System.out.println("Name: " + this.NameF + " " + this.NameL);
      System.out.println("Age: " + this.age);
      System.out.println("Sex: " + this.sex);
      System.out.println("Height: " + this.height + " inches");
      System.out.println("Weight " + this.weight);
      System.out.println("Phone Number " + this.p1 + "-" +this.p2 + "-" + this.p3);
      System.out.println("SSN: " + this.SSN1 + "-" + this.SSN2 + "-" + this.SSN3);
      System.out.println("DOB " + this.month + "/" + this.day + "/" + this.year);
    }
}
