package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://i.pravatar.cc/400?img=1"),
            new User("002", "Paul", "https://i.pravatar.cc/400?img=2"),
            new User("003", "Phil", "https://i.pravatar.cc/400?img=3"),
            new User("004", "Guillaume", "https://i.pravatar.cc/400?img=4"),
            new User("005", "Francis", "https://i.pravatar.cc/400?img=5"),
            new User("006", "George", "https://i.pravatar.cc/400?img=6"),
            new User("007", "Louis", "https://i.pravatar.cc/400?img=7"),
            new User("008", "Mateo", "https://i.pravatar.cc/400?img=8"),
            new User("009", "April", "https://i.pravatar.cc/400?img=9"),
            new User("010", "Louise", "https://i.pravatar.cc/400?img=10"),
            new User("011", "Elodie", "https://i.pravatar.cc/400?img=11"),
            new User("012", "Helene", "https://i.pravatar.cc/400?img=12"),
            new User("013", "Fanny", "https://i.pravatar.cc/400?img=13"),
            new User("014", "Laura", "https://i.pravatar.cc/400?img=14"),
            new User("015", "Gertrude", "https://i.pravatar.cc/400?img=15"),
            new User("016", "Chloé", "https://i.pravatar.cc/400?img=16"),
            new User("017", "April", "https://i.pravatar.cc/400?img=17"),
            new User("018", "Marie", "https://i.pravatar.cc/400?img=18"),
            new User("019", "Henri", "https://i.pravatar.cc/400?img=19"),
            new User("020", "Rémi", "https://i.pravatar.cc/400?img=20")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://i.pravatar.cc/400?img=21"),
            new User("022", "Geoffrey", "https://i.pravatar.cc/400?img=22"),
            new User("023", "Simon", "https://i.pravatar.cc/400?img=23"),
            new User("024", "André", "https://i.pravatar.cc/400?img=24"),
            new User("025", "Leopold", "https://i.pravatar.cc/400?img=25")
    );
}
