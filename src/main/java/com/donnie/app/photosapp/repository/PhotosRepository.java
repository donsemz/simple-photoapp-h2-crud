package com.donnie.app.photosapp.repository;

import com.donnie.app.photosapp.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {
}