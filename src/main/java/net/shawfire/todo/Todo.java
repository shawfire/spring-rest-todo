package net.shawfire.todo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Slf4j
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TODO")
public class Todo {

    @Id
    @GeneratedValue
    protected Long id;
    private String action;

}
