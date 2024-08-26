package com.glab30971.sp12;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import java.util.Optional;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "learningtutorials")
public interface TutorialRepository extends JpaRepository<Tutorial, Long>
// Tutotial > Entity type and long-> Primary key
{
    // fingByPublished is a custome method()
    List<Tutorial> findByPublished(boolean published);

}
