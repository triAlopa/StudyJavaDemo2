package stuDemo9_06XmlDemo.E2;

public class user {
    private String id;
    private String userName;
    private String password;
    private String phone;
    private boolean flag;


    public user() {
    }

    public user(String id, String userName, String password, String phone, boolean flag) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.flag = flag;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return flag
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * 设置
     * @param flag
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String toString() {
        return "user{id = " + id + ", userName = " + userName + ", password = " + password + ", phone = " + phone + ", flag = " + flag + "}";
    }
}
