public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.fname = "Jacek";
        st.lname = "Programistaobiektowy";
        st.indexNumber = 32348;
        st.email = "goryl@szympans.pl";
        st.address = "Bogdaniec 1/2";
        st.grades = new double[]{4, 3, 2,5,5};

        double sr= st.getSrednia();
    }
    
}
