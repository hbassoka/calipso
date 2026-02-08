package com.jdevhub.calipso.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;



public record AccountDto(Long id, String number, BigDecimal balance, LocalDateTime creationDate, CustomerDto customer) {

}
