package programe;

public class College extends University {
    String KYears ;
    String NumOfDepartments ;
    String LessDegree ;

    College(){

    }

    public void setKName(String KName) {
        this.UName = KName;
    }

    public void setKAddress(String KAddress) {
        this.UAddress = KAddress;
    }

    public void setKYears(String KYears) {
        this.KYears = KYears;
    }

    public void setLessDegree(String lessDegree) {
        LessDegree = lessDegree;
    }

    public void setNumOfDepartments(String numOfDepartments) {
        NumOfDepartments = numOfDepartments;
    }

    public String getKName() {
        return UName;
    }

    public String getKAddress() {
        return UAddress;
    }

    public String getKYears() {
        return KYears;
    }

    public String getLessDegree() {
        return LessDegree;
    }

    public String getNumOfDepartments() {
        return NumOfDepartments;
    }
}
