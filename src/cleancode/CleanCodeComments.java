package cleancode;

import java.security.acl.Owner;
import java.util.Date;
import java.util.List;

public class CleanCodeComments {

    public class Comments {

        // Good Comments
        // 1. Legal comments

        // Copyright (C) 2003,2004,2005 by Object Mentor, Inc. All rights reserved.
        // Released under the terms of the GNU General Public License version 2 or later.

        // 2. TODO comments
        // TODO this method should be removed with next release
        public void checkRelease() {
            // some business logic here
        }

        // 3. JavaDocs in public Api

        /**
         * <p> this method publishes results based on date
         * </p>
         *
         * @param date date from when results should be published
         * @return List of Result entities
         * @since 16.0
         */
        public List<Result> publishResults(Date date) {
            // some business logic here
            return null;
        }

        // Bad Comments
        // 1. Redundant, misleading, old comments
        // Redundant
        // this method delivers owner of testcase
        public Owner getTestcaseOwner(Testcase testcase) {
            return null;
        }

        // comment above not needed, since method reveals all intend

        // Misleading
        // returns hours in month
        public Hours getHoursInQuarter() {
            return null;
        }

        // incorrect comment

        // Old Comments
        // returns Admin of a group
        public User getPrivilegedUser() {
            return null;
        }

        // code has changed from returning admin to returning user with some privileges, but comment is still old one
        // 2. Commented-Out Code
        // Bad: who needs this commented method??
        //public void checkXMLParser(){
        //   // some business logic here
        //}
        // Good: here we knonw why we should not remove this method
        // This method will be used for User Story: see ticket Jira-456
        // public void checkXMLParser(){
        //   // some business logic here
        //}
        // 3. Too much information
        /*
         * This class evaluates the overview of testcases which are cancelled from client
         * the reasons of cancellation play a role in evaluation blablabla
         */
    }

    class Result {
    }

    class Hours {
    }

    class User {
    }

}
