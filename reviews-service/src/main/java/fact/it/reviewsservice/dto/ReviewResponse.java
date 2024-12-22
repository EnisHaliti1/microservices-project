package fact.it.reviewsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewResponse {
    private String reviewId;
    private Long bookId;
    private Long userId;
    private Integer rating;
    private String comment;
}