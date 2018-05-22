package de.murat.tutorial.gradledemo01.repository;

import de.murat.tutorial.gradledemo01.category.UnitTest;
import de.murat.tutorial.gradledemo01.model.Person;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@Category(UnitTest.class)
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;


    @Test
    public void testSavePerson() {
        // given
        Person murat = new Person("Murat", "Yildiz");
        assertNull(murat.getId());

        // when
        Person muratFromDb = personRepository.save(murat);
        assertNotNull(muratFromDb.getId());

        // then
        assertEquals(murat.getId(), muratFromDb.getId());
        assertEquals(murat.getFirstName(), muratFromDb.getFirstName());
    }

}