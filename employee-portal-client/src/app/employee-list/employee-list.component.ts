import { Component, OnInit } from '@angular/core';
import { EmployeePortalService } from '../services/employee-portal.service';
import { Employee } from '../models/employee';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employeeList: Employee[];

  constructor(private employeeService: EmployeePortalService) { }

  ngOnInit() {
    this.employeeService.getAllEmployees().subscribe((data: Employee[]) => this.employeeList = data);
  }

}