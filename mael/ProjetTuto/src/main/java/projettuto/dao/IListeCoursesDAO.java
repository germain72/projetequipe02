package projettuto.dao;

import java.util.List;

import projettuto.bean.Course;

public interface IListeCoursesDAO {
	List<Course> rechercherCourses();
	void creerCourse(final Course pCourse);
	void supprimerCourse(final Course pCourse);
	void modifierCourse(final Course pCourse);
}