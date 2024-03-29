public class UndergraduateStudent extends Student{
    public String minor;

    public UndergraduateStudent(int no, String name, int year, int dob, String major, int financialAid) {
        super(no, name, year, dob, major, financialAid);
        this.minor = minor;
    }

    @Override
    public void study(){
        System.out.println("Student is studying...");
    }

    @Override
    public void register(){
        System.out.println("Student registered...");
    }

    @Override
    public String toString(){
        return (name + " " + no);
    }
}
