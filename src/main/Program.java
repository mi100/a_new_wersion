package main;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

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

        UniversityEducation universityEducationOfUser1 = new UniversityEducation(
                1,
                true,
                LocalDate.of(2000, Month.SEPTEMBER, 1),
                LocalDate.of(2006, Month.JUNE, 15),
                "ІКНІ",
                coursesOfUser1UniversityEducation);

        List <Education> user1Educations =new ArrayList<>();
        user1Educations.add( universityEducationOfUser1);
        user1Educations.add( schoolEducationOfUser1);

        SchoolEducation schoolEducationOfUser2 = new SchoolEducation(
                2,
                true,
                LocalDate.of(1995, Month.SEPTEMBER, 1),
                LocalDate.of(2010, Month.MAY, 25),
                "#36");

        Course psychologyCourseOfUser2UniversityEducation = new Course(
                1, "Psychology", 11);
        Course cookingCourseOfUser2UniversityEducation = new Course(
                2, "Cooking", 12);
        Course financialAccountingOfUser2UniversityEducation = new Course(
                3, "financialAccounting", 8);
        Course managementCourseOfUniversityEducation = new Course(
                4, "Management", 10);

        List<Course> coursesOfUser2UniversityEducation = new ArrayList<>();
        coursesOfUser2UniversityEducation.add(psychologyCourseOfUser2UniversityEducation);
        coursesOfUser2UniversityEducation.add(cookingCourseOfUser2UniversityEducation);
        coursesOfUser2UniversityEducation.add(financialAccountingOfUser2UniversityEducation);
        coursesOfUser2UniversityEducation.add(managementCourseOfUniversityEducation);

        UniversityEducation universityEducationOfUser2 = new UniversityEducation(
                2,
                true,
                LocalDate.of(2010, Month.SEPTEMBER, 1),
                LocalDate.of(2016, Month.APRIL, 20),
                "ONAPT",
                coursesOfUser2UniversityEducation);

        List <Education> user2Educations = new ArrayList<>();
        user2Educations.add(schoolEducationOfUser2);
        user2Educations.add(universityEducationOfUser2);


        SchoolEducation schoolEducationOfUser3 = new SchoolEducation(
                3,
                false,
                LocalDate.of(2000, Month.SEPTEMBER, 1),
                null,
                "#50");

        List <Education> user3Educations = new ArrayList<>();
        user3Educations.add(schoolEducationOfUser3);

        SchoolEducation schoolEducationOfUser4 = new SchoolEducation(
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

        UniversityEducation universityEducationOfUser4 = new UniversityEducation(
                4, true,
                LocalDate.of(1990, Month.SEPTEMBER, 1),
                LocalDate.of(1996, Month.MAY, 5),
                "Polytechnic",
                coursesOfUser4UniversityEducations);

        List<Education> user4Educations = new ArrayList<>();
        user4Educations.add(schoolEducationOfUser4);
        user4Educations.add(universityEducationOfUser4);

        SchoolEducation schoolEducationOfUser5 = new SchoolEducation(
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

        UniversityEducation universityEducationOfUser5 = new UniversityEducation(
                5,
                true,
                LocalDate.of(2023, Month.SEPTEMBER, 1),
                LocalDate.of(2030, Month.JUNE, 10),
                "MedicalUniversirty",
                coursesOfUser5UniversityEducation);

        List<Education> user5Educations = new ArrayList<>();
        user5Educations.add(schoolEducationOfUser5);
        user5Educations.add(universityEducationOfUser5);


        SchoolEducation schoolEducationOfUser6 = new SchoolEducation(
                6,
                true,
                LocalDate.of(2000, Month.SEPTEMBER, 1),
                LocalDate.of(2005, Month.FEBRUARY, 20),
                "#10");
        SchoolEducation school1EducationOfUser6 = new SchoolEducation(
                6,
                true,
                LocalDate.of(2005, Month.FEBRUARY, 28),
                LocalDate.of(2009, Month.NOVEMBER, 15),
                "#59");
        SchoolEducation school2EducationOfUser6 = new SchoolEducation(
                6,
                true,
                LocalDate.of(2009, Month.NOVEMBER, 30),
                LocalDate.of(2011, Month.MAY, 15),
                "#22");
        Course armyUniversityEducationOfUser6 = new Course(
                1, "Army", 10);
        List<Course> coursesOfUser6UniversityEducation = new ArrayList<>();
        coursesOfUser6UniversityEducation.add(armyUniversityEducationOfUser6);

        UniversityEducation universityEducationOfUser6 = new UniversityEducation(
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

        SchoolEducation schoolEducationOfUser7 = new SchoolEducation(
                7,
                false,
                LocalDate.of(2010, Month.DECEMBER, 1),
                null,
                "#55");
        List<Education> user7Educations =  new ArrayList<>();
        user7Educations.add(schoolEducationOfUser7);

       SchoolEducation schoolEducationOfUser8 = new SchoolEducation(
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

       UniversityEducation universityEducationOfUser8 = new UniversityEducation(
               8,
               true,
               LocalDate.of(2007, Month.DECEMBER, 1),
               null,
               "KommersiaUniversity",
               coursesOfUser8UniversityEducation);

       List<Education> user8Educations = new ArrayList<>();
       user8Educations.add(schoolEducationOfUser8);
       user8Educations.add(universityEducationOfUser8);

        SchoolEducation schoolEducationOfUser9 = new SchoolEducation(
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

        UniversityEducation universityEducationOfUser9 = new UniversityEducation(
                9,
                true,
                LocalDate.of(2010, Month.DECEMBER, 1),
                LocalDate.of(2015, Month.JUNE, 10),
                "Polytechnic",
                coursesOfUser9UniversityEducation);
        UniversityEducation  university1EducationOfUser9 = new UniversityEducation(
                9,
                true,
                LocalDate.of(2016, Month.DECEMBER, 1),
                LocalDate.of(2020, Month.JUNE, 10),
                "Franka",
                coursesOfUser9University1Education);
        UniversityEducation university2EducationOfUser9 = new UniversityEducation(
                9,
                true,
                LocalDate.of(2022, Month.DECEMBER, 1),
                LocalDate.of(2026, Month.JUNE, 10),
                "Polytechnic",
                coursesOfUser9University2Education);

        List<Education> user9Educations = new ArrayList<>();
        user9Educations.add(schoolEducationOfUser9);
        user9Educations.add(universityEducationOfUser9);
        user9Educations.add(university1EducationOfUser9);
        user9Educations.add(university2EducationOfUser9);




        User user1 = new User(1, "Ivan", 30, user1Roles, Gender.MALE, user1Educations);
        User user2 = new User( 2, "Dmytro", 31, user2Roles, Gender.MALE, user2Educations);
        User user3 = new User( 3, "Vitaliy", 33, user3Roles, Gender.MALE, user3Educations);
        User user4 = new User(4, "Vitaliy", 26, user4Roles, Gender.MALE, user4Educations);
        User user5 = new User( 5, "Andriy", 40, user5Roles, Gender.MALE, user5Educations);
        User user6 = new User( 6, "Taras", 25, user6Roles, Gender.MALE, user6Educations);
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
        task13(users);


        // ввести новий енам - Стать (чоловык ы жынка),ok
        // вводимо новий обэкт освіта,ok
        //в юзера буде лыст освыт,ok
        // в освыты буде тип (середня вища),ok
        // кожен тип це новий клас якицй наслыдуэться выд освыти,ok
        // в середный буде назва школи, статус (закынчили чи ны),  дата початку ы кынця,ok
        // в вищый то саме але ще ы спецыалызыя а ще і список предметів з балом за кожен екзамен,ok
        //

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
                if (finished){
                    isEducated = true;
                    break;
                }
            }

            if(!isEducated){
                notEducatedUsers.add(user);
            }
        }

        System.out.println(notEducatedUsers);
//                отримати освіту юзера
//                отримати поле про статус овіти
//                вивести юзера без освіти
    }

    // знайти хто не закінчив школу

    private static void task9(List<User> users){
        List<User> usersWhoHasNotFinishedSchool = new ArrayList<>();
        for (User user : users) {
            boolean finishedSchool = false;
            List<Education> educations = user.getEducations();
            for (Education education : educations) {
                if(education instanceof SchoolEducation){
                    if (education.isFinished()) {
                       finishedSchool = true;
                       break;
                    }
                }
            }
            if (!finishedSchool){
                usersWhoHasNotFinishedSchool.add(user);
            }
        }
        System.out.println(usersWhoHasNotFinishedSchool);


//        for(User user : usersWhoHasNotFinishedSchool){
//            System.out.println(user.getName() + " has not finished school");
//        }
    }
    // хто закінчив школу але не поступив

    public static void task10_1(List<User> users){
        List<User> usersWhoFinishedSchool = new ArrayList<>();
        for (User user : users) {
            for (Education education : user.getEducations()) {
                if (education instanceof SchoolEducation){
                    if (education.isFinished()){
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
                if (education instanceof UniversityEducation){
                    wentToUniversity = true;
                    break;
                }
            }

            if (!wentToUniversity){
                usersWhoDidNotWentToUniversity.add(user);
            }
        }
        System.out.println(usersWhoDidNotWentToUniversity);
    }
    public static void task10_2(List<User> users){
        List<User> usersWhoFinishedSchoolButDidNotWentToUniverstity = new ArrayList<>();
        for(User user : users){
            boolean finishedSchool = false, enteredHighSchool = false;
            for(Education education : user.getEducations()){
                if(education instanceof SchoolEducation){
                    if(education.isFinished()){
                        finishedSchool = education.isFinished();
                    }
                } else if (education instanceof UniversityEducation){
                    enteredHighSchool = true;
                }
            }
            if(finishedSchool && !enteredHighSchool){
                usersWhoFinishedSchoolButDidNotWentToUniverstity.add(user);
            }
        }
        System.out.println(usersWhoFinishedSchoolButDidNotWentToUniverstity);
    }
    // хто кинув уніер
    public static void task11(List<User> users){
        List<User> usersWhoIsNotFinishedUniversityEducation = new ArrayList<>();
        for (User user : users) {
            boolean isNotFinishedUniversityEducation = false;
            List<Education> educations = user.getEducations();
            for (Education education : educations) {
                if (education instanceof UniversityEducation){
                    if (education.isFinished()){
                        isNotFinishedUniversityEducation = true;
                        break;
                    }
                }

            }
            if (!isNotFinishedUniversityEducation){
                usersWhoIsNotFinishedUniversityEducation.add(user);
            }

        }
    }
    // хто закінчив універ
    public static void task12(List<User> users){
        List<User> userWhoFinishedUniversity = new ArrayList<>();
        for (User user : users) {
            for (Education education : user.getEducations()) {
                if (education instanceof UniversityEducation){
                    if (education.isFinished()){
                        userWhoFinishedUniversity.add(user);
                        break;
                    }
                }
            }

        }
        System.out.println(userWhoFinishedUniversity);

        for(User user : userWhoFinishedUniversity){
            System.out.println(user.getName() + " finished university");
        }


    }
    // хто закінчив кафедру ІКНІ і при цьому вчився в 32 школі

    public static void task13(List<User> users){
        List<User> usersWhoFinishedUniversity = new ArrayList<>();
        for (User user : users) {
            for (Education education : user.getEducations()) {

                if (education instanceof UniversityEducation){
                    if (education.isFinished()){
                        usersWhoFinishedUniversity.add(user);
                        break;
                        //                отримати поле з назвою універу
                    }
                }
            }

        }
    }
    // хто закінчив франика в середнім балом бльше 80
    // хто випустився в коронавірусний рік з універу лісотехнічного

    // хто переводився зі школи до школи
    // середню кількість вищих освіт в залежності від статі
    // кого частіше виганяли з школи в кожному році
    //
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
