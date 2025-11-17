import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {

    private Student student;
    private Exam exam;
    private double initialValue;
    private List<GradeHistory> history = new ArrayList<>();

    public Grade(Student student, Exam exam, double initialValue) {
        this.student = student;
        this.exam = exam;
        this.initialValue = initialValue;
    }

    public void addHistory(double newValue, Instant time, String reason) {
        history.add(new GradeHistory(newValue, time, reason));
    }

    // Récupère la note à un instant t
    public double getValueAt(Instant t) {
        double current = initialValue;
        for (GradeHistory h : history) {
            if (!h.getTimestamp().isAfter(t)) {
                current = h.getValue();
            }
        }
        return current;
    }

    public Student getStudent() { return student; }
    public Exam getExam() { return exam; }
}
