public class Driver {
    public static void main (String[] args) {
        double answer= Review.totalSentiment("SimpleReview.txt");
        System.out.println("Total Sentiment of the review: " + answer);
        
        double answer1= Review.starRating ("SimpleReviw.txt");
        System.out.println("The star rating is: " + answer1);
        
    }
    
    
    
    
}
