package dev.gonzales.firstAPI.run;

import java.time.LocalDateTime;

public record Run(Integer id, String title, LocalDateTime StartedOn, LocalDateTime CompletedOn, Integer miles, Location location) {

}

