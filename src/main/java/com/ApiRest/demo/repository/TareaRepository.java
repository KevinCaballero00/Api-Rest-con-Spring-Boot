package com.ApiRest.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ApiRest.demo.Model.Tarea;

@Repository
public interface TareaRepository extends JpaRepository <Tarea, Long>{

}
