package dao;

import models.ToDo;
import java.util.List;

public interface ToDoDao{
    //add
    void add(ToDo todo);

    //edit
    void edit(int id, String newContent);

    //complete
    void complete(int id, boolean isComplete);

    //delete
    void delete(int id);

    //all
    List<ToDo> all();
    List<ToDo> findByUser(int userId);
    List<ToDo> findByLabel(int labelId);
    List<ToDo> findByLabelAndUser(int labelId, int userId);

    //find
    ToDo find(int id);
}
