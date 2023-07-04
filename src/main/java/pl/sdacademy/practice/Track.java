package pl.sdacademy.practice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Track {

    private String artist;
    private String title;

}
