package kata3;

public class HistogramViewer <Type>{
    
    public void print (Histogram<Type> histogram){
        for (Object key : histogram.keySet()) {
            System.out.println(key + " --> " +histogram.get(key));
        }
    }
}