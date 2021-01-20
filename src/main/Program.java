package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        Role activeAdmin = new Role(1, "Admin", true, "22.10.2020", "01.05.30");
        Role inactiveAdmin = new Role(2, "Admin", false,"22.10.20", "01.05.30");
        Role activeModerator = new Role(3, "Moderator", true,"01.10.20", "01.05.30");
        Role inactiveModerator = new Role(4, "Moderator", false,"01.10.20", "01.05.30");
        Role activeUser = new Role(5, "User", true,"02.10.20", "10.05.21");
        Role inactiveUser = new Role(6, "User", false,"02.10.20", "10.05.21");

        List<Role> user1Roles = new ArrayList<>();
        user1Roles.add(activeAdmin);
        user1Roles.add(activeUser);

        List<Role> user2Roles = new ArrayList<>();
        user2Roles.add(inactiveAdmin);
        user2Roles.add(inactiveModerator);

        List<Role> user3Roles = new ArrayList<>();
        user3Roles.add(activeUser);
        user3Roles.add(activeAdmin);
        user3Roles.add(inactiveModerator);

        List<Role> user4Roles = new ArrayList<>();
        user4Roles.add(inactiveUser);
        user4Roles.add(inactiveModerator);
        user4Roles.add(activeAdmin);

        List<Role> user5Roles = new ArrayList<>();
        user5Roles.add(activeModerator);
        user5Roles.add(inactiveUser);

        List<Role> user6Roles = new ArrayList<>();
        user6Roles.add(activeModerator);
        user6Roles.add(activeAdmin);
        user6Roles.add(activeUser);

        List<Role> user7Roles = new ArrayList<>();
        user7Roles.add(activeUser);

        List<Role> user8Roles = new ArrayList<>();
        user8Roles.add(inactiveAdmin);
        user8Roles.add(inactiveModerator);
        user8Roles.add(inactiveUser);

        List<Role> user9Roles = new ArrayList<>();
        user9Roles.add(activeModerator);

        /* Чи правельно я пишу?????
            Якщо так, де мены тепер прописати дані про навчаня бо я запутався!!!!!
            */
        Education highSchool = new Education(1, "#32");
        Education university = new Education(2, "Polytechnic");

        List<Education> user1Educations = new ArrayList<>();
        user1Educations.add(highSchool);
        user1Educations.add(university);

        User user1 = new User(1, "Ivan", 30, user1Roles, "male", user1Educations);
//        User user2 = new User( 2, "Dmytro", 31, user2Roles, "male", user2Educations);
//        User user3 = new User( 3, "Vitaliy", 33, user3Roles, "male", user3Educations);
//        User user4 = new User(4, "Vitaliy", 26, user4Roles, "male", user4Educations);
//        User user5 = new User( 5, "Andriy", 40, user5Roles, "male", user5Educations);
//        User user6 = new User( 6, "Taras", 25, user6Roles,"male", user6Educations);
//        User user7 = new User(7, "Iryna", 15, user7Roles, "female", user7Educations);
//        User user8 = new User(8, "Khrystyna", 22, user8Roles, "female", user8Educations);
//        User user9 = new User(9, "Natali", 19, user9Roles, "female", user9Educations);


        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
//        users.add(user5);
//        users.add(user6);
//        users.add(user7);
//        users.add(user8);
//        users.add(user9);

//        task1(users);
//        task2(users);
//        task3(users);
//        task4(users);
//        task5(users);
//        task6(users);
//        task6_2(users);
//        task7(users);


        // ввести новий енам - Стать (чоловык ы жынка),ok
        // вводимо новий обэкт освіта,ok
        //в юзера буде лыст освыт
        // в освыты буде тип (середня вища),ok
        // кожен тип це новий клас якицй наслыдуэться выд освыти,ok
        // в середный буде назва школи, статус (закынчили чи ны),  дата початку ы кынця,ok
        // в вищый то саме але ще ы спецыалызыя а ще і список предметів з балом за кожен екзамен,ok
        //
        // знайти неосвыдчених людей
        // знайти хто не закінчив школу
        // хто закінчив школу але не поступив
        // хто кинув уніер
        // хто закінчив універ
        // хто закінчив кафедру ІКНІ і при цьому вчився в 32 школі
        // хто закінчив франика в середнім балом бльше 80
        // хто випустився в коронавірусний рік з універу лісотехнічного
        // хто переводився зі школи до школи
        // середню кількість вищих освіт в залежності від статі
        // кого частіше виганяли з школи в кожному році
        //
    }

    private static void task1(List<User> users){
        List<String> names = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            User user = users.get(i);
            String name = user.getName();
            if (!names.contains(name)){
                names.add(name);
            }

        }
        System.out.println(names);
    }

    private static void task2(List<User> users) {
        List<User> fullAgeUsers = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            Integer age = user.getAge();
            if (age >= 18) {
                fullAgeUsers.add(user);
            }
        }

        System.out.println(fullAgeUsers);
    }
    //получить список активных пользователей
    public static void task3(List<User> users) {
        List<User> activeRoleUsers = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
//            Boolean active = user.getRole();
            List<Role> roles = user.getRoles();
            for (int j = 0; j < roles.size(); j++) {
                Role role = roles.get(j);
                boolean active = role.isActive();
                if (active == true) {
                    activeRoleUsers.add(user);
                }
            }
        }
        System.out.println(activeRoleUsers);
    }
    //найдите самого старого админа
    private static void task4 (List<User> users){
        User oldestAdmin = null;
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            List<Role> roles = user.getRoles();
            for (int j = 0; j < roles.size(); j++) {
                Role role = roles.get(j);
                String name = role.getName();
                if (name == "Admin"){
                    if(oldestAdmin == null){
                        oldestAdmin = user;
                    }else {
                        if (user.getAge() > oldestAdmin.getAge()) {
                            oldestAdmin = user;
                        }
                    }
                }
            }
        }
        System.out.println(oldestAdmin);
    }
    //найдите первого активного администратора (по самому старому полю role.startDate)
    private static void task5 (List<User> users){
        Map<User, String> datesPerUser = new HashMap<>();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            List<Role> roles = user.getRoles();
            for (int j = 0; j < roles.size(); j++) {
                Role role = roles.get(j);
                String name = role.getName();
                if (name == "Admin") {
                    datesPerUser.put(user, role.getStartDate());
                }
            }
        }

        User firstActiveAdmin = null;
        for(User user : datesPerUser.keySet()){
            if (firstActiveAdmin == null) {
                firstActiveAdmin = user;
                continue;
            }

            String userStartDate = datesPerUser.get(user);
            String firstActiveAdminStartDate = datesPerUser.get(firstActiveAdmin);
            if (userStartDate.compareTo(firstActiveAdminStartDate) < 0) {
                firstActiveAdmin = user;
            }
        }


