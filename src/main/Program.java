package main;

import java.util.ArrayList;
import java.util.List;

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

        User user1 = new User(1, "Ivan", 30, user1Roles);
        User user2 = new User( 2, "Dmytro", 31, user2Roles);
        User user3 = new User( 3, "Vitaliy", 33, user3Roles);
        User user4 = new User(4, "Vitaliy", 26, user4Roles);
        User user5 = new User( 5, "Andriy", 40, user5Roles);
        User user6 = new User( 6, "Taras", 25, user6Roles);
        User user7 = new User(7, "Yura", 15, user7Roles);
        User user8 = new User(8, "Ivan", 22, user8Roles);
        User user9 = new User(9, "Evgen", 19, user9Roles);


        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);

//        task1(users);
//        task2(users);
//        task3(users);
//        task4(users);
//        task5(users);
//        task6(users);
//        task7(users);
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
    private static void task5 (){

    }
    //группируйте пользователей по возрасту
    private static void task6 (){}
    //вычислить средний возраст для каждой роли Map <String, Integer>
    private static void task7 (){}
}
