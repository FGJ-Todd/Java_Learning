package classroom.epet.Dao;

import classroom.epet.entity.Pet;

import java.util.List;

public interface PetDao {
    int save(Pet pet);
    int update(Pet pet);
    int del(Pet pet);
    int getByName(String name);
    List<Pet> findByName(String name);
    List<Pet> findByType(String name);

}
