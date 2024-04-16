public class StudentGroup {
    public String groupname;
    public Student[] grupa=new Student[15];
    int rozmiarGrupy=0;

    public void dodajStudenta(Student student){
        if(rozmiarGrupy>=grupa.length){
            System.out.println("Grupa jest juz pełna.");
            return;
        }
        for(int i=0;i<rozmiarGrupy;i++){
            if(grupa[i].equals(student)){
                    System.out.println("Student nalezy juz do grupy.");
                    return;
            }
        }
        grupa[rozmiarGrupy++]=student;
    }
}

