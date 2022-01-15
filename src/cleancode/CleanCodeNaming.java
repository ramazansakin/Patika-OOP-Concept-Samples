//package cleancode;
//
//import java.net.URL;
//import java.util.Date;
//import java.util.List;
//
//public class CleanCodeNaming {
//
//    public static class Naming {
//
//        // 1. Use intention revealing names
//        // Good
//        public Date modifiedDate;
//
//        public List<Testcase> findAllTestcasesByUser(User user) {
//            return null;
//        }
//
//        // Bad
//        public Date d; // modified date
//
//        public List<Testcase> find(User user) {
//        }
//
//        // find all Testcases by User
//
//        // 2. Avoid misinformation
//        // Good
//        public List<Account> AccountList;
//
//        // Bad
//        public Account[] AccountList; // use Suffix List, if it is really a List
//
//        // 3. No need for prefixes
//        // Good
//        public void deleteUser(User user) {
//        }
//
//
//        // Bad
//        public void deleteUser(User pUser) {
//        }
//
//        // no need for prefix p for parameters
//
//        // 4. Avoid mental mapping
//        // Good
//        public URL url;
//        // Bad
//        public URL r; // not everybody would think r will be url
//
//        // 5. Class names should be noun, function names should be verb
//        // Good
//        public class TableRepresenter {
//        }
//
//        public void saveCar() {
//        }
//
//        // Bad
//        public class TableRepresent {
//        }
//
//        public void car() {
//        }
//
//        // unless it is constrcutor
//        // 6. Pick one word for concept
//        // Good
//        public void saveUser() {
//        }
//
//        void saveAccount() {
//        }
//
//        void saveContract() {
//        }
//
//        // Bad
//        public void saveUser() {
//        }
//
//        void createAccount() {
//        }
//
//        void generateContract() {
//        }
//
//        // 7. Use Solution Domain Names
//        // Good
//        public class AccountFactory {
//        } // Factory Pattern
//
//        public class AccountObserver {
//        } // Observer Pattern
//
//        // 8. Use Problem Domain Names
//        // Good
//        public class User user;
//
//        // taking "User" as a Use Case for same context
//        public String userName;
//
//        public void editUser(User user) {
//        }
//
//        // 9. Don't use too long namings
//        // Good
//        public void saveUnderage() {
//        }
//
//        public class UserFiller {
//        }
//
//        // Bad
//        public void saveIfUserUnder18() {
//        }
//
//        public class UserFormRealTimeFiller {
//        }
//
//        // 10. Use constants, enums instead of magic numbers, abbreviations
//        // Good
//        public enum Calendar {
//            DAYS_IN_YEAR(360),
//            HOURS_IN_WEEK(168)
//        }
//
//        // Bad
//        public int daysInYear = 360;
//        public int hoursInWeek = 168;
//    }
//
//    class Testcase {
//    }
//
//    class Account {
//    }
//
//}