package dao;

import model.AdDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdDetailsDao extends JpaRepository<AdDetail, Long> {

}
