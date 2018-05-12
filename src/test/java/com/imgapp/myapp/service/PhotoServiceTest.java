package com.imgapp.myapp.service;

import com.imgapp.myapp.ImgApp;
import com.imgapp.myapp.repository.PhotoRepository;
import com.imgapp.myapp.service.dto.PhotoRequest;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest(classes = ImgApp.class)
@RunWith(SpringRunner.class)
public class PhotoServiceTest {

    @Autowired
    private PhotoRepository repository;
    @Autowired
    private PhotoService photoService;

    @Test
    public void uploadTest() {
        MockMultipartFile file = new MockMultipartFile(
            "data", "filename.txt", "text/plain", "some xml".getBytes());

        PhotoRequest request = new PhotoRequest();
        //photoService.uploadPhoto(request,file);

        Assertions.assertThat(repository.findAll()).isNotEmpty();
    }

    @Test
    public void loadTest() {
        photoService.loadFile("surakat.jpg");
    }
}
