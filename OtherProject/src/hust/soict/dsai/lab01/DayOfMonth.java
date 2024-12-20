package hust.soict.dsai.lab01;
import java.util.Scanner;
public class DayOfMonth {
	public static void main(String[] agrs) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hay dien thang:");
		String month = keyboard.nextLine();
		System.out.println("Hay dien nam:");
		int year=keyboard.nextInt();
		if (year < 0) {
			System.out.println("Error!Khong co nam am!");
		}
		int month_t=convertMonthToNumber(month);
		if (month_t < 0) {
			System.out.println("Error!Khong co thang am!");
		}
		boolean Namnhuan = ((year % 4*year % 100) != 0 || year %400 == 0);
		System.out.println("Thang ban vua dien co so ngay la");
		int Day=getDay(month_t,Namnhuan);
		System.out.println(Day);
		keyboard.close();
	}
	public static int convertMonthToNumber(String month) {
        switch (month.toLowerCase()) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun.":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul.":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sep.":
            case "sep":
            case "9":
                return 9;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 12;
            default:
                return -1;  // Error
        }
    }
	public static int getDay(int month_t,boolean Namnhuan) {
		 switch (month_t) {
         case 1: // January
         case 3: // March
         case 5: // May
         case 7: // July
         case 8: // August
         case 10: // October
         case 12: // December
             return 31;
         case 4: // April
         case 6: // June
         case 9: // September
         case 11: // November
             return 30;
         case 2: // February
             return Namnhuan ? 29 : 28;
         default:
             return -1;  // Invalid month number
     }
 }
	}


