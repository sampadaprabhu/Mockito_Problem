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

    @Test
    public void customer() {
        Customer customer=new Customer("sampada","prabhu");
        EntityManager entityManager=mock(EntityManager.class);
        when(entityManager.find(Customer.class,1L)).thenReturn(customer);
        CustomerReader customerReader=new CustomerReader();
        customerReader.setEntityManager(entityManager);
        String fullName = customerReader.findFullName(1);
        Assert.assertEquals("sampada prabhu",fullName);
    }
}
