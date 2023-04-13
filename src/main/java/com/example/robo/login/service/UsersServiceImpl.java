package com.example.robo.login.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;

// import org.hibernate.Session;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.robo.login.entity.User;
// import com.example.robo.login.repository.UsersRepo;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Boolean ValidateUser(User user) {

        // Session sess;

        // User userObject = sess.getClass(User.class);
        // // new User();
        // userObject.setName("karthi");
        // userObject.setUserId("23");

        return null;

    }

    @Override
    public List<User> executeCursorTypeProcedure() {

        StoredProcedureQuery procedureQuery = entityManager.createStoredProcedureQuery("cursor_type_procedure",
                User.class);
        procedureQuery.registerStoredProcedureParameter("c_users_cursor", void.class, ParameterMode.REF_CURSOR);
        procedureQuery.execute();
        List<User> resultList = procedureQuery.getResultList();

        // resultList.forEach(null);

        List<User> returnArray = new ArrayList<>();

        for (User user : resultList) {

            User value = new User();
            value.setUserName(user.getUserName());
            value.setPassword(user.getPassword());
            returnArray.add(user);
        }

        

        return returnArray;
    }
}
