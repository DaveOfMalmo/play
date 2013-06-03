package se.lucerna.dao;

import se.lucerna.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
    @Override
    public List<Person> getPersons() {
        List<Person> l = new ArrayList<Person>();
        l.add(new Person("David", "Göransson"));
        return l;
    }
}