//        for (int i = 0; i < users.size(); i++) {
//            User user = users.get(i);
//            List<Role> roles = user.getRoles();
//            for (int j = 0; j < roles.size(); j++) {
//                Role role = roles.get(j);
//                String name = role.getName();
//                if (name == "Admin"){
//                    if (firstActiveAdmin == null) {
//                        firstActiveAdmin = user;
//                    }
//
//                    String userStartDate = role.getStartDate();
//                    if (userStartDate == null) {
//                        firstActiveAdmin = user;
//                    } else {
//                        List<Role> firstActiveAdminRoles = firstActiveAdmin.getRoles();
//                        String firstActiveAdminStartDate = null;
//                        for (int k = 0; k < firstActiveAdminRoles.size(); k++) {
//                            Role firstActiveAdminRole = firstActiveAdminRoles.get(k);
//                            String firstActiveAdminRoleName = firstActiveAdminRole.getName();
//                            if("Admin".equals(firstActiveAdminRoleName)){
//                                firstActiveAdminStartDate = firstActiveAdminRole.getStartDate();
//                            }
//                        }
//
//                        if (userStartDate.compareTo(firstActiveAdminStartDate) < 0) {
//                            firstActiveAdmin = user;
//                        }
//                    }
//                }
//            }
//        }
        System.out.println(firstActiveAdmin);
    }
    //группируйте пользователей по возрасту

    // user18 user90 user5 user18 user5
    private static void task6 (List<User> users){
        Map<Integer, List<User>> usersByAge = new HashMap<>();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            int age = user.getAge();

            List<User> usersWithSameAge = new ArrayList<>();
            for (int j = 0; j < users.size(); j++) {
                User user1 = users.get(j);
                if (user1.getAge() == age){
                    usersWithSameAge.add(user1);
                }
            }

            usersByAge.put(age, usersWithSameAge);
        }
        System.out.println(usersByAge);
    }

    private static void task6_2 (List<User> users){
        Map<Integer, List<User>> usersByAge = new HashMap<>();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            int age = user.getAge();

            List<User> usersWithSameAge = usersByAge.get(age);
            if(usersWithSameAge == null){
                usersWithSameAge = new ArrayList<>();
                usersByAge.put(age, usersWithSameAge);
            }
            usersWithSameAge.add(user);
        }
        System.out.println(usersByAge);
    }

    //вычислить средний возраст для каждой роли Map <String, Integer>
    // {USER: 18, ADMIN: 50, MODERATOR: 42}
    private static void task7 (List<User> users){
        Map<String, List<User>> usersByRole = new HashMap<>();
        // fill this map
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            List<Role> roles = user.getRoles();
            for (int j = 0; j < roles.size(); j++) {
                Role role = roles.get(j);
                String roleName = role.getName();
                List<User> usersPerRole = usersByRole.get(roleName);
                if (usersPerRole == null){
                    usersPerRole = new ArrayList<>();
                    usersByRole.put(roleName, usersPerRole);
                }
                usersPerRole.add(user);
            }
        }

        Map <String, Double> avgAgeByRole = new HashMap<>();
//        calculat avg age for each list userByRole and put to avgAgeByRole
        for(String role : usersByRole.keySet()){
            List<User> usersPerRole = usersByRole.get(role);
//System.out.printf(".2f", d)
            double sumAge = 0;
            for(User user : usersPerRole){
                sumAge += user.getAge();
            }

            double avgAge = sumAge / usersPerRole.size();

            avgAgeByRole.put(role, avgAge);
        }

        System.out.println(avgAgeByRole);
    }
}
