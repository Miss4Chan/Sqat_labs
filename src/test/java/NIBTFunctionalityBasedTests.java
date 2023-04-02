import org.example.NotInBothTeamsClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class NIBTFunctionalityBasedTests {
    NotInBothTeamsClass notInBothTeamsClass = new NotInBothTeamsClass();
    @BeforeEach
    public void setUp()
    {
        notInBothTeamsClass= new NotInBothTeamsClass();
    }
    //A1B1
    @Test
    public void noCommonNoEmptySameSize()
    {
        Set<String> team1 = new HashSet<>(Arrays.asList("1","2"));
        Set<String> team2 = new HashSet<>(Arrays.asList("3","4"));
        Set<String> result = NotInBothTeamsClass.notInBothTeams(team1,team2);
        Set<String> expected = new HashSet<>(Arrays.asList("1","2","3","4"));
        assertEquals(result,expected);
    }
    //A1B2
    @Test
    public void atLeastOneNotAllSameSize()
    {
        Set<String> team1 = new HashSet<>(Arrays.asList("1","2"));
        Set<String> team2 = new HashSet<>(Arrays.asList("2","4"));
        Set<String> result = NotInBothTeamsClass.notInBothTeams(team1,team2);
        Set<String> expected = new HashSet<>(Arrays.asList("1","4"));
        assertEquals(result,expected);
    }
    //A1B3
    @Test
    public void equalSameSizeTest1()
    {
        Set<String> team1 = new HashSet<>(Arrays.asList("1","2"));
        Set<String> team2 = new HashSet<>(Arrays.asList("1","2"));
        Set<String> result = NotInBothTeamsClass.notInBothTeams(team1,team2);
        Set<String> expected = new HashSet<>();
        assertEquals(result,expected);
    }
    @Test
    public void equalSameSizeTest2() //this one is to prove that even if both have no elements they are equal
    {
        Set<String> team1 = new HashSet<>(Arrays.asList());
        Set<String> team2 = new HashSet<>(Arrays.asList());
        Set<String> result = NotInBothTeamsClass.notInBothTeams(team1,team2);
        Set<String> expected = new HashSet<>(Arrays.asList());
        assertEquals(result,expected);
    }
    //A3B4
    @Test
    public void twoGreaterOneProperSubset()
    {
        Set<String> team1 = new HashSet<>(Arrays.asList("2"));
        Set<String> team2 = new HashSet<>(Arrays.asList("1","2","3"));
        Set<String> result = NotInBothTeamsClass.notInBothTeams(team1,team2);
        Set<String> expected = new HashSet<>(Arrays.asList("1","3"));
        assertEquals(result,expected);
    }
    //A2B5
    @Test
    public void oneGreaterTwoProperSubset()
    {
        Set<String> team1 = new HashSet<>(Arrays.asList("5","6","7"));
        Set<String> team2 = new HashSet<>(Arrays.asList("5"));
        Set<String> result = NotInBothTeamsClass.notInBothTeams(team1,team2);
        Set<String> expected = new HashSet<>(Arrays.asList("6","7"));
        assertEquals(result,expected);
    }
    //A2B1
    @Test
    public void oneGreaterNoCommon()
    {
        Set<String> team1 = new HashSet<>(Arrays.asList("5","6","7"));
        Set<String> team2 = new HashSet<>(Arrays.asList("8","9"));
        Set<String> result = NotInBothTeamsClass.notInBothTeams(team1,team2);
        Set<String> expected = new HashSet<>(Arrays.asList("5","6","7","8","9"));
        assertEquals(result,expected);
    }
    //A3B1
    @Test
    public void twoGreaterNoCommon()
    {
        Set<String> team1 = new HashSet<>(Arrays.asList("5","6"));
        Set<String> team2 = new HashSet<>(Arrays.asList("7","8","9"));
        Set<String> result = NotInBothTeamsClass.notInBothTeams(team1,team2);
        Set<String> expected = new HashSet<>(Arrays.asList("5","6","7","8","9"));
        assertEquals(result,expected);
    }
    //A3B6
    @Test
    public void twoGreaterOneEmpty()
    {
        Set<String> team1 = new HashSet<>(Arrays.asList());
        Set<String> team2 = new HashSet<>(Arrays.asList("1","2"));
        Set<String> result = NotInBothTeamsClass.notInBothTeams(team1,team2);
        Set<String> expected = new HashSet<>(Arrays.asList("1","2"));
        assertEquals(result,expected);
    }
    //A2B7
    @Test
    public void oneGreaterTwoEmpty()
    {
        Set<String> team1 = new HashSet<>(Arrays.asList("1","2"));
        Set<String> team2 = new HashSet<>(Arrays.asList());
        Set<String> result = NotInBothTeamsClass.notInBothTeams(team1,team2);
        Set<String> expected = new HashSet<>(Arrays.asList("1","2"));
        assertEquals(result,expected);
    }
}
