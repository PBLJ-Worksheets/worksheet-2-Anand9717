import java.util.Scanner;           //22BCS11449
public class Project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Store store = new Store();
        int choice;
        String videoTitle;
        System.out.println("\nWelcome!\n");
        System.out.println("Select an operation:");
        System.out.println("1. Add \n2. Check out \n3. Return \n4. Rate \n5. List Inventory");
        System.out.println("6. Exit");
        while (true) {
            System.out.println("\nEnter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Adding a new video to the inventory.");
                    System.out.println("Title: ");
                    videoTitle = input.nextLine();
                    store.addVideo(videoTitle);
                    break;
                case 2:
                    System.out.println("Check out a video from the inventory.");
                    System.out.println("Title: ");
                    videoTitle = input.nextLine();
                    store.checkOut(videoTitle);
                    break;
                case 3:
                    System.out.println("Return a video to the inventory.");
                    System.out.println("Title: ");
                    videoTitle = input.nextLine();
                    store.returnVideo(videoTitle);
                    break;
                case 4:
                    System.out.println("Rate a video.");
                    System.out.println("Title: ");
                    videoTitle = input.nextLine();
                    System.out.println("Rating: ");
                    int rating = input.nextInt();
                    input.nextLine();
                    store.rateVideo(videoTitle, rating);
                    break;
                case 5:
                    System.out.println("List all the inventory of the store.");
                    store.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
