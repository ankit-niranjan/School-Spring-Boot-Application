package com.playground.learn.service;

import com.playground.learn.model.Person;
import com.playground.learn.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

//    @Autowired
//    private PersonRepository personRepository;
//
//    @Autowired
//    private RolesRepository rolesRepository;
//
//    public boolean createNewPerson(Person person){
//        boolean isSaved = false;
//        Roles role = rolesRepository.getByRoleName(EazySchoolConstants.STUDENT_ROLE);
//        person.setRoles(role);
//        person = personRepository.save(person);
//        if (null != person && person.getPersonId() > 0)
//        {
//            isSaved = true;
//        }
//        return isSaved;
//    }
}
