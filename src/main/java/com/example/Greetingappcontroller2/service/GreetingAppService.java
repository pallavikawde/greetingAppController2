package com.example.Greetingappcontroller2.service;

import com.example.Greetingappcontroller2.model.GreetingAppModel;
import com.example.Greetingappcontroller2.repository.GreetingApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingAppService {

    @Autowired
    private GreetingApp greetingApp;

    public GreetingAppService findById(int id){
        Optional<GreetingAppModel>greetingAppModel = greetingApp.findById(id);
        if(greetingAppModel.isPresent()){
             greetingAppModel.get();
        }
        return null;

    }
}
