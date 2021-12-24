package com.bootcamp.payten;

import com.bootcamp.payten.model.Admin;
import com.bootcamp.payten.model.User;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
//@SpringBootApplication
public class PaytenApplication {

    public static void main(String[] args) {

        User user = new User();
        user.setId(1);
        user.setName("Kutay");
        user.setSurname("Polat");
        user.setGender("Male");

        log.info("user {}", user);

        Set<Admin> adminSet = new HashSet<>();
        Admin admin = Admin.builder()
                .id(1).name("Admin1").surname("Surname1").gender("Male").age(25L)
                .build();
        Admin admin1 = Admin.builder()
                .id(2).name("Admin2").surname("Surname2").gender("Female").age(17L)
                .build();
        Admin admin2 = Admin.builder()
                .id(3).name("Admin3").surname("Surname3").gender("Male").age(28L)
                .build();
        adminSet.add(admin);
        adminSet.add(admin1);
        adminSet.add(admin2);

        List<Admin> adminBiggerThanAge = adminSet.stream().filter(f -> {
                    System.out.println(f.getName()+" age : " + f.getAge());
                    return f.getAge()> 18;
        }).collect(Collectors.toList());

        System.out.println("Size of bigger than 18: "+ adminBiggerThanAge.size());



    }

}
