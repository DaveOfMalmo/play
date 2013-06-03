package se.lucerna.services;

import se.lucerna.Person;
import se.lucerna.dao.PersonDao;

import java.util.List;

public class PersonsServiceImpl implements PersonsService {
    private PersonDao personDao;

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public List<Person> getPersons() {
        return personDao.getPersons();
    }
}
