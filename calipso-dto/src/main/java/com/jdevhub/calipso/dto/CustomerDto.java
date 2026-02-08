package com.jdevhub.calipso.dto;

import java.time.LocalDateTime;
import java.util.List;


public record CustomerDto(Integer id, String firstname, String lastname, String email, LocalDateTime creationDate) {

}
