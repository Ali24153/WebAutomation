package dataBaseConnection;

public class EmpInfo {

    public String fistName;
    public String lastName;
    private int EmpId;
    private int DepId;private String Ssn;
    private String PhoneNum;
    private String Address;



    public EmpInfo(){

    } public EmpInfo(String fistName, String lastName, int empId, int depId,String ssn, String phoneNum, String address){

        this.Address=address;
        this.EmpId=empId;
        this.DepId=depId;
        this.Ssn=ssn;
        this.PhoneNum=phoneNum;
        this.fistName=fistName;
        this.lastName=lastName;

    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public int getDepId() {
        return DepId;
    }

    public void setDepId(int depId) {
        DepId = depId;
    }

    public String getSsn() {
        return Ssn;
    }

    public void setSsn(String ssn) {
        Ssn = ssn;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
