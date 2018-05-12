import {Routes} from '@angular/router';
import {ImagesComponent} from './images.component';
import {UserRouteAccessService} from '../shared';

export const imagesRoute: Routes = [{
    path: 'images',
    component: ImagesComponent,
    data: {
        authorities: ['ROLE_USER'],
        pageTitle: 'Images'
    },
    canActivate: [UserRouteAccessService]
}];
