package com.globant.agilepodmaster.widget;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface WidgetRepository extends PagingAndSortingRepository<Widget, Long> {
}
