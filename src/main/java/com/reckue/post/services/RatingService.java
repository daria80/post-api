package com.reckue.post.services;

import com.reckue.post.models.Post;
import com.reckue.post.models.Rating;

import java.util.List;

/**
 * Interface RatingService represents service with CRUD operations.
 *
 * @author Kamila Meshcheryakova
 */
public interface RatingService {
    /**
     * This method is used to create an object of class Rating.
     *
     * @param rating object of class Rating
     * @return rating object of class Rating
     */
    Rating create(Rating rating);

    /**
     * This method is used to update data in an object of class Rating.
     *
     * @param rating object of class Rating
     * @return rating object of class Rating
     */
    Rating update(Rating rating);

    /**
     * This method is used to get all object of class Rating.
     *
     * @return list of object of class Rating
     */
    List<Rating> findAll();

    /**
     * This method is used to get all objects of class Rating by parameters.
     *
     * @param limit  quantity of objects
     * @param offset quantity to skip
     * @param sort   parameter for sorting
     * @param desc   sorting descending
     * @return list of objects of class Rating
     */
    List<Rating> findAll(Integer limit, Integer offset, String sort, Boolean desc);

    /**
     * This method is used to delete an object by id.
     *
     * @param id object
     */
    void deleteById(String id);

    /**
     * This method is used to get the number of ratings to a single post.
     *
     * @param postId the post identifier
     * @return quantity of ratings to a post
     */
    int getRatingsCountByPostId(String postId);

    /**
     * This method is used to get all posts with ratings by user id.
     *
     * @param userId the user identifier
     * @param limit  quantity of objects
     * @param offset quantity to skip
     * @return list of objects of class Post
     */
    List<Post> findAllPostsWithRatingsByUserId(String userId, Integer limit, Integer offset);

    /**
     * This method is used to delete all ratings.
     */
    @Deprecated
    void deleteAll();
}