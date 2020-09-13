package com.axiom.controller;

import java.util.List;
import java.util.Map;

import com.axiom.model.Mobile;
import com.axiom.repository.MobileRepo;
import com.sipios.springsearch.anotation.SearchSpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api/v1")
public class MobileController {
    @Autowired
    private MobileRepo mobileRepo;
    private static final String REQUEST_NO_BODY = "Request does not contain a body";

    /**
     * Insert Data from JSON
     * @param e
     * @return
     */
    @PostMapping("/bulk")
    public String addPeople(@RequestBody List<Mobile> e) {
        if (e != null && !e.isEmpty()) {
            mobileRepo.saveAll(e);
            return String.format("Added %d mobiles.", e.size());
        } else {
            return REQUEST_NO_BODY;
        }
    }

    /**
     * Search by any query param
     * @param specs
     * @return
     */
    @GetMapping("/search")
    public ResponseEntity<List<Mobile>> searchForCars(@SearchSpec Specification<Mobile> specs) {
        return new ResponseEntity<>(mobileRepo.findAll(Specification.where(specs)), HttpStatus.OK);
    }
}