package com.booktracker.mapper;

import com.booktracker.dto.BookTrackerDTO;
import com.booktracker.model.BookTracker;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookTrackerMapper {
    BookTrackerMapper INSTANCE = Mappers.getMapper(BookTrackerMapper.class);
    BookTrackerDTO toDTO(BookTracker tracker);
    BookTracker toEntity(BookTrackerDTO trackerDTO);
}

