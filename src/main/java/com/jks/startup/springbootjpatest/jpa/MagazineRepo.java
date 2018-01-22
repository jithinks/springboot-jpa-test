package com.jks.startup.springbootjpatest.jpa;

import com.jks.startup.springbootjpatest.model.Magazine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MagazineRepo extends JpaRepository<Magazine, Long>{
}
