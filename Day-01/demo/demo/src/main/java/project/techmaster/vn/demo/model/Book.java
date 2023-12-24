package project.techmaster.vn.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Book {
    private String id ;
    private String title ;
    private String author ;
    private int year ;

}
