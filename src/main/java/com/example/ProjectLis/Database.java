package com.example.ProjectLis;

import java.util.Arrays;
import java.util.List;

public class Database {

    public static List<Post> getData() {
        return Arrays.asList(
                new Post(1, "Սիրուն կով", "https://s.list.am/r/329/48086329.webp", 500000, "aa"),
                new Post(2, "Jaylami dzu", "https://s.list.am/r/863/52918863.webp", 8000, "nnn")
        );
    }

}
