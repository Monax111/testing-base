import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScoringLogicTest {
    ScoringLogic scoringLogic = new ScoringLogic();

    @Test
    void whenJobOrEducationIsTrueThenIncreasedCoefficient(){
        Assertions.assertEquals(0.2, scoringLogic.score(true, true));
    }

    @Test
    void whenJobOrEducationIsAbsentThenZeroCoefficient(){
        Assertions.assertEquals(0.0, scoringLogic.score(false, false));
    }

}