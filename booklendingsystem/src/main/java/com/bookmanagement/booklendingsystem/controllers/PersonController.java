package com.bookmanagement.booklendingsystem.controllers;

import com.bookmanagement.booklendingsystem.Services.PersonService;
import com.bookmanagement.booklendingsystem.entities.Person;
import com.bookmanagement.booklendingsystem.repositories.PersonRepository;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private PersonService personService;
    private final PersonRepository personRepository;

    public PersonController(PersonService personService,
                            PersonRepository personRepository) {
        this.personService = personService;
        this.personRepository = personRepository;
    }

    @GetMapping
    public List<Person> getAllPersons(){
        return  personService.getAllPersons();
    }

    @PostMapping
    public Person postOnePerson(@Valid  @RequestBody Person newPerson){
        return personService.save(newPerson);
    }

    @GetMapping("/{personId}")
    public Person getOnePerson(@PathVariable Long personId){
        return personService.findByPersonId(personId);
    }

    @PutMapping("/{personId}")
    public Person putOnePerson(@PathVariable Long personId, @RequestBody Person newPerson){
        return personService.update(personId,newPerson);
    }

    @DeleteMapping("/{personId}")
    public void deleteOnePerson(@PathVariable Long personId){
        personService.deleteById(personId);
    }



}
