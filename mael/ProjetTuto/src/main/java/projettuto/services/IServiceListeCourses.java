package projettuto.services;

import java.util.List;

import projettuto.bean.Course;

public interface IServiceListeCourses {
	List<Course> rechercherCourses();
	void creerCourse(final String pLibelle, final Integer pQuantite);
	void supprimerCourse(final Integer pIdCourse);
	void modifierCourses(final List<Course> pListeCourses);
}