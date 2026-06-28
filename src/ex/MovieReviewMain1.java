package ex;

public class MovieReviewMain1 {
    public static void main(String[] args){
        // 영화 리뷰 정보 배열 선언
        MovieReview[] moviereview = new MovieReview[2];
        // 객체 선언도 해줘야 함
        moviereview[0] = new MovieReview();
        moviereview[1] = new MovieReview();

        moviereview[0].title = "인셉션";
        moviereview[0].review = "인생은 무한루트";

        MovieReview moviereview2 = new MovieReview();
        moviereview[1].title = "어바웃타임";
        moviereview[1].review = "인생 시간 영화";
        
        // 영화 리뷰 정보 출력
        for (int i = 0; i < moviereview.length; i++) {
            System.out.println(moviereview[i].title+moviereview[i].review);
            
        }
    }
}
