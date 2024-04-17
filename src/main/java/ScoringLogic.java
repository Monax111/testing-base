public class ScoringLogic {

    double score(boolean hasJob, boolean hasEducation) {
        if (hasJob || hasEducation) {
            return 0.2;
        } else {
            return 0.0;
        }
    }

}


