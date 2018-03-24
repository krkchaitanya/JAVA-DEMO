package org.chaitanya.studentGetSet;

public class studentInfoTable {
    private int stuid;
    private String schoolname;
    private int schoolzip;
    private int fkid;

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public int getSchoolzip() {
        return schoolzip;
    }

    public void setSchoolzip(int schoolzip) {
        this.schoolzip = schoolzip;
    }

    public int getFkid() {
        return fkid;
    }

    public void setFkid(int fkid) {
        this.fkid = fkid;
    }
}
