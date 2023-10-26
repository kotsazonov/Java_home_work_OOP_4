public class Main {

    public static void main(String[] args) {
        TeacherController controller = new TeacherController();

        // Создание учителей
        Teacher teacher1 = new Teacher(1, "John Doe", "Mathematics");
        Teacher teacher2 = new Teacher(2, "Jane Smith", "Physics");

        // Добавление учителей
        controller.createTeacher(teacher1);
        controller.createTeacher(teacher2);

        // Отображение всех учителей
        controller.displayAllTeachers();

        // Редактирование информации об учителе
        Teacher updatedTeacher = new Teacher(1, "Johnathon Doe", "Mathematics");
        controller.editTeacher(1, updatedTeacher);

        // Отображение всех учителей после редактирования
        controller.displayAllTeachers();
    }
}