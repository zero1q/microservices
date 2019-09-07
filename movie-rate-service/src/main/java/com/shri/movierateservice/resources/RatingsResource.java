package com.shri.movierateservice.resources;

import com.shri.movierateservice.models.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: ZeeroIQ
 * @Date: 9/6/2019 11:10 PM
 */
@RestController
@RequestMapping("/ratingsResources")
public class RatingsResource {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @GetMapping("/users/{userId}")
    public List<Rating> getUserRating(@PathVariable("userId") String userId) {
        return Arrays.asList(
                new Rating("1234", 3),
                new Rating("321", 5)
        );
    }
}
