package com.lori.springIntro2.data;

import com.lori.springIntro2.model.User;
import org.springframework.stereotype.Component;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class userRepository {
    private static final List<User> ALL_USERS = Arrays.asList(
            new User("Scott", "awesomescott2000", LocalDate.of(2011,1,28)),
            new User("Ted", "PBXGuy", LocalDate.of(2000, 10, 14)),
            new User("Zech", "BigManZanita", LocalDate.of(2012,1,23)),
            new User("Koddie", "softballmom", LocalDate.of(2005,3,3)),
            new User("Kym", "PrancerciseGuru", LocalDate.of(1969,6,9)),
            new User("Lori", "AO", LocalDate.of(1997,11,7)),
            new User("Joan", "HollywoodSatin", LocalDate.of(1999,12,31)),
            new User("Jake", "DjJazzyJake", LocalDate.of(1999,4,26)),
            new User("Mark", "Seamhead", LocalDate.of(1988,8,8)),
            new User("Manny", "NaperciseMoose", LocalDate.of(2002,2,14))
    );

    public List<User> getAllUsers(){
        return ALL_USERS;
    }


        public User findByName(String name){
                for (User user : ALL_USERS){
                if (user.getName().equalsIgnoreCase(name)){
                return  user;
                }
        }
                User user = new User("User not Found", "N/A", LocalDate.of(1971, 1, 1));
                return user;
    }

}
