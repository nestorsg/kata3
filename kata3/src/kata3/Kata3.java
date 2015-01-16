package kata3;
public class Kata3 {

    public static void main(String[] args) {
        MailReader reader = new MailReader("emails.txt");
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        Histogram<String> histogram = builder.build(reader.readDomains());
        new HistogramViewer<String>().print(histogram);
    }
    
}