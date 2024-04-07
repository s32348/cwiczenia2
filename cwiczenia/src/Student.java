public class Student {
    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public double[] grades;


    public double getSrednia(){
        double srednia=0;
        for (int i=0;i<grades.length;i++){
            srednia+=grades[i];
        }
        srednia/=grades.length;
        if(srednia<2.24){
            srednia=2;
        }
            else if{srednia<2.74){
        srednia=2.5;
        }
        }
        return srednia;

    }
}