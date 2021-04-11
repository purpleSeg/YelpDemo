package com.YelpReviewAPI.demo;

import com.YelpReviewAPI.demo.Service.ReviewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.QueryParam;

@org.springframework.web.bind.annotation.RestController
public class YelpRestController {

    private static Logger LOGGER = LoggerFactory.getLogger(RestController.class);

    @Autowired
    private ReviewService reviewService;

    @GetMapping(value = "reviews/?id=", consumes = "application/json", produces = "application/json")
    public ResponseEntity getReviewById(@QueryParam("id") String id) {
        try {
            return new ResponseEntity(reviewService.getReviewsById(id), HttpStatus.OK) ;
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            return new ResponseEntity<>("Business with ID: " + id + " was not found. ", HttpStatus.NOT_FOUND);
        }
    }
}
