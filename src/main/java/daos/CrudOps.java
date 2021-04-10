package daos;

import java.util.List;

public interface CrudOps<T> {

    public T findByNumber(int number);

    public List<T> findAll();

    public T update(T dto);

    public T create(T dto);

    public void delete(int number);
}
