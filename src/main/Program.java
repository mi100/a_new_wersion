package main;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        Role activeAdmin = new Role(1, "Admin", true, "22.10.2020", "01.05.30");
        Role inactiveAdmin = new Role(2, "Admin", false, "22.10.20", "01.05.30");
        Role activeModerator = new Role(3, "Moderator", true, "01.10.20", "01.05.30");
        Role inactiveModerator = new Role(4, "Moderator", false, "01.10.20", "01.05.30");
        Role activeUser = new Role(5, "User", true, "02.10.20", "10.05.21");
        Role inactiveUser = new Role(6, "User", false, "02.10.20", "10.05.21");

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


        Education schoolEducationOfUser1 = new SchoolEducation(
                1,
                true,
                LocalDate.of(1990, Month.SEPTEMBER, 01),
                LocalDate.of(2000, Month.JUNE, 10),
                "#32");

        Course physicsCourseOfUser1UniversityEducation = new Course(
                2, "Physics", 9);
        Course biologyCourseOfUser1UniversityEducation = new Course(
                1, "Biology", 12);
        Course mathCourseOfUser1UniversityEducation = new Course(
                3, "Math", 10);
        Course englishCourseOfUser1UniversityEducation = new Course(
                4, "English", 9);
        Course chemistryCourseOfUser1UniversityEducation = new Course(
                5, "Chemistry", 11);

        List<Course> coursesOfUser1UniversityEducation = Arrays.asList(
                biologyCourseOfUser1UniversityEducation,
                physicsCourseOfUser1UniversityEducation,
                mathCourseOfUser1UniversityEducation,
                englishCourseOfUser1UniversityEducation,
                chemistryCourseOfUser1UniversityEducation);

        Education universityEducationOfUser1 = new UniversityEducation(
                1,
                true,
                LocalDate.of(2000, Month.SEPTEMBER, 1),
                LocalDate.of(2006, Month.JUNE, 15),
                "ІКНІ",
                coursesOfUser1UniversityEducation);

        List<Education> user1Educations = new ArrayList<>();
        user1Educations.add(universityEducationOfUser1);
        user1Educations.add(schoolEducationOfUser1);

        Education schoolEducationOfUser2 = new SchoolEducation(
                2,
                true,
                LocalDate.of(1995, Month.SEPTEMBER, 1),
                LocalDate.of(2010, Month.MAY, 25),
                "#36");

        Course psychologyCourseOfUser2UniversityEducation = new Course(
                1, "Physics", 1);
        Course cookingCourseOfUser2UniversityEducation = new Course(
                2, "Biology", 2);
        Course financialAccountingOfUser2UniversityEducation = new Course(
                3, "financialAccounting", 8);
        Course managementCourseOfUniversityEducation = new Course(
                4, "Management", 10);

        List<Course> coursesOfUser2UniversityEducation = new ArrayList<>();
        coursesOfUser2UniversityEducation.add(psychologyCourseOfUser2UniversityEducation);
        coursesOfUser2UniversityEducation.add(cookingCourseOfUser2UniversityEducation);
        coursesOfUser2UniversityEducation.add(financialAccountingOfUser2UniversityEducation);
        coursesOfUser2UniversityEducation.add(managementCourseOfUniversityEducation);

        Education universityEducationOfUser2 = new UniversityEducation(
                2,
                true,
                LocalDate.of(2010, Month.SEPTEMBER, 1),
                LocalDate.of(2016, Month.APRIL, 20),
                "ONAPT",
                coursesOfUser2UniversityEducation);

        List<Education> user2Educations = new ArrayList<>();
        user2Educations.add(schoolEducationOfUser2);
        user2Educations.add(universityEducationOfUser2);


        Education schoolEducationOfUser3 = new SchoolEducation(
                3,
                false,
                LocalDate.of(2000, Month.SEPTEMBER, 1),
                LocalDate.of(2005, Month.JUNE, 5),
                "#50");

        List<Education> user3Educations = new ArrayList<>();
        user3Educations.add(schoolEducationOfUser3);

        Education schoolEducationOfUser4 = new SchoolEducation(
                4,
                true,
                LocalDate.of(1980, Month.SEPTEMBER, 1),
                LocalDate.of(1990, Month.JUNE, 10),
                "45");

        Course englishCourseOfUser4UniversityEducation = new Course(
                1, "English", 12);
        Course mathematicsCourseOfUser4UniversityEducation = new Course(
                2, "Mathematics", 11);
        Course physicsCourseOfUser4UniversityEducation = new Course(
                3, "Physics", 11);

        List<Course> coursesOfUser4UniversityEducations = new ArrayList<>();
        coursesOfUser4UniversityEducations.add(englishCourseOfUser4UniversityEducation);
        coursesOfUser4UniversityEducations.add(mathematicsCourseOfUser4UniversityEducation);
        coursesOfUser4UniversityEducations.add(physicsCourseOfUser4UniversityEducation);

        Education universityEducationOfUser4 = new UniversityEducation(
                4, true,
                LocalDate.of(1990, Month.SEPTEMBER, 1),
                LocalDate.of(1996, Month.MAY, 5),
                "Polytechnic",
                coursesOfUser4UniversityEducations);

        List<Education> user4Educations = new ArrayList<>();
        user4Educations.add(schoolEducationOfUser4);
        user4Educations.add(universityEducationOfUser4);

        Education schoolEducationOfUser5 = new SchoolEducation(
                5,
                true,
                LocalDate.of(2010, Month.SEPTEMBER, 1),
                LocalDate.of(2023, Month.JUNE, 25),
                "100");

        Course psychologyUniversityEducationOfUser5 = new Course(
                1, "Psychology", 9);
        Course chemistryUniversityEducationOfUser5 = new Course(
                2, "Chemistry", 10);
        Course biologyUniversityEducationOfUser5 = new Course(
                3, "Biology", 11);
        List<Course> coursesOfUser5UniversityEducation = new ArrayList<>();
        coursesOfUser5UniversityEducation.add(psychologyUniversityEducationOfUser5);
        coursesOfUser5UniversityEducation.add(chemistryUniversityEducationOfUser5);
        coursesOfUser5UniversityEducation.add(biologyUniversityEducationOfUser5);

        Education universityEducationOfUser5 = new UniversityEducation(
                5,
                true,
                LocalDate.of(2018, Month.SEPTEMBER, 1),
                LocalDate.of(2021, Month.JUNE, 10),
                "Medical",
                coursesOfUser5UniversityEducation);

        List<Education> user5Educations = new ArrayList<>();
        user5Educations.add(schoolEducationOfUser5);
        user5Educations.add(universityEducationOfUser5);


        Education schoolEducationOfUser6 = new SchoolEducation(
                6,
                false,
                LocalDate.of(2000, Month.SEPTEMBER, 1),
                LocalDate.of(2005, Month.FEBRUARY, 20),
                "#10");
        Education school1EducationOfUser6 = new SchoolEducation(
                6,
                false,
                LocalDate.of(2005, Month.FEBRUARY, 28),
                LocalDate.of(2009, Month.NOVEMBER, 15),
                "#59");
        Education school2EducationOfUser6 = new SchoolEducation(
                6,
                true,
                LocalDate.of(2009, Month.NOVEMBER, 30),
                LocalDate.of(2011, Month.MAY, 15),
                "#22");
        Course armyUniversityEducationOfUser6 = new Course(
                1, "Army", 10);
        List<Course> coursesOfUser6UniversityEducation = new ArrayList<>();
        coursesOfUser6UniversityEducation.add(armyUniversityEducationOfUser6);

        Education universityEducationOfUser6 = new UniversityEducation(
                6,
                true,
                LocalDate.of(2011, Month.MAY, 25),
                LocalDate.of(2014, Month.DECEMBER, 25),
                "VDV",
                coursesOfUser6UniversityEducation);
        List<Education> user6Educations = new ArrayList<>();
        user6Educations.add(schoolEducationOfUser6);
        user6Educations.add(school1EducationOfUser6);
        user6Educations.add(school2EducationOfUser6);
        user6Educations.add(universityEducationOfUser6);

        Education schoolEducationOfUser7 = new SchoolEducation(
                7,
                false,
                LocalDate.of(2010, Month.DECEMBER, 1),
                LocalDate.of(2015, Month.MARCH, 2),
                "#55");
        List<Education> user7Educations = new ArrayList<>();
        user7Educations.add(schoolEducationOfUser7);

        Education schoolEducationOfUser8 = new SchoolEducation(
                8,
                true,
                LocalDate.of(1995, Month.DECEMBER, 1),
                LocalDate.of(2007, Month.JUNE, 10),
                "#63");
        Course managementUniversityEducationOfUser8 = new Course(
                1, "Management", 10);
        Course financialAccountingUniversityEducationOfUser8 = new Course(
                2, "Financial Accounting", 10);
        Course psychologyUniversityEducationOfUser8 = new Course(
                3, "Psychology", 10);
        List<Course> coursesOfUser8UniversityEducation = new ArrayList<>();
        coursesOfUser8UniversityEducation.add(managementUniversityEducationOfUser8);
        coursesOfUser8UniversityEducation.add(financialAccountingUniversityEducationOfUser8);
        coursesOfUser8UniversityEducation.add(psychologyUniversityEducationOfUser8);

        Education universityEducationOfUser8 = new UniversityEducation(
                8,
                false,
                LocalDate.of(2007, Month.MARCH, 1),
                LocalDate.of(2009, Month.APRIL, 4),
                "KommersiaUniversity",
                coursesOfUser8UniversityEducation);

        List<Education> user8Educations = new ArrayList<>();
        user8Educations.add(schoolEducationOfUser8);
        user8Educations.add(universityEducationOfUser8);

        Education schoolEducationOfUser9 = new SchoolEducation(
                9,
                true,
                LocalDate.of(2000, Month.DECEMBER, 1),
                LocalDate.of(2010, Month.MAY, 15),
                "20");
        Course chemistryCourseOfUser9UniversityEducations = new Course(
                1, "Chemistry", 8);
        Course englishCourseOfUser9UniversityEducations = new Course(
                2, "English", 10);
        Course biologyCourseOfUser9UniversityEducation = new Course(
                3, "Biology", 9);
        Course mathematicsCourseOfUser9UniversityEducation = new Course(
                4, "Mathematics", 11);
        Course physicsCourseOfUser9UniversityEducation = new Course(
                5, "Physics", 10);
        Course psychologyCourseOfUser9UniversityEducation = new Course(
                6, "Psychology", 8);
        List<Course> coursesOfUser9UniversityEducation = new ArrayList<>();
        coursesOfUser9UniversityEducation.add(chemistryCourseOfUser9UniversityEducations);
        coursesOfUser9UniversityEducation.add(englishCourseOfUser9UniversityEducations);

        List<Course> coursesOfUser9University1Education = new ArrayList<>();
        coursesOfUser9University1Education.add(biologyCourseOfUser9UniversityEducation);
        coursesOfUser9University1Education.add(mathematicsCourseOfUser9UniversityEducation);

        List<Course> coursesOfUser9University2Education = new ArrayList<>();
        coursesOfUser9University2Education.add(physicsCourseOfUser9UniversityEducation);
        coursesOfUser9University2Education.add(physicsCourseOfUser9UniversityEducation);

        Education universityEducationOfUser9 = new UniversityEducation(
                9,
                false,
                LocalDate.of(2010, Month.DECEMBER, 1),
                LocalDate.of(2015, Month.JUNE, 10),
                "Polytechnic",
                coursesOfUser9UniversityEducation);
        Education university1EducationOfUser9 = new UniversityEducation(
                9,
                true,
                LocalDate.of(2016, Month.DECEMBER, 1),
                LocalDate.of(2020, Month.JUNE, 10),
                "Franka",
                coursesOfUser9University1Education);
        Education university2EducationOfUser9 = new UniversityEducation(
                9,
                false,
                LocalDate.of(2022, Month.DECEMBER, 1),
                LocalDate.of(2025, Month.JUNE, 10),
                "Polytechnic",
                coursesOfUser9University2Education);

        List<Education> user9Educations = new ArrayList<>();
        user9Educations.add(schoolEducationOfUser9);
        user9Educations.add(universityEducationOfUser9);
        user9Educations.add(university1EducationOfUser9);
        user9Educations.add(university2EducationOfUser9);


        User user1 = new User(1, "Ivan", 30, user1Roles, Gender.MALE, user1Educations);
        User user2 = new User(2, "Dmytro", 31, user2Roles, Gender.MALE, user2Educations);
        User user3 = new User(3, "Vitaliy", 33, user3Roles, Gender.MALE, user3Educations);
        User user4 = new User(4, "Vitaliy", 26, user4Roles, Gender.MALE, user4Educations);
        User user5 = new User(5, "Andriy", 40, user5Roles, Gender.MALE, user5Educations);
        User user6 = new User(6, "Taras", 25, user6Roles, Gender.MALE, user6Educations);
        User user7 = new User(7, "Iryna", 15, user7Roles, Gender.FEMALE, user7Educations);
        User user8 = new User(8, "Khrystyna", 22, user8Roles, Gender.FEMALE, user8Educations);
        User user9 = new User(9, "Natali", 19, user9Roles, Gender.FEMALE, user9Educations);


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
//        task6_2(users);
//        task7(users);
//        task8(users);
//        task9(users);
//        task10_1(users);
//        task10_2(users);
//        task11(users);
//        task12(users);
//        task13(users);
//        task14(users);
//        task15(users);
//        task16(users);
//        task17(users);
//        task18(users);
//        task19(users);
//        task20(users);
//        task21(users);
        task22(users);

        // ввести новий енам - Стать (чоловык ы жынка),ok
        // вводимо новий обэкт освіта,ok
        //в юзера буде лыст освыт,ok
        // в освыты буде тип (середня вища),ok
        // кожен тип це новий клас якицй наслыдуэться выд освыти,ok
        // в середный буде назва школи, статус (закынчили чи ны),  дата початку ы кынця,ok
        // в вищый то саме але ще ы спецыалызыя а ще і список предметів з балом за кожен екзамен,ok


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


    //знайти неосвыдчених людей
    private static void task8(List<User> users) {
//        проітеруватись по юзерам
        List<User> notEducatedUsers = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            boolean isEducated = false;
            List<Education> educations = user.getEducations();
            for (Education education : educations) {
                boolean finished = education.isFinished();
                if (finished) {
                    isEducated = true;
                    break;
                }
            }

            if (!isEducated) {
                notEducatedUsers.add(user);
            }
        }

        System.out.println(notEducatedUsers);
