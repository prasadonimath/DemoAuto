package javaPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

    @DataProvider
    public Object[][] data(){

        Object[][] data= {
                {"user","pass1"},
                {"user2","pass2"},
                {"user3","pass3"},
        };

        return data;

    }

    @Test(dataProvider="data")
    public  void login(String user, String pass){
        System.out.println("The user : "+user);
        System.out.println("The password : "+pass);


    }
}
