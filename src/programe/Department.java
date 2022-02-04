package programe;

public class Department extends College{
    String NumOfCourses  ;
    String HeadMaster ;

    Department(){

    }
    public void setDName(String DName) {
        this.UName = DName;
    }

    public void setNumOfCourses(String numOfCourses) {
        NumOfCourses = numOfCourses;
    }

    public void setHeadMaster(String headMaster) {
        HeadMaster = headMaster;
    }

    public String getDName() {
        return UName;
    }

    public String getNumOfCourses() {
        return NumOfCourses;
    }

    public String getHeadMaster() {
        return HeadMaster;
    }
}
