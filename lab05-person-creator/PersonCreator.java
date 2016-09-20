 
/**
 * Write a description of class PersonCreator here.
 *
 * @author (Roy Midence)
 * @version (Millionth version)
 */
public class PersonCreator
{
    //instance variables

    private String nameF;// first name
    private String nameL;// last name
    private int age;// age
    private String sex;//sex
    private int height;//height in inches
    private double weight;// weight in pounds
    private int SSN1;// first 3 digits in social security
    private int SSN2;//second 2 digits in social security
    private int SSN3;// last 4 digits in social security
    private String address;// address
    private int p1;// first 3 numbers in phone number
    private int p2;// second set of numbers
    private int p3;// last 4 numbers in phone number
    private int month;// month born
    private int day;// day born
    private int year;//  year born

    
    /*
     * Constructs an object using the first and last name
     * 2 strings, first name and last name
     * outputs nothing just a constructor
     * personCreator("Roy", "Midence");
     */
    public PersonCreator(String nameF, String nameL) {
      this.nameF = nameF;
      this.nameL = nameL;
    }

     /*
     * Gets users age
     * takes in 1 int, which is users age
     * outputs nothing jus takes in age and sets instance varibale
     * setAge(18); sets age to 18
     */
    public void setAge(int age) {
      if (age>110) {
        System.out.println("You are either really old or dead and thats acceptable.");
      }
      if (age < 0) {
        System.out.println("You're a fetus, how am i talking to you?");
      }
      if ((0 < age) || ( age < 110)) {
        System.out.println("Okay thanks for the info sucker!");
        this.age = age;
      }
    }

     /*
     * gets users perfered sex
     * takes in a string 
     * outputs nothing just set instance varibale
     * setSex("Shrek"); will set sex as Shrek
     */
    public void setSex(String secs) {
      this.sex = secs;
    }

    /*
     * gets users height
     * takes in an int 
     * outputs nothing just set instance varibale
     * setHeight(72); will set height as 72 inches
     */
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

    /*
     * gets users weight
     * takes in a double
     * outputs nothing just set instance varibale
     * weight(420.69); will set weight to 420.69
     */
    public void setWeight(double weight) {
      this.weight = weight;
    }

    /*
     * actually just checks to see if the correct numbers have been used
     * takes in an int 
     * outputs the int thats been inputed if it fits the rules
     * numberCheck(69); outputs 69
     */
    private int numberCheck(int num) {
      if ( (100<= num) || ( num <= 999)) {
        return num;
      }  else if (num < 100) {
      System.exit(0);
      }
      return num = 0;
    }

    /*
     * gets users phone number
     * takes in 3 ints for diffrent parts of phone number
     * outputs nothing just set instance varibales
     * PhoneNumber(631, 488, 7264); will set phone number as 631-488-7264
     */
    public void setPhoneNumber(int p1, int p2, int p3) {
      this.p1 = numberCheck(p1);
      this.p2 = numberCheck(p2);
      if ( (1000<= p3) || (p3 <= 9999)) {
        this.p3 = p3;
      }  else if (p3 < 1000) {
      System.exit(0);
      }
    }

    /*
     * gets users adress
     * takes in a string 
     * outputs nothing just set instance varibale
     * address("Meme street") will set adress as Meme street
     */
    public void setAddress(String address) {
      this.address = address;
    }

    /*
     * gets users Social Security Number
     * takes in 3 ints for diffrent parts of SSN
     * outputs nothing just set instance varibales
     * SSN(631, 22, 7264) will set SSN as 631-22-7264
     */
    public void setSSN(int F, int S, int T) {
      this.SSN1 = numberCheck(F);

      if ( (10<= S) || ( S <= 99)) {
        this.SSN2 = S;
      }  else if ((S < 10) || (S > 99)) {
      System.exit(0);
      }

      if ( (1000<= T) || ( T<= 9999)) {
        this.SSN3 = T;
      }  else if ((T < 1000) || (T > 9999 )) {
      System.exit(0);
      }
    }

   /*
     * gets users date of birth
     * takes in 3 ints for diffrent parts of date of birth
     * outputs nothing just set instance varibales
     * DOB(5, 27, 1998); will set all variables for birth.
     */
    public void setDOB(int month, int day, int year) {
      if ((1 <= month) || ( month <= 12)) {
        this.month = month;
      }
    

      if ((1 <= day) || ( day <= 31)) {
        this.day = day;
      }

      if ((month == 2) && (day <= 29)) {
        System.exit(0);
      }

      this.year = year;
    }

    /*
     * just prints out everything
     * takes in nothing, just prints
     * outputs everything thats been given
     * print(); will print out all of this .
     */
    public void print() {
      System.out.println("Name: " + this.nameF + " " + this.nameL);
      System.out.println("Age: " + this.age);
      System.out.println("Sex: " + this.sex);
      System.out.println("Height: " + this.height + " inches");
      System.out.println("Weight " + this.weight);
      System.out.println("Phone Number " + this.p1 + "-" +this.p2 + "-" + this.p3);
      System.out.println("SSN: " + this.SSN1 + "-" + this.SSN2 + "-" + this.SSN3);
      System.out.println("DOB " + this.month + "/" + this.day + "/" + this.year);
    }
}
