import {Component, OnInit} from '@angular/core';
import {UploadFileService} from '../upload-file.service';
import {Observable} from 'rxjs/Observable';

@Component({
    selector: 'list-upload',
    templateUrl: './list-upload.component.html',
    styleUrls: ['./list-upload.component.css']
})
export class ListUploadComponent implements OnInit {

    showFile = false;
    fileUploads: Observable<Photo[]>;

    constructor(private uploadService: UploadFileService) {
    }

    ngOnInit() {
        this.showFiles(true);
    }

    showFiles(enable: boolean) {
        this.showFile = enable;

        if (enable) {
            this.fileUploads = this.uploadService.getFiles();
        }
    }
}

class Photo {
    id: number;
    name: string;
}
