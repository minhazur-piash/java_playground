package com.minhaz.java.playground;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by minhazur on 5/26/16.
 */
public class LauncherTest extends TestCase {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMethod() {
        assertNotNull(Launcher.getCurrentSystemTime());
    }
}