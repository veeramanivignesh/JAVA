import java.util.Scanner;

public class SeatBooking {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] seats = new int[n];

        sc.nextLine(); 
        String st = sc.nextLine();

        String[] booking = st.split(" ");

        for (int i = 0; i < booking.length; i++) {
            int seatNum = Integer.parseInt(booking[i]); 

            if (seatNum < 0 || seatNum >= n) {
                System.out.println("Invalid seat number");
                continue;
            }

            if (seats[seatNum] == 0) {
                seats[seatNum] = 1;
                System.out.println("Seat " + (seatNum) + " Booked..");
            } else {
                System.out.println("Seat " + (seatNum ) + " is already booked..");
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(seats[i] + " ");
        }
    }
}