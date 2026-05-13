package task3;

public class FinancialTransactionAnalyzer extends DataAnalyzer{
    @Override
    public void analyze(){
        System.out.println("Ищу в строке сумму покупок");
    }

    @Override
    public void exportToHdfs(){
        System.out.println("Экспортирую FinancialTransaction в hdfs");
    }
}
