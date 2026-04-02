package com.example;

public class ScholarshipManager {
    /**
     * Determines if a student is eligible for a scholarship.
     * Criteria: GPA >= 3.8 AND Extracurriculars >= 2 AND Service Hours >= 50
     */
    public boolean isEligible(double gpa, int extracurriculars, int serviceHours) {
        if (gpa >= 3.8 && extracurriculars >= 2 && serviceHours >= 50) {
            return true;
        }
        return false;
    }

    /**
     * Categorizes scholarship level based on performance.
     */
    public String getScholarshipLevel(double gpa) {
        if (gpa >= 3.9) return "Full Scholarship";
        if (gpa >= 3.7) return "Partial Scholarship";
        return "Not Eligible";
    }
}
