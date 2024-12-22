package fact.it.reviewsservice.service;

import fact.it.reviewsservice.dto.ReviewRequest;
import fact.it.reviewsservice.dto.ReviewResponse;
import fact.it.reviewsservice.model.Review;
import fact.it.reviewsservice.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewResponse createReview(ReviewRequest reviewRequest) {
        Review review = new Review();
        review.setBookId(reviewRequest.getBookId());
        review.setUserId(reviewRequest.getUserId());
        review.setRating(reviewRequest.getRating());
        review.setComment(reviewRequest.getComment());

        Review savedReview = reviewRepository.save(review);
        return mapToResponse(savedReview);
    }

    public List<ReviewResponse> getReviewsByBookId(Long bookId) {
        return reviewRepository.findByBookId(bookId).stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    public List<ReviewResponse> getReviewsByUserId(Long userId) {
        return reviewRepository.findByUserId(userId).stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    private ReviewResponse mapToResponse(Review review) {
        return new ReviewResponse(
                review.getReviewId(),
                review.getBookId(),
                review.getUserId(),
                review.getRating(),
                review.getComment()
        );
    }
}