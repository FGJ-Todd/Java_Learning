package classroom.epet.Dao.impl;

import classroom.epet.Dao.BaseDao;
import classroom.epet.Dao.PetDao;
import classroom.epet.entity.Pet;

import java.sql.*;
import java.util.List;

public class PetDaoSQLServerImplement extends BaseDao implements PetDao {


    @Override
    public int save(Pet pet) {
        String sql = "insert into (name) pet value ('李明') where = ?";
        Object [] param = {pet.getId()};
        int result = this.executeUpdate(sql,param);
        return 0;
    }

    @Override
    public int update(Pet pet) {
        String sql = "update pet set status=0 where id=?";
        Object [] param = {pet.getId()};
        int result = this.executeUpdate(sql,param);
        return 0;
    }

    @Override
    public int del(Pet pet) {
        return 0;
    }

    @Override
    public int getByName(String name) {
        return 0;
    }

    @Override
    public List<Pet> findByName(String name) {
        return List.of();
    }

    @Override
    public List<Pet> findByType(String name) {
        return List.of();
    }
}
