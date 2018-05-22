package de.murat.tutorial.gradledemo01.service;

import de.murat.tutorial.gradledemo01.category.UnitTest;
import de.murat.tutorial.gradledemo01.model.Person;
import de.murat.tutorial.gradledemo01.repository.PersonRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;


@RunWith(SpringRunner.class)
@Category(UnitTest.class)
public class PersonServiceImplTest {

    @TestConfiguration
    static class PersonServiceImplTestContextConfiguration {

        @Bean
        public IPersonService personService() {
            return new PersonServiceImpl();
        }
    }


    @Autowired
    private IPersonService personService;

    @MockBean
    private PersonRepository personRepository;

    @Test
    public void getPersonByFirstNameTest() {
        // given
        Person murat = new Person("Murat", "Yildiz");

        Mockito.when(personRepository.findByFirstName(murat.getFirstName()))
                .thenReturn(murat);

        // when
        Person muratFromMockito = personService.getPersonByFirstName("Murat");

        // then
        assertNotNull(muratFromMockito);
        Mockito.verify(personRepository, times(1)).findByFirstName(murat.getFirstName());

    }

}