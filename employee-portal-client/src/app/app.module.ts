import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing/app-routing.module';

import { AppComponent } from './app.component';
import { HelloComponent } from './hello.component';
import { EmployeeEditorComponent } from './employee-editor/employee-editor.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EmployeePortalService } from './services/employee-portal.service';
import { NavbarComponent } from './navbar/navbar.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

@NgModule({
  imports: [BrowserModule, FormsModule, HttpClientModule, AppRoutingModule, ReactiveFormsModule, FormsModule],
  declarations: [AppComponent, HelloComponent, EmployeeEditorComponent, EmployeeListComponent, NavbarComponent, PageNotFoundComponent],
  bootstrap: [AppComponent],
  providers: [EmployeePortalService]
})
export class AppModule { }
