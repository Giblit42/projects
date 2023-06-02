import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GraderTest {


    @Test
    void nintyNineGradeIsA() {
        Grader grade = new Grader();
        assertEquals('A', grade.determineLeterGrade(99));
    }
    @Test
    void nintyGradeIsA() {
        Grader grade = new Grader();
        assertEquals('A', grade.determineLeterGrade(90));
    }
    @Test
    void eightyNineGradeIsB() {
        Grader grade = new Grader();
        assertEquals('B', grade.determineLeterGrade(89));
    }
    @Test
    void eightyGradeIsB() {
        Grader grade = new Grader();
        assertEquals('B', grade.determineLeterGrade(80));
    }
    @Test
    void seventyNineGradeIsC() {
        Grader grade = new Grader();
        assertEquals('C', grade.determineLeterGrade(79));
    }
    @Test
    void seventyGradeIsC() {
        Grader grade = new Grader();
        assertEquals('C', grade.determineLeterGrade(70));
    }
    @Test
    void sixtyNineGradeIsD() {
        Grader grade = new Grader();
        assertEquals('D', grade.determineLeterGrade(69));
    }
    @Test
    void sixtyGradeIsD() {
        Grader grade = new Grader();
        assertEquals('D', grade.determineLeterGrade(60));
    }
    @Test
    void fiftyNineGradeIsF() {
        Grader grade = new Grader();
        assertEquals('F', grade.determineLeterGrade(59));
    }
    @Test
    void fiftyGradeIsF() {
        Grader grade = new Grader();
        assertEquals('F', grade.determineLeterGrade(50));
    }
    @Test
    void zeroShouldReturnF() {
        Grader grade = new Grader();
        assertEquals('F', grade.determineLeterGrade(0));
    }
    @Test
    void negativeShouldThrowException() {
        Grader grade = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grade.determineLeterGrade(-1);
        });
    }
    
}
