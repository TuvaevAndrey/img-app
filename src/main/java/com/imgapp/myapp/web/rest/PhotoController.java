package com.imgapp.myapp.web.rest;

import com.imgapp.myapp.domain.Photo;
import com.imgapp.myapp.repository.PhotoRepository;
import com.imgapp.myapp.service.PhotoService;
import com.imgapp.myapp.service.dto.PhotoRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotoController {

    private final PhotoRepository photoRepository;
    private final PhotoService photoService;

    public PhotoController(PhotoRepository photoRepository, PhotoService photoService) {
        this.photoRepository = photoRepository;
        this.photoService = photoService;
    }

    @GetMapping
    public List<Photo> getAllPhotos() {
        return photoRepository.findAll();
    }

    @PostMapping
    public Photo uploadPhoto(@RequestPart PhotoRequest request, @RequestParam MultipartFile file) {
        return photoService.uploadPhoto(request, file);
    }


}
