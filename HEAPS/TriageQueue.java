import java.util.PriorityQueue;

public class TriageQueue {
    PriorityQueue<Patient> triageQueue = new PriorityQueue<>((a, b) -> b.severity - a.severity); // max-heap by severity
    
    void addPatient(Patient p) {
        triageQueue.offer(p); 
    }
    
    Patient treatNext() {
        return triageQueue.poll(); 
    }
}
