package com.develhope.Api.Repositories;

import com.develhope.Api.ApiRestRepository02.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages")
public interface ProgramminLanguageRepositories extends JpaRepository<ProgrammingLanguage,Long> {
}
