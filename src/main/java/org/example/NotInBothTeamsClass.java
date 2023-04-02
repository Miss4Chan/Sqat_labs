package org.example;

import java.util.HashSet;
import java.util.Set;

public class NotInBothTeamsClass {
    public static Set<String> notInBothTeams(Set<String> team1, Set<String> team2) {
        if (team1 == null || team2 == null) {
            throw new IllegalArgumentException("Input sets cannot be null");
        }

        Set<String> result = new HashSet<>();
        for (String employee : team1) {
            if (!team2.contains(employee)) {
                result.add(employee);
            }
        }

        for (String employee : team2) {
            if (!team1.contains(employee)) {
                result.add(employee);
            }
        }
        return result;
    }
}
