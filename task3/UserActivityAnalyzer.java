package task3;

public class UserActivityAnalyzer extends DataAnalyzer{
    @Override
    public void analyze(){
        System.out.println("Считаю количество кликов");
    }

    @Override
    public void exportToHdfs(){
        System.out.println("Экспортирую UserActivity в hdfs");
    }
}
