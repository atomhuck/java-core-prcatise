package task3;

abstract class DataAnalyzer implements Exportable{
    protected String rawData;
    public void setRawData(String rawData){
        this.rawData = rawData;
    }
    public boolean validateData(){
        if (rawData == null)
            return false;
        else
            return rawData.isEmpty();
    }
    abstract void analyze();
}
