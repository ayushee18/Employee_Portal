import { Component, OnInit } from '@angular/core';
import { EmployeePortalService } from '../services/employee-portal.service';
import { Employee } from '../models/employee';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-employee-editor',
  templateUrl: './employee-editor.component.html',
  styleUrls: ['./employee-editor.component.css']
})
export class EmployeeEditorComponent implements OnInit {

  message: string;

  empolyeeForm = new FormGroup({
    firstname: new FormControl(''),
    lastname: new FormControl(''),
    gender: new FormControl(''),
    DOB: new FormControl(''),
    department: new FormControl('')
  });

  constructor(private employeeService: EmployeePortalService) { }

  ngOnInit() { }

  registerEmployee() {
    let employee = this.empolyeeForm.value;
    this.employeeService.registerEmployee(employee).subscribe(result => this.message = result['message']);
  }

}