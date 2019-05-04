package academy.devdojo.repositories;

import academy.devdojo.models.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> { }
