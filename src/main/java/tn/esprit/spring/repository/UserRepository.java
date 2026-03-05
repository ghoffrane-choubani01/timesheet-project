package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}





















//	int updateUserStatusForFirstName1(Integer status, String name);
	
//	@Modifying
//	@Query(value = "insert into Users (firstName, lastName, role) values (:fn, :ln, :role)", nativeQuery = true)
//	void insertUser(@Param("fn") String fn, @Param("ln") Integer ln, @Param("role") Integer role);
