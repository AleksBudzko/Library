package com.booktracker.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookTrackerDTO {
    private Long id;
    private Long bookId;
    private String status;
    private LocalDateTime borrowedAt;
    private LocalDateTime returnBy;
}

