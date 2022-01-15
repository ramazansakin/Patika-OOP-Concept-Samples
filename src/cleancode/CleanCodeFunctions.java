//package cleancode;
//
//import org.omg.CORBA.Environment;
//import sun.net.ftp.FtpDirEntry;
//
//import java.util.Date;
//import java.util.List;
//
//public class CleanCodeFunctions {
//
//    public class Functions {
//        // 1. Do one thing
//        // Bad
//        public void saveCashFlow(Income income, Expense expense) {
//            incomeRepository.save(income);
//            expenseRepository.save(expense);
//        }
//
//        // Good
//        public void saveIncome(Income income) {
//            incomeRepository.save(income);
//        }
//
//        public void saveExpense(Expense expense) {
//            expenseRepository.save(expense);
//        }
//
//        // 2. One level of abstraction per function
//        // avoid this:
//        // following method is exposing a rest endpoint in higher level of abstraction
//        // on the other hand it also saves user in much lower level of abstraction
//        // This function should only expose rest endpoint and delegate another lower level service to save data in database
//        // Bad
//        public User saveUser(User user) {
//            return userRepository.save(user);
//        }
//
//        // Good
//        public User saveUser(User user) {
//            return userService.save(user);
//        }
//
//        // method in UsersService
//        public User save(User user) {
//            return userRepository.save(user);
//        }
//
//        // 3. Reading code from top to bottom
//        public void bulkUpdateUser(List<User> users) {
//            // get Users from repository
//            // update all Users one by one
//            // save Users List in repository
//        }
//
//        // 4. Function arguments
//        public void save() {
//        }
//
//        // good
//        public void saveUser(User user) {
//        }
//
//        // tolerable
//        public void saveUser(String userName, User user) {
//        }
//
//        // tolerable
//        public void saveUser(String userName, User user, Date date) {
//        }
//
//        // should be avoided, Date can be property of User Object
//
//        public void saveUser(String userName, User user, Date date, boolean isAdmin) {
//        }
//
//        // should be avoided, isAdmin can be property of User Object
//
//        // 5. No side effects
//        public User saveUser(User user) {
//            // if statement should be avoided, why saveUser action is changing role of a user?
//            if (user.isAdmin) {
//                user.setRole(user);
//            }
//            return userRepository.save(user);
//        }
//
//        // 6. Avoid Duplicates
//        // Bad
//        public Environment getEnvironment() {
//            String version = versionService.getVersion();
//            return environmentService.getEnvironment(version);
//        }
//
//        public Release getRelease() {
//            String version = versionService.getVersion();
//            return releaseService.getRelease(version);
//        }
//
//        // Good
//        public Environment getEnvironment() {
//            return environmentService.getEnvironment(getVersion());
//        }
//
//        public Release getRelease() {
//            return releaseService.getRelease(getVersion());
//        }
//
//        private String getVersion() { // so changes in versionService will be done one time instead of changing two methods
//            return versionService.getVersion();
//        }
//
//        // 7. Avoid transitive navigations
//        // Avoid this kind transitive dependency, instead of this create one get priveleges() method in Group class
//        List<Privilege> privileges = getGroup().getUser().getRole().getPrivileges();
//
//        private FtpDirEntry getGroup() {
//            return null;
//        }
//
//    }
//
//
//    Object incomeRepository;
//    Object expenseRepository;
//    Object userRepository;
//    Object userService;
//    Object versionService;
//    Object environmentService;
//    Object releaseService;
//
//    class User {
//
//        public boolean isAdmin;
//
//        public void setRole(User user) {
//        }
//    }
//
//    class Privilege {
//    }
//
//    class Income {
//    }
//
//    class Expense {
//    }
//
//    class Release {
//    }
//}
