package com.zensar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.Advertise;
import com.zensar.db.AdvertiseDAO;
@Service
public class AdvertiseService {
	
	@Autowired
    AdvertiseDAO dao;

    public Advertise addAdveries(Advertise advertise) {
        return this.dao.save(advertise);
    }

    public List<Advertise> getAllAdvertise(Advertise advertise) {
        return this.dao.findAll();
    }

    public Advertise updateAdvertise(Advertise ad, Integer id) {
        Optional<Advertise> advertise = dao.findById(id);
        if (advertise != null) {
            return dao.save(ad);
        }
        return null;
    }

    public Advertise getAdvertisesById(Integer id) {
        Optional<Advertise> advertise = dao.findById(id);
        if (advertise.isPresent()) {
            return advertise.get();
        } else {
            return null;
        }
    }
    
    public boolean deleteAdvertiseById(Integer id) {
        dao.deleteById(id);
        if (dao.findById(id) != null) {
            return false;
        }
        return true;
    }
}


