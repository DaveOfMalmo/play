package se.lucerna.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import se.lucerna.Person;
import se.lucerna.dao.PersonDaoImpl;
import se.lucerna.services.PersonsService;
import se.lucerna.services.PersonsServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/welcome")
public class PeopleController {
    private PersonsServiceImpl personsService;
    public PeopleController() {
        personsService = new PersonsServiceImpl();
        personsService.setPersonDao(new PersonDaoImpl());
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Person> printWelcome(ModelMap model) {

        return personsService.getPersons();
    }
}
