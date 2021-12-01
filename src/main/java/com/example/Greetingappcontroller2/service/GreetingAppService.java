package com.example.Greetingappcontroller2.service;

import com.example.Greetingappcontroller2.dto.GreetingAppDto;
import com.example.Greetingappcontroller2.model.GreetingAppModel;
import com.example.Greetingappcontroller2.repository.GreetingApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public GreetingAppModel addList(GreetingAppDto greetingAppDto) {
        GreetingAppModel greetingAppModel = new GreetingAppModel();
        greetingAppModel.setFirstname(greetingAppDto.getFirstname());
        greetingAppModel.setLastname(greetingAppDto.getLastname());
        greetingAppModel.setId(greetingAppDto.getId());
         return greetingApp.save(greetingAppModel);
    }

    public List<GreetingAppModel> getList() {
        return greetingApp.findAll();
    }

    public GreetingAppModel updatedList(int id, GreetingAppDto greetingAppDto) {
        GreetingAppModel greetingAppModel1 = new GreetingAppModel();
        if(greetingAppModel1.ispresent()){
            greetingAppModel1.setId(greetingAppDto.getId());
            return greetingApp.save(greetingAppModel1);

        }
    }
}
