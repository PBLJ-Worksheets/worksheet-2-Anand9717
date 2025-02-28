public class Video {
    String title;
    boolean isCheckedOut;
    float avgRating, totalRating;
    int num;
    Video(String title) {
        this.title = title;
        this.isCheckedOut = false;
        this.avgRating = 0;
        this.num = 0;                   // 22BCS11449
    }
    boolean checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
        } 
        else {
            System.out.println("Already checked out.");
        }
        return isCheckedOut;
    }
    boolean returnVideo() {
        if (isCheckedOut) {
            isCheckedOut = false;
        } 
        else {
            System.out.println("Already available.");
        }
        return isCheckedOut;
    }
    float receiveRating(int rating) {
        num++;
        totalRating += rating;
        avgRating = totalRating / num;
        return avgRating;
    }
}