package com.bag.hotelmanagementsystem.serviceImpl;


import com.bag.hotelmanagementsystem.model.HotelModel;
import com.bag.hotelmanagementsystem.repository.HotelRepository;
import com.bag.hotelmanagementsystem.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<HotelModel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public HotelModel saveHotel(HotelModel hotelModel) {
        return hotelRepository.save(hotelModel);
    }

    @Override
    public HotelModel getHotelById(Long hotelId) {
        return hotelRepository.getHotelByid(hotelId);
    }

    @Override
    public HotelModel updateHotel(HotelModel hotelModel) {
        return hotelRepository.save(hotelModel);
    }

    @Override
    public void deleteHotelById(Long hotelId) {
    hotelRepository.deleteById(hotelId);
    }
}



