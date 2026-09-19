// AIExperimentDemo.java
// Task 5: Integrated BAI Challenge - driver / demo

public class AIExperimentDemo {

    void trainMore(AIExperiment exp) {
        exp.completedEpochs = exp.completedEpochs + 5;
    }

    public static void main(String[] args) {
        AIExperiment exp1 = new AIExperiment();
        exp1.experimentName = "ImageClassifier";
        exp1.completedEpochs = 10;
        exp1.targetEpochs = 50;

        AIExperiment exp2 = new AIExperiment();
        exp2.experimentName = "TextSummarizer";
        exp2.completedEpochs = 20;
        exp2.targetEpochs = 40;

        System.out.println("Initial state:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());
        System.out.println();

        // Predict: exp1 completedEpochs -> 10 + 5 = 15
        exp1.runEpochs(5);
        // Predict: exp2 completedEpochs -> 20 + (3 + 2) = 25
        exp2.runEpochs(3, 2);

        System.out.println("After runEpochs calls:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());
        System.out.println();

        System.out.println("Remaining epochs:");
        System.out.println(exp1.experimentName + " -> " + exp1.remainingEpochs());
        System.out.println(exp2.experimentName + " -> " + exp2.remainingEpochs());
        System.out.println();

        System.out.println("R8 check - exp2 is unaffected by exp1's changes:");
        System.out.println(exp2.status());
        System.out.println();

        AIExperimentDemo demo = new AIExperimentDemo();
        System.out.println("Before trainMore: " + exp1.status());
        demo.trainMore(exp1);
        System.out.println("After trainMore:  " + exp1.status());

       
    }
}