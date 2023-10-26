import java.util.List;
public class TeacherView {
    public void showTeacher(Teacher teacher) {
        System.out.println(teacher);
    }

    public void showAllTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            showTeacher(teacher);
        }
    }
}