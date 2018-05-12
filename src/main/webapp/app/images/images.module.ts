import {CUSTOM_ELEMENTS_SCHEMA, NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';

import {ImgAppSharedModule} from '../shared';
import {BrowserModule} from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import {ImagesComponent} from './images.component';
import {DetailsUploadComponent} from './details-upload/details-upload.component';
import {FormUploadComponent} from './form-upload/form-upload.component';
import {ListUploadComponent} from './list-upload/list-upload.component';
import {UploadFileService} from './upload-file.service';

import {imagesRoute} from './images.route';

@NgModule({
    declarations: [
        DetailsUploadComponent,
        FormUploadComponent,
        ListUploadComponent,
        ImagesComponent
    ],
    imports: [
        ImgAppSharedModule,
        RouterModule.forChild(imagesRoute),
        BrowserModule,
        HttpClientModule
    ],
    providers: [UploadFileService],
    schemas: [CUSTOM_ELEMENTS_SCHEMA],
    bootstrap: [ImagesComponent]
})
export class ImgAppImagesModule {
}
