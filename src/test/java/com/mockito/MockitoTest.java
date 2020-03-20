package com.mockito;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;

public class MockitoTest {
    @Mock
    Database database;

    @Rule
    public MockitoRule mockitoRule= MockitoJUnit.rule();

    @Test
    public void testQuery() {
        ClassTest classTest=new ClassTest(database);
        when(database.query("* from classTest")).thenReturn(true);
        boolean check=classTest.query("* from classTest");
        Assert.assertTrue(check);
    }
}
