package com.mockito;

public class CustomerReader {
    private EntityManager entityManager;

    public void setEntityManager(EntityManager manager){
        this.entityManager=manager;
    }

    public String findFullName(long id){
        Customer customer=this.entityManager.find(Customer.class,id);
        return customer.firstName +" "+customer.lastName;
    }
}
