package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Utilisateur on 22/06/2017.
 */
public class EnemyTest {
    Enemy test;
    @Before
    public void setUp() throws Exception {
        test = new Enemy(0,0);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getImage() throws Exception {
    }

    @Test
    public void isPlayer() throws Exception {
        final boolean expected = false;
        assertEquals(expected,test.isPlayer());
    }

    @Test
    public void move() throws Exception {
    }

}