//                отримати освіту юзера
//                отримати поле про статус овіти
//                вивести юзера без освіти
    }

    // знайти хто не закінчив школу
    private static void task9(List<User> users) {
        List<User> usersWhoHasNotFinishedSchool = new ArrayList<>();
        for (User user : users) {
            boolean finishedSchool = false;
            List<Education> educations = user.getEducations();
            for (Education education : educations) {
                if (education instanceof SchoolEducation) {
                    if (education.isFinished()) {
                        finishedSchool = true;
                        break;
                    }
                }
            }
            if (!finishedSchool) {
                usersWhoHasNotFinishedSchool.add(user);
            }
        }
        System.out.println(usersWhoHasNotFinishedSchool);


//        for(User user : usersWhoHasNotFinishedSchool){
//            System.out.println(user.getName() + " has not finished school");
//        }
    }

    // хто закінчив школу але не поступив
    public static void task10_1(List<User> users) {
        List<User> usersWhoFinishedSchool = new ArrayList<>();
        for (User user : users) {
            for (Education education : user.getEducations()) {
                if (education instanceof SchoolEducation) {
                    if (education.isFinished()) {
                        usersWhoFinishedSchool.add(user);
                        break;
                    }
                }

            }
        }
        List<User> usersWhoDidNotWentToUniversity = new ArrayList<>();
        for (User user : usersWhoFinishedSchool) {
            boolean wentToUniversity = false;
            for (Education education : user.getEducations()) {
                if (education instanceof UniversityEducation) {
                    wentToUniversity = true;
                    break;
                }
            }

            if (!wentToUniversity) {
                usersWhoDidNotWentToUniversity.add(user);
            }
        }
        System.out.println(usersWhoDidNotWentToUniversity);
    }

    public static void task10_2(List<User> users) {
        List<User> usersWhoFinishedSchoolButDidNotWentToUniverstity = new ArrayList<>();
        for (User user : users) {
            boolean finishedSchool = false, enteredHighSchool = false;
            for (Education education : user.getEducations()) {
                if (education instanceof SchoolEducation) {
                    if (education.isFinished()) {
                        finishedSchool = education.isFinished();
                    }
                } else if (education instanceof UniversityEducation) {
                    enteredHighSchool = true;
                }
            }
            if (finishedSchool && !enteredHighSchool) {
                usersWhoFinishedSchoolButDidNotWentToUniverstity.add(user);
            }
        }
        System.out.println(usersWhoFinishedSchoolButDidNotWentToUniverstity);
    }

    // хто кинув уніер
    public static void task11(List<User> users) {
        List<User> usersWhoIsNotFinishedUniversityEducation = new ArrayList<>();
        for (User user : users) {
            List<Education> educations = user.getEducations();
            for (Education education : educations) {
                if (education instanceof UniversityEducation) {
                    if (!education.isFinished()) {
                        usersWhoIsNotFinishedUniversityEducation.add(user);
                        break;
                    }
                }
            }
        }
        System.out.println(usersWhoIsNotFinishedUniversityEducation);
    }

    // хто закінчив універ
    public static void task12(List<User> users) {
        List<User> userWhoFinishedUniversity = new ArrayList<>();
        for (User user : users) {
            for (Education education : user.getEducations()) {
                if (education instanceof UniversityEducation) {
                    if (education.isFinished()) {
                        userWhoFinishedUniversity.add(user);
                        break;
                    }
                }
            }

        }
        System.out.println(userWhoFinishedUniversity);

        for (User user : userWhoFinishedUniversity) {
            System.out.println(user.getName() + " finished university");
        }


    }

    // хто закінчив кафедру ІКНІ і при цьому вчився в 32 школі
    public static void task13(List<User> users) {
        List<User> usersWhoFinishedScohool32AndIKNIUniversity = new ArrayList<>();
        for (User user : users) {
            boolean isFinishedSchool32 = false;
            boolean isFinishedUiversityІКНІ = false;
            for (Education education : user.getEducations()) {
                if (education instanceof SchoolEducation) {
                    String name = ((SchoolEducation) education).getName();
                    if ("#32".equals(name)) {
                        isFinishedSchool32 = true;
                    }
                } else if (education instanceof UniversityEducation) {
                    if (education.isFinished()) {
                        String name = ((UniversityEducation) education).getName();
                        if ("ІКНІ".equals(name)) {
                            isFinishedUiversityІКНІ = true;
                        }
                    }
                }
            }

            if (isFinishedSchool32 && isFinishedUiversityІКНІ) {
                usersWhoFinishedScohool32AndIKNIUniversity.add(user);
            }
        }
        System.out.println(usersWhoFinishedScohool32AndIKNIUniversity);
    }

    // хто закінчив франика в середнім балом бльше 80
    public static void task14(List<User> users) {
        List<User> usersWhoFinishedFrankaUniversityWithAvgScoregt3 = new ArrayList<>();
        for (User user : users) {
            for (Education education : user.getEducations()) {
                if (education.isFinished() &&
                        education instanceof UniversityEducation &&
                        "Franka".equals(((UniversityEducation) education).getName())
                ) {
                    List<Course> courses = ((UniversityEducation) education).getCourses();
                    double avgScore = 0;
                    for (Course course : courses) {
                        avgScore += course.getGrade();
                    }
                    avgScore /= courses.size();

                    if (avgScore > 3) {
                        usersWhoFinishedFrankaUniversityWithAvgScoregt3.add(user);

                    }
                }
            }

        }
        System.out.println(usersWhoFinishedFrankaUniversityWithAvgScoregt3);
    }

    // хто випустився в коронавірусний рік з універу лісотехнічного
    public static void task15(List<User> users) {
        List<User> usersWhoFinishedMedicalUniversityInTheCOVIDYear = new ArrayList<>();
        for (User user : users) {
            for (Education education : user.getEducations()) {
                if (education.isFinished() &&
                        education instanceof UniversityEducation &&
                        "Medical".equals(((UniversityEducation) education).getName())
                ) {
                    LocalDate educatedAt = education.getEnd();
                    int year = educatedAt.getYear();
                    if (year == 2021) {
                        usersWhoFinishedMedicalUniversityInTheCOVIDYear.add(user);
                    }
                }
            }

        }
        System.out.println(usersWhoFinishedMedicalUniversityInTheCOVIDYear);

        for (User user : usersWhoFinishedMedicalUniversityInTheCOVIDYear) {
            System.out.println(user.getName() + " finished university in 2020");
        }

    }

    // хто закычив унывер екстерном
    public static void task16(List<User> users) {
        List<User> userWhoFinishedUniversity = new ArrayList<>();
        for (User user : users) {
            for (Education education : user.getEducations()) {
                if (education instanceof UniversityEducation) {
                    if (education.isFinished()) {
                        LocalDate start = education.getStart();
                        LocalDate end = education.getEnd();

                        int startYear = start.getYear();
                        int endYear = end.getYear();

                        int educationDuration = endYear - startYear;

                        if (educationDuration < 4) {
                            userWhoFinishedUniversity.add(user);
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(userWhoFinishedUniversity);

        for (User user : userWhoFinishedUniversity) {
            System.out.println(user.getName() + " finished university");
        }
    }

    // хто переводився зі школи до школи
    public static void task17(List<User> users) {
        List<User> usersWhoTransferredFromSchoolToSchool = new ArrayList<>();
        for (User user : users) {
            boolean transferredFromSchoolToSchool = false;
            boolean leftOneSchool = false;
            int numberOfSchools = 0;
            for (Education education : user.getEducations()) {
                if (education instanceof SchoolEducation) {
                    numberOfSchools++;

                    if (!education.isFinished()) {
                        leftOneSchool = true;
                    }
                }
            }

            transferredFromSchoolToSchool = leftOneSchool && numberOfSchools > 1;

            if (transferredFromSchoolToSchool) {
                usersWhoTransferredFromSchoolToSchool.add(user);
            }
        }
        System.out.println(usersWhoTransferredFromSchoolToSchool);

        for (User user : usersWhoTransferredFromSchoolToSchool) {
            System.out.println(user.getName() + " Transferred from School to School");
        }

    }

    // середню кількість вищих освіт в залежності від статі
    public static void task18(List<User> users) {
        int numberOfUniversityEducationsOfMales = 0;
        int numberOfUniversityEducationsOfFemales = 0;
        int numberOfMales = 0;
        int numberOfFemales = 0;

        for (User user : users) {
            switch (user.getGender()) {
                case MALE:
                    numberOfMales++;
                    break;
                case FEMALE:
                    numberOfFemales++;
                    break;
            }

            for (Education education : user.getEducations()) {
                if (education instanceof UniversityEducation) {
                    if (education.isFinished()) {
                        if (user.getGender() == Gender.MALE) {
                            numberOfUniversityEducationsOfMales++;
                        } else if (user.getGender() == Gender.FEMALE) {
                            numberOfUniversityEducationsOfFemales++;
                        }
                    }
                }
            }
        }

        double avgNumberOfMalesUniversityEducations = (double) numberOfUniversityEducationsOfMales / numberOfMales;
        double avgNumberOfFemalesUniversityEducations = numberOfUniversityEducationsOfFemales / numberOfFemales;

        System.out.println(avgNumberOfFemalesUniversityEducations + "Average Female University");
        System.out.printf("%.2f Average Male University", avgNumberOfMalesUniversityEducations);


    }

    // яку стать частіше виганяли з школи в кожному році
    public static void task19(List<User> users) {
        Map<Education, User> notFinishedSchoolEducationPerUser = new HashMap<>();
        for (User user : users) {
            for (Education education : user.getEducations()) {
                if (education instanceof SchoolEducation && !education.isFinished()) {
                    notFinishedSchoolEducationPerUser.put(education, user);
                }
            }
        }

        //Map<YEAR, Map<GENDER, NUMBER_LEFT_SCHOOL>>
        Map<Integer, Map<Gender, Integer>> temp = new HashMap<>();
        for (Education nonFinishedEducation : notFinishedSchoolEducationPerUser.keySet()) {
            Gender gender = notFinishedSchoolEducationPerUser.get(nonFinishedEducation).getGender();
            int yearLeftSchool = nonFinishedEducation.getEnd().getYear();

            Map<Gender, Integer> genderIntegerMap = temp.get(yearLeftSchool);
            if (genderIntegerMap == null) {
                genderIntegerMap = new HashMap<>();
                temp.put(yearLeftSchool, genderIntegerMap);
            }
            Integer numberOfUsersTransfers = genderIntegerMap.get(gender);
            if (numberOfUsersTransfers == null) {
                numberOfUsersTransfers = 0;
            }
            numberOfUsersTransfers++;
            genderIntegerMap.put(gender, numberOfUsersTransfers);
        }

        Map<Integer, Gender> result = new HashMap<>();
        for (Integer year : temp.keySet()) {
            Map<Gender, Integer> genderIntegerMap = temp.get(year);

            Integer malesLeftSchool = genderIntegerMap.get(Gender.MALE);
            if (malesLeftSchool == null) {
                malesLeftSchool = 0;
            }
            Integer femalesLeftSchool = genderIntegerMap.get(Gender.FEMALE);
            if (femalesLeftSchool == null) {
                femalesLeftSchool = 0;
            }

            if (malesLeftSchool > femalesLeftSchool) {
                result.put(year, Gender.MALE);
            } else {
                result.put(year, Gender.FEMALE);
            }
        }
        System.out.println(result);
    }

    //     з якого курсу найчастыше виганяють студентыв
    private static void task20(List<User> users) {
        Map<Long, Integer> result = new HashMap<>();
//        отримити список юзерыв
        for (User user : users) {
//            тримати список уныверситецьких освыт освыт
            for (Education education : user.getEducations()) {
//                перевырити хто не закынчив уныверситет
                if (education instanceof UniversityEducation && !education.isFinished()) {
                    LocalDate start = education.getStart();
                    LocalDate end = education.getEnd();

                    long course = Period.between(start, end).get(ChronoUnit.YEARS);

                    Integer numberOfFires = result.get(course);
                    if (numberOfFires == null) {
                        numberOfFires = 0;
                    }
                    numberOfFires++;

                    result.put(course, numberOfFires);
                }
            }
        }
        System.out.println(result);
    }

    //     визначити середный бал для кожного предмету
    public static void task21(List<User> users) {
        Map<String, List<Long>> result = new HashMap<>();

        for (User user : users) {
            for (Education education : user.getEducations()) {
                if (education instanceof UniversityEducation && education.isFinished()) {

                    for (Course courses : ((UniversityEducation) education).getCourses()) {
                        String name = courses.getName();
                        long grade = courses.getGrade();

//                        зібрати в ліст лонгів всі оцінки по предмету з кожкого юзера (в одноого предмету багато оцінок)
                        List<Long> grades = result.get(name);
                        if (grades == null) {
                            grades = new ArrayList<>();
                            result.put(name, grades);
                        }
                        grades.add(grade);
                    }
                }
            }
        }

        Map<String, Long> avgGradePerCourse = new HashMap<>();
        for (String name : result.keySet()) {
            List<Long> grades = result.get(name);

            long sum = 0;
            for (Long grade : grades) {
                sum += grade;
            }
            long avgGrade = sum / grades.size();

            avgGradePerCourse.put(name, avgGrade);


        }

        System.out.println(avgGradePerCourse);

    }

    //     визначити найбыльш популярний предмет для кожноъ статы
    public static void task22(List<User> users) {
        Map<Gender, List<String>> result = new HashMap<>();
        for (User user : users) {
            Gender gender = user.getGender();
            List<String> courseNames = new ArrayList<>();
            for (Education education : user.getEducations()) {
                if (education instanceof UniversityEducation) {
                    List<Course> courses = ((UniversityEducation) education).getCourses();
                    for (Course course : courses) {
                        String name = course.getName();
                        courseNames.add(name);
                    }
                }
            }

            List<String> courseNamesPerGender = result.get(gender);
            if (courseNamesPerGender == null) {
                courseNamesPerGender = new ArrayList<>();
                result.put(gender, courseNamesPerGender);
            }

            courseNamesPerGender.addAll(courseNames);
        }

        Map<Gender, String> mostPopularCoursePerGender = new HashMap<>();
        for (Gender gender : result.keySet()) {
            Map<String, Integer> numberOfOcurenses = new HashMap<>();

            List<String> courses = result.get(gender);
            for (String course : courses) {
                Integer frequency = numberOfOcurenses.get(course);
                if (frequency == null) {
                    frequency = 0;
                }
                frequency++;
                numberOfOcurenses.put(course, frequency);
            }

            String potentiallyMostPopularCourse = null;
            Integer frequencyOfPotentiallyMostPopularCourse = null;

            for (String course : numberOfOcurenses.keySet()) {
                Integer frequency = numberOfOcurenses.get(course);
                
                if(potentiallyMostPopularCourse == null || frequency > frequencyOfPotentiallyMostPopularCourse){
                    potentiallyMostPopularCourse = course;
                    frequencyOfPotentiallyMostPopularCourse = frequency;
                }
            }
            mostPopularCoursePerGender.put(gender, potentiallyMostPopularCourse);

        }
        System.out.println(mostPopularCoursePerGender);
    }



//     визначити найбыльш якысно ваклоадаэмий предмет в кожному вузы
//     почитати Ы ЗРОЗУМЫТИ!!

//     ! рызницю мыж рызними типами мап

//     чому в хешмапі в якості ключа не варто використовувати змінний обєкт; String s = "Ivan"; s.substring(1, 3)
    /*
    * Map<User, Integer> agesByUser = new HashMap...
    * User u = new ....,age=18,...
    *
    * agesByUser.put(u,
    *
    *
    *
    *
    *
    *
    * u.getAge())
    *
    *  // u.setName("new namgfhfhhgdhge")
    *
    * agesByUser.get(u) == 18 // 15/16 => false а чому саме 15/16
    *
    * */

    //

}












