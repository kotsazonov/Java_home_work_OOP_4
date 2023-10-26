import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void editTeacher(int id, Teacher newTeacher) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                // Update teacher information
            }
        }
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}