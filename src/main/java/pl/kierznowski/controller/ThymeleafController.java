package pl.kierznowski.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.kierznowski.data.entity.Person;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    @ModelAttribute("persons")
    public List<Person> getPeople() {
        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        person.setLastName("LASTNAME");
        person.setName("NAME");
        personList.add(person);
        personList.add(person);
        return personList;
    }

    @ModelAttribute("name")
    public String getName() {
        return "Ambroży";
    }

    @GetMapping("/")
    public String show() {
        return "index";
    }

}