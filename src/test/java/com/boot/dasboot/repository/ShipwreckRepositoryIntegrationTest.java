package com.boot.dasboot.repository;

import com.boot.dasboot.model.Shipwreck;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShipwreckRepositoryIntegrationTest {

    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @Test
    public void testFindAll(){
        List<Shipwreck> shipwreckList = shipwreckRepository.findAll();
        assertThat(shipwreckList.size(), is(greaterThanOrEqualTo(0)));

    }
}
