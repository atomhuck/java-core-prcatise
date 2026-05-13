package task3;

public class Main {
    public static void main(String[] args) {
        DataAnalyzer[] dataAnalyzers = {new UserActivityAnalyzer(), new FinancialTransactionAnalyzer()};

        for (DataAnalyzer dataAnalyzer : dataAnalyzers){
            System.out.println(dataAnalyzer.validateData());
            dataAnalyzer.analyze();
        }
    }
}
