package sample.com.androidormsugardb.models;

import com.orm.SugarRecord;

/**
 * Created by fifi on 5/7/2017.
 */

public class SaveUserModel extends SugarRecord <SaveUserModel>{

    String username ;
    String firstName ;
    String lastName ;
    String password ;
    String email ;
    String mobile ;


    public SaveUserModel() {

    }

    public SaveUserModel(String username,String firstName,String lastName,String password,String email,String mobile) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
