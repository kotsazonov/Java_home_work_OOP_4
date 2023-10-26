import java.util.List;
public class TeacherController {
    private TeacherService service = new TeacherService();
    private TeacherView view = new TeacherView();

    public void createTeacher(Teacher teacher) {
        service.addTeacher(teacher);
        view.showTeacher(teacher);
    }

    public void editTeacher(int id, Teacher teacher) {
        service.editTeacher(id, teacher);
        view.showTeacher(teacher);
    }

    public void displayAllTeachers() {
        List<Teacher> teachers = service.getAllTeachers();
        view.showAllTeachers(teachers);
    }
}
