package guru.springframework.api.domain;

import java.util.List;
/*
 * Created by Freddie Molina 12/05/23.
 * */
public class UserData {
    List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
