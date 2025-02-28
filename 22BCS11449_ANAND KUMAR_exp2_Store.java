public class Store {
    Video[] videos;
    int videoCount;
    Store() {
        this.videos = new Video[100];
        this.videoCount = 0;                       // 22BCS11449
    }
    void addVideo(String title) {
        videos[videoCount] = new Video(title);
        videoCount++;
    }
    void checkOut(String title) {
        for (int i = 0; i < videoCount; i++) {
            if (videos[i].title.equals(title)) {
                videos[i].checkOut();
                return;
            }
        }
        System.out.println(title + " not found in the store.");
    }
    void returnVideo(String title) {
        for (int i = 0; i < videoCount; i++) {
            if (videos[i].title.equals(title)) {
                videos[i].returnVideo();
                return;
            }
        }
        System.out.println(title + " not found in the store.");
    }
    void rateVideo(String title, int rating) {
        for (int i = 0; i < videoCount; i++) {
            if (videos[i].title.equals(title)) {
                videos[i].receiveRating(rating);
                return;
            }
        }
        System.out.println(title + " not found in the store.");
    }
    
    void listInventory() {
        for (int i = 0; i < videoCount; i++) {
            String availability = videos[i].isCheckedOut ? "Not Available" : "Available";
            System.out.println(videos[i].title + " - " + availability + " - " + videos[i].avgRating);
        }
    }
}
