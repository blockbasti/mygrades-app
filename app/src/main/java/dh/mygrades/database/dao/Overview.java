package dh.mygrades.database.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "OVERVIEW".
 */
public class Overview {

    private Long overviewId;
    private Double average;
    private Integer participants;
    private Integer section1;
    private Integer section2;
    private Integer section3;
    private Integer section4;
    private Integer section5;
    private Integer userSection;
    private String gradeEntryHash;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Overview() {
    }

    public Overview(Long overviewId) {
        this.overviewId = overviewId;
    }

    public Overview(Long overviewId, Double average, Integer participants, Integer section1, Integer section2, Integer section3, Integer section4, Integer section5, Integer userSection, String gradeEntryHash) {
        this.overviewId = overviewId;
        this.average = average;
        this.participants = participants;
        this.section1 = section1;
        this.section2 = section2;
        this.section3 = section3;
        this.section4 = section4;
        this.section5 = section5;
        this.userSection = userSection;
        this.gradeEntryHash = gradeEntryHash;
    }

    public Long getOverviewId() {
        return overviewId;
    }

    public void setOverviewId(Long overviewId) {
        this.overviewId = overviewId;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Integer getParticipants() {
        return participants;
    }

    public void setParticipants(Integer participants) {
        this.participants = participants;
    }

    public Integer getSection1() {
        return section1;
    }

    public void setSection1(Integer section1) {
        this.section1 = section1;
    }

    public Integer getSection2() {
        return section2;
    }

    public void setSection2(Integer section2) {
        this.section2 = section2;
    }

    public Integer getSection3() {
        return section3;
    }

    public void setSection3(Integer section3) {
        this.section3 = section3;
    }

    public Integer getSection4() {
        return section4;
    }

    public void setSection4(Integer section4) {
        this.section4 = section4;
    }

    public Integer getSection5() {
        return section5;
    }

    public void setSection5(Integer section5) {
        this.section5 = section5;
    }

    public Integer getUserSection() {
        return userSection;
    }

    public void setUserSection(Integer userSection) {
        this.userSection = userSection;
    }

    public String getGradeEntryHash() {
        return gradeEntryHash;
    }

    public void setGradeEntryHash(String gradeEntryHash) {
        this.gradeEntryHash = gradeEntryHash;
    }

    // KEEP METHODS - put your custom methods here

    /**
     * Gets the amount of an section as int.
     * @param section The section to get
     * @return The amount of the section
     */
    public int getSection(int section) {
        switch (section) {
            case 1:
                return nullToZero(section1);
            case 2:
                return nullToZero(section2);
            case 3:
                return nullToZero(section3);
            case 4:
                return nullToZero(section4);
            case 5:
                return nullToZero(section5);
        }
        // if a wrong section is passed return 0
        return 0;
    }

    /**
     * Converts null to zero or returns the given value.
     * @param n The Integer object
     * @return 0 if it is null or the value as int
     */
    private int nullToZero(Integer n) {
        return n == null ? 0 : n;
    }

    /**
     * Updates Overview with values from other Overview.
     * @param other Overview from which values should get updated
     */
    public void updateOverviewFromOther(Overview other) {
        this.average = other.average;
        this.participants = other.participants;
        this.section1 = other.section1;
        this.section2 = other.section2;
        this.section3 = other.section3;
        this.section4 = other.section4;
        this.section5 = other.section5;
        this.userSection = other.userSection;
    }

    /**
     * Returns the section with most students.
     *
     * @return max section as int
     */
    public int getMaxSection() {
        int max = section1;
        max = section2 > max ? section2 : max;
        max = section3 > max ? section3 : max;
        max = section4 > max ? section4 : max;
        max = section5 > max ? section5 : max;
        return max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Overview overview = (Overview) o;

        if (average != null ? !average.equals(overview.average) : overview.average != null)
            return false;
        if (participants != null ? !participants.equals(overview.participants) : overview.participants != null)
            return false;
        if (section1 != null ? !section1.equals(overview.section1) : overview.section1 != null)
            return false;
        if (section2 != null ? !section2.equals(overview.section2) : overview.section2 != null)
            return false;
        if (section3 != null ? !section3.equals(overview.section3) : overview.section3 != null)
            return false;
        if (section4 != null ? !section4.equals(overview.section4) : overview.section4 != null)
            return false;
        if (section5 != null ? !section5.equals(overview.section5) : overview.section5 != null)
            return false;
        return !(userSection != null ? !userSection.equals(overview.userSection) : overview.userSection != null);

    }

    @Override
    public int hashCode() {
        int result = average != null ? average.hashCode() : 0;
        result = 31 * result + (participants != null ? participants.hashCode() : 0);
        result = 31 * result + (section1 != null ? section1.hashCode() : 0);
        result = 31 * result + (section2 != null ? section2.hashCode() : 0);
        result = 31 * result + (section3 != null ? section3.hashCode() : 0);
        result = 31 * result + (section4 != null ? section4.hashCode() : 0);
        result = 31 * result + (section5 != null ? section5.hashCode() : 0);
        result = 31 * result + (userSection != null ? userSection.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Overview{" +
                "overviewId=" + overviewId +
                ", average=" + average +
                ", participants=" + participants +
                ", section1=" + section1 +
                ", section2=" + section2 +
                ", section3=" + section3 +
                ", section4=" + section4 +
                ", section5=" + section5 +
                ", userSection=" + userSection +
                '}';
    }
    // KEEP METHODS END

}