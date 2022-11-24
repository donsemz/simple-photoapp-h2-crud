package com.donnie.app.photosapp.service;

import com.donnie.app.photosapp.model.Photo;
import com.donnie.app.photosapp.repository.PhotosRepository;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {
//    private Map<String, Photo> db = new HashMap<>(){
//        {
//            put("1", new Photo("1","Photo1.jpg"));
//            put("2", new Photo("2","Photo2.jpg"));
//        }
//    };
    private final PhotosRepository photosRepository;

    public PhotoService(PhotosRepository photosRepository) {
        this.photosRepository = photosRepository;
    }

    public Iterable<Photo> get() {
        return photosRepository.findAll();
    }

    public Photo get(Integer id) {
        return photosRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        photosRepository.deleteById(id);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(fileName);
        photo.setData(data);
        photosRepository.save(photo);
        return photo;
    }
}
