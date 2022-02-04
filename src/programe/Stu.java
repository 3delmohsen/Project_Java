package programe;

public class Stu extends College {
    private  String SID ;
    private String SYears ;
    private String SEmail ;
    private String College ;
    private String SDepartment ;
    private String Degree ;

    Stu(){

    }

    public void setSName(String SName) {
        this.UName = SName;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public void setSYears(String SYears) {
        this.SYears = SYears;
    }

    public void setSEmail(String SEmail) {
        this.SEmail = SEmail;
    }


    public void setCollege(String college) {
        College = college;
    }

    public void setSDepartment(String SDepartment) {
        this.SDepartment = SDepartment;
    }

    public void setSAddress(String SAddress) {
        this.UAddress = SAddress;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public String getSID() {
        return SID;
    }

    public String getSName() {
        return UName;
    }

    public String getCollege() {
        return College;
    }

    public String getSEmail() {
        return SEmail;
    }

    public String getSAddress() {
        return UAddress;
    }

    public String getDegree() {
        return Degree;
    }

    public String getSDepartment() {
        return SDepartment;
    }

    public String getSYears() {
        return SYears;
    }
}

