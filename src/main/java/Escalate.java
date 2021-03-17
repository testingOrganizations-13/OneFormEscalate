import td.api.CustomAttribute;
import td.api.TDException;
import td.api.TeamDynamix;
import td.api.Ticket;

import java.rmi.server.UID;
import java.util.ArrayList;

public class Escalate {

    /**
     * One Switch To Rule Them All
     */
    public static String oneSwitchToRuleThemAll(int tagValueID) {

        String uid = "";
        
        switch (tagValueID) {
            // One From -> General
            case 31877: // Alumni Office
            case 31878: // Bowling/Skating
            case 31879: // BSC (about the Support Center)
            case 31881: // Catering
            case 31882: // Center Stage
            case 31880: // Continuing Endorsement
                // TODO: There are 2 Counseling Center Tags?????
            case : // Counseling Center
            case 31883: // Covid-19 (Coronavirus) Concerns
            case 31884: // Devotional
            case 31885: // Direct to Employee
            case 31886: // Disability Services
            case 31887: // Donations
            case 31888: // Event Services
            case 31889: // Executive Offices
            case 31890: // Express Print & Copy (Small and Quick Jobs)
            case 36079: // Faculty Technology Center
            case 31919: // Fitness/Wellness Center
            case 31891: // Food Services
            case 31892: // Gave Directions To Location
            case 34471: // Health Center
            case 31895: // Hours of operations
                // TODO: Honor office vs Honors???
            case 31893: // Honor Office
            case 31894: // Housing Office
            case 33587: // HR: Employment Verification
            case 31896: // HR: Human Resources
            case 31902: // HR: Online Employment & Scheduling
            case 33585: // HR: Student Employment
            case 33588: // Tuition Waiver
            case 33586: // HR: Workday
            case 31897: // International Services
            case 31898: // International Study Program
            case 31900: // Lost and Found Questions (Not Transferred)
                uid = "NULL";
            case 31901: // myBYUI Student Portal (New)
            case 31903: // ORC (Outdoor Resource Center)
            case 34757: // Pathway Connect Issues
            case 31805: // Planetarium
            case 31904: // Print & Copy Services
            case 31905: // Radio/KBYi
            case 31906: // ROTC
            case 31907: // Safety & Security
            case 31908: // Scheduling Office
            case 33593: // Scroll Office
            case 31909: // Sexual Misconduct
            case 31910: // Stores & Receiving
            case 31911: // Student Activities
            case 31912: // Student Support
            case 31913: // Surplus Sale
            case 31915: // Ticket Office
            case 31916: // Travel Office
            case 31917: // University Relations
            case 31918: // University Texting
            case 31920: // Zimride

            // One Form -> Facilities
            case : // Art Department
            case : // Automotive
            case : // Career Services
            case : // College of Agriculture and Life Sciences (NOT ADVISING)
            case : // College of Business and Communications (NOT ADVISING)
            case : // College of Education and Human Development (NOT ADVISING)
            case : // College of Language & Letters (NOT ADVISING)
            case : // College of Performing & Visual Arts (NOT ADVISING)
            case : // College of Physical Sciences & Engineering (NOT ADVISING)
            case : // Dean of Students
            case : // Field Services (Student Teaching Placement)
            case : // Instructor Complaint or Grievance
            case : // Internship Questions
            case : // Math Dept.
            case : // Nursing-On Campus (pre-Licensre BSC)
            case : // Nursing-Online (RN to BSN)
            case : // Office of General Education (NOT ADVISING)
            case : // Office of Interdisciplinary Studies (NOT ADVISING)
            case : // Positive Instructor Feedback
            case : // Proctorio
            case : // Religion Dept.
            case : // Testing Center
            case : // Tutoring (Academic Support Center)

                // One Form -> Academic
            case : // Access Control/Locks & Keys
            case : // Custodial
            case : //  Facilities/Grounds
            case : // Fleet Services
            case : // Gardens
            case : // Hart Equipment Room/ Pool/ Fitness Center
            case : //     Library
            case : // Livestock Center
            case : //  Mail Services
            case : // Maps
            case : //         Orchard
            case : //  Parking Services
            case : // Plant Shop

                // Other
        }

        return uid;
    }
}