package za.ac.cput.repository;

public interface IRepository <T, ID> {

    T create(T t);
    T read(Long id);
    T update(T t);
    void delete(ID id);


}


