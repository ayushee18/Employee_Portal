import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from '../models/employee';

@Injectable()
export class EmployeePortalService {

  serviceUrl = 'http://localhost:8080/employee';

  constructor(private httpClient: HttpClient) { }

  registerEmployee(employee: Employee) {
    return this.httpClient.post(this.serviceUrl , employee);
  }

  getAllEmployees() {
    return this.httpClient.get(this.serviceUrl);
  }

}