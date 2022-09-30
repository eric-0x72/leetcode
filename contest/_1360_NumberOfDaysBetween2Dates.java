// package contest;
//
// import java.text.ParseException;
// import java.text.SimpleDateFormat;
// import java.util.Date;
// import java.util.Locale;
// import java.util.concurrent.TimeUnit;
//
// public class _1360_NumberOfDaysBetween2Dates {
//
// 	public int daysBetweenDates(String date1, String date2) throws ParseException {
// 		SimpleDateFormat sdf = new SimpleDateFormat();
// 		Date first = sdf.parse(date1);
// 		Date second = sdf.parse(date2);
//
// 	}
//
// 	public static void main(String[] args) throws ParseException {
// 		String d1 = "2019-05-3";
// 		String d2 = "2019-05-30";
// 		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
// 		Date a = sdf.parse(d1);
// 		Date b = sdf.parse(d2);
// 		long diffInMillies = a.getTime() - b.getTime();
//
// 		int diff = (int) TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
//
// 		System.out.println(diff);
// 	}
// }
