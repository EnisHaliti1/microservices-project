package fact.it.reviewsservice.repository;

import fact.it.reviewsservice.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReviewRepository extends MongoRepository <Review, String> {
    List<Review> findByBookId(Long bookId);
    List<Review> findByUserId(Long userId);
}
