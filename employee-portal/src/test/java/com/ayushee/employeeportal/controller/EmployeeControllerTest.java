package com.ayushee.employeeportal.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ayushee.employeeportal.EmployeePortalApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EmployeePortalApplication.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeControllerTest {
	
private MockMvc mockMvc;
	
	@Autowired
    private WebApplicationContext wac;

	@Before
	public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void verifyGetAllEmployees() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/employee/")
        .contentType(MediaType.APPLICATION_JSON)
       	.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
	
	@Test
	public void verifyAddEmployee() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.post("/employee/")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"firstname\" : \"Ayushee\" , \"lastname\" : \"Agarwal\" , \"gender\" : \"female\" , \"DOB\" : \"1994-07-18\" , \"department\" : \"IT\" }")
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}

}
