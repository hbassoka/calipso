package com.jdevhub.calipso.dto;

import java.time.LocalDateTime;
import java.util.List;


public record CustomerDto(Long id, String firstname, String lastname, String email, LocalDateTime creationDate) {

}
