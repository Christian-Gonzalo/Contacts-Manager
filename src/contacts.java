public class contacts {
    private String name;
    private String phoneNum;

    public contacts(String aName, String aPhoneNum){
        this.name = aName;
        this.phoneNum = aPhoneNum;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
