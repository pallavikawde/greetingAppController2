package com.example.Greetingappcontroller2.controller;

import com.example.Greetingappcontroller2.dto.GreetingAppDto;
import com.example.Greetingappcontroller2.model.GreetingAppModel;
import com.example.Greetingappcontroller2.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/welcome")
public class GreetingAppController {

    @Autowired
    private GreetingAppService greetingAppService;

    @GetMapping(value = "/test1")
    public String welcome(){
        return "welcome to greeting app";
    }
    @GetMapping(value ="/find-by-id")
    public GreetingAppService findByid(@RequestParam int id){
         return greetingAppService.findById(id);
    }
    @GetMapping("/get-all-list")
   public List<GreetingAppModel> allListOfStudent(@RequestBody GreetingAppDto greetingAppDto){
        return greetingAppService.getList();

    }
    @PostMapping(value = "/Adding_New-list")
    public GreetingAppModel AddingNewList(@RequestParam GreetingAppDto greetingAppDto){
         return greetingAppService.addList(greetingAppDto);
    }
    @PutMapping(value="/get-new-updated-list")
    public GreetingAppModel editlist(@RequestBody GreetingAppDto greetingAppDto,@PathVariable int id){
        return greetingAppService.updatedList(id,greetingAppDto);
    }
    @DeleteMapping(value = "/delet-perticular-id")
    public GreetingAppModel deletList(@RequestParam int id){
        return GreetingAppService.deletedList(id);
    }



}
