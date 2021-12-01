package com.example.Greetingappcontroller2.repository;

import com.example.Greetingappcontroller2.model.GreetingAppModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingApp extends JpaRepository<GreetingAppModel,Integer> {

    void delet(GreetingAppModel greetingAppModel);
}
