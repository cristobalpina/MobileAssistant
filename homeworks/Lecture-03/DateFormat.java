public class DateFormat {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }
    
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
    
    public static void main(String[] args){
        printAmerican("Saturday", 22, "July", 2015);
        printEuropean("Saturday", 22, "July", 2015);
    }
}

