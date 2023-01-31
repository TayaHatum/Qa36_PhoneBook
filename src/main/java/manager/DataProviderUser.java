package manager;

import model.User;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderUser {
    @DataProvider
    public Iterator<Object[]> loginDataCls(){

        List<Object[]> list = new ArrayList<>();

        list.add(new Object[]{"noa@gmail.com","Nnoa12345$"});
        list.add(new Object[]{"sonya@gmail.com","Ss12345$"});
        list.add(new Object[]{"noa@gmail.com","Nnoa12345$"});

        return list.iterator();

    }


    @DataProvider
    public Iterator<Object[]> loginDataUser(){
        List<Object[]> list = new ArrayList<>();

        list.add(new Object[]{User.builder().email("noa@gmail.com").password("Nnoa12345$").build()});
        list.add(new Object[]{User.builder().email("sonya@gmail.com").password("Ss12345$").build()});
        list.add(new Object[]{User.builder().email("noa@gmail.com").password("Nnoa12345$").build()});

        return list.iterator();

    }
    @DataProvider

    public Iterator<Object[]> loginDataUserFromFile(){
        List<Object[]> list = new ArrayList<>();

        return list.iterator();
    }


}
