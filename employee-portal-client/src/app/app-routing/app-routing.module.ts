import { NgModule }              from '@angular/core';
import { RouterModule, Routes }  from '@angular/router';

import { EmployeeEditorComponent } from '../employee-editor/employee-editor.component';
import { EmployeeListComponent } from '../employee-list/employee-list.component';
import { PageNotFoundComponent } from '../page-not-found/page-not-found.component';

const appRoutes: Routes = [
  { path: 'list-all-employees', component: EmployeeListComponent },
  { path: 'register', component: EmployeeEditorComponent },
  { path: '',   redirectTo: '/register', pathMatch: 'full' },
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule {}
