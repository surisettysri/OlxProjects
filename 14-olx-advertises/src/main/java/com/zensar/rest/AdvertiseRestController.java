package com.zensar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zensar.bean.Advertise;
import com.zensar.service.AdvertiseService;

public class AdvertiseRestController {
	
	@Autowired
    AdvertiseService service;

    // To add new advertises
    @PostMapping("/advertise")
    public Advertise newAdvertise(@RequestBody Advertise advertise) {
        return this.service.addAdveries(advertise);
    }

    // To update existing advertise
    @PutMapping("/advertise/{id}")
    public Advertise updateAdvertise(@RequestBody Advertise ad, @PathVariable Integer id) {
        return this.service.updateAdvertise(ad, id);
    }

    // To read all the advertise posted by logged in user
    @GetMapping("/user/advertise")
    public List<Advertise> getAllAdvertises() {
        return this.service.getAllAdvertise(null);
    }

    // Deletes specific advertisement posted by logged in user
    @DeleteMapping("/user/advertise/{postId}")
    public boolean deleteAdvertiseById(@PathVariable("id") Integer id) {
        return this.service.deleteAdvertiseById(id);
    }

    // Get Advertise by id
    @RequestMapping("/advertise/{postId}")
    public Advertise getAdvertisesById(@PathVariable Integer id) {
        return this.service.getAdvertisesById(id);
    }

}


