package mybatis.springboot.connection.bean;

import java.util.Date;


public class User {
    /**
     * @ClassName: mybatis.springboot.commection.bean.User
     * @Description: Nothing to Say
     * @Datetime: 2018-09.13 17:15:25
     */

    private int id;
    private String username;
    private int age;
    private Date ctm;

    public User(){
        super();
    }

    public User(String username, int age){
        this.username = username;
        this.age = age;
        this.ctm = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }
}
