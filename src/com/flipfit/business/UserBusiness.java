package com.flipfit.business;
import com.flipfit.bean.Customer;
import com.flipfit.dao.UserDAOImpl;
import com.flipfit.bean.User;
import com.flipfit.bean.GymOwner;
public class UserBusiness implements UserBusinessInterface {
    UserDAOImpl userDao = new UserDAOImpl();
    /**
     Registers a customer in the system.
     @param customer The Customer object representing the customer data
     */
    public boolean registerCustomer(Customer customer) {
        boolean registerSuccess = false;
        registerSuccess = userDao.registerCustomer(customer);
        return registerSuccess;
    }
    /**
     Verifies a user's data.
     @param user The user object representing the user data
     @return true if the user's data are valid else returns false
     */
    public boolean authenticateUser(User user) {
        boolean authenticateSuccess = false;
        authenticateSuccess = userDao.authenticateUser(user);
        return authenticateSuccess;
    }

    public boolean editProfile(Customer customer) {
        boolean editSuccess = false;
        editSuccess = userDao.editProfile(customer);
        return editSuccess;
    }

    public boolean registerGymOwner(GymOwner gymOwner) {
        boolean registerSuccess = false;
        registerSuccess = userDao.registerGymOwner(gymOwner);
        return registerSuccess;
    }
}
