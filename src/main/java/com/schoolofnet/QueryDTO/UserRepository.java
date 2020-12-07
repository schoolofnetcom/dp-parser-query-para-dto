package com.schoolofnet.QueryDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select new com.schoolofnet.QueryDTO.UserDTO(u.id, u.name) from User u where u.name = :name")
    List<UserDTO> findByNameDTO(@Param("name") String name);
}
