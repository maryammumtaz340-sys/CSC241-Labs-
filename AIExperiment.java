// AIExperiment.java
// Task 5: Integrated BAI Challenge

class AIExperiment {

    String experimentName;
    int completedEpochs;
    int targetEpochs;

    void runEpochs(int epochs) {
        completedEpochs = completedEpochs + epochs;
    }

    void runEpochs(int epochs, int bonusEpochs) {
        int totalEpochs = epochs + bonusEpochs;
        completedEpochs = completedEpochs + totalEpochs;
    }

    int remainingEpochs() {
        return targetEpochs - completedEpochs;
    }

    String status() {
        return "Experiment: " + experimentName
                + " | Completed: " + completedEpochs + "/" + targetEpochs
                + " | Remaining: " + remainingEpochs();
    }
}