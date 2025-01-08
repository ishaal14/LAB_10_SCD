// Immutable class for failed students
final class FailedStudent {
    private final int rollNumber;
    private final String subjectCode;
    private final String subjectName;

    public FailedStudent(int rollNumber, String subjectCode, String subjectName) {
        this.rollNumber = rollNumber;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }
}

// Mutable class for promoted students
class PromotedStudent {
    private int rollNumber;
    private String subjectCode;
    private String subjectName;

    public PromotedStudent(int rollNumber, String subjectCode, String subjectName) {
        this.rollNumber = rollNumber;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}


public class Main {
    public static void main(String[] args) {
       
        FailedStudent failedStudent = new FailedStudent(16, "SE101", "probability");
        System.out.println("Failed Student:");
        System.out.println("Roll Number: " + failedStudent.getRollNumber());
        System.out.println("Subject Code: " + failedStudent.getSubjectCode());
        System.out.println("Subject Name: " + failedStudent.getSubjectName());

      
        PromotedStudent promotedStudent = new PromotedStudent(10, "Se102", "Physics");
        System.out.println("\nPromoted Student (Before Update):");
        System.out.println("Roll Number: " + promotedStudent.getRollNumber());
        System.out.println("Subject Code: " + promotedStudent.getSubjectCode());
        System.out.println("Subject Name: " + promotedStudent.getSubjectName());

        
        promotedStudent.setSubjectCode("CS103");
        promotedStudent.setSubjectName("Chemistry");
        System.out.println("\nPromoted Student (After Update):");
        System.out.println("Roll Number: " + promotedStudent.getRollNumber());
        System.out.println("Subject Code: " + promotedStudent.getSubjectCode());
        System.out.println("Subject Name: " + promotedStudent.getSubjectName());
    }
}
