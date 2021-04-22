import java.time.LocalDate
public class DateMerger {

  public static void main(String[] args) throws Exception {
    List<DateRange> dateRanges = new ArrayList<>();
    dateRanges.add(new DateRange(LocalDate.of(01,01,2014), LocalDate.of(30,01,2014)));
    dateRanges.add(new DateRange(LocalDate.of(15,01,2014), LocalDate.of(15,02,2014)));
    dateRanges.add(new DateRange(LocalDate.of(10,03,2014), LocalDate.of(15,04,2014)));
    dateRanges.add(new DateRange(LocalDate.of(10,04,2014), LocalDate.of(15,05,2014)));

    System.out.println("## INPUT--->");
    dateRanges.stream().forEach(dateRange -> System.out.println(dateRange.getStartDate() + " - " + dateRange.getEndDate()));

    List<DateRange> mergedDateRange = mergeDateRange(dateRanges);

    System.out.println("## OUTPUT-->");
    mergedDateRange.stream().forEach(dateRange -> System.out.println(dateRange.getStartDate() + " - " + dateRange.getEndDate()));
  }}

