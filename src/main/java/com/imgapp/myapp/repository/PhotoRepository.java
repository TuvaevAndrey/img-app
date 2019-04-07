package com.imgapp.myapp.repository;

import com.imgapp.myapp.domain.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
}
