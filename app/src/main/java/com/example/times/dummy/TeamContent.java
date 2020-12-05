package com.example.times.dummy;

import com.example.times.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamContent {
    public static final List<TeamItem> ITEMS = new ArrayList<TeamItem>();
    public static final Map<String, TeamItem> ITEM_MAP = new HashMap<String, TeamItem>();

    static {
        addItem(createTeamItem(
                1,
                R.drawable.chelseafc,
                "Chelsea FC",
                "Time Inglês que só ganhou champions league com o Drogba",
                "Londres",
                "Inglaterra",
                "Campeonato Inglês: 6"));

        addItem(createTeamItem(
                2,
                R.drawable.manchestercityfc,
                "Manchester City FC",
                "Nada, nada e morre na praia. Santos da Inglaterra.",
                "Manchester",
                "Inglaterra",
                "Campeonato Inglês: 6"));

        addItem(createTeamItem(3,
                R.drawable.tottenhamhotspurfc,
                "Totteham FC",
                "Aquele Time que tem vários highlights no youtube e nenhum título.",
                "Londres",
                "Inglaterra",
                "Campeonato Inglês: 2"));

        addItem(createTeamItem(4,
                R.drawable.manchesterunitedfc,
                "Manchester United FC",
                "Estão esperando o CR7 ir se aposentar neles.",
                "Manchester",
                "Inglaterra",
                "Campeonato Inglês: 20"));
    }

    private static void addItem(TeamItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static TeamItem createTeamItem(int position, int image, String content, String details, String city, String state, String titles) {
        return new TeamItem(String.valueOf(position), image, content, details, city, state, titles);
    }

    public static class TeamItem {
        public final String id;
        public final int image;
        public final String content;
        public final String details;
        public final String city;
        public final String state;
        public final String titles;

        public TeamItem(String id, int image, String content, String details, String city, String state, String titles) {
            this.id = id;
            this.image = image;
            this.content = content;
            this.details = details;
            this.city = city;
            this.state = state;
            this.titles = titles;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}