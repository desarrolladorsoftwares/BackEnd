package com.SYS_STORAGE.main.repositories;

import com.SYS_STORAGE.main.entities.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonalRepository extends JpaRepository<Personal,Integer> {
}